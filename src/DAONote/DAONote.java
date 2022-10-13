/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAONote;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import Model.Note;
import java.sql.Statement;
import java.util.ArrayList;

public class DAONote extends DAOMain<Note> {

    public int add(Note e) throws SQLException {
        int numRows = 0;
        Connection con = getConnection();

        String query = "INSERT INTO note (title, description, status, priority, autodelete, date)"
                + "VALUES ('" + e.getTitle() + "','" + e.getDescription() + "'," + e.isStatus() + ",'" + e.getPriority() + "'," + false + ",'" + e.getDate() + "')";

        Statement statement = con.createStatement();
        numRows = statement.executeUpdate(query);
        statement.close();
        closeConnection(con);
        return numRows;
    }

    public int delete(String condition) throws SQLException {
        int numRows = 0;
        Connection con = getConnection();

        String query = "DELETE FROM note WHERE " + condition;

        Statement statement = con.createStatement();
        numRows = statement.executeUpdate(query);
        statement.close();
        closeConnection(con);
        return numRows;
    }

    public int modify(Note e, String condition) throws SQLException {
        int numRows = 0;
        Connection con = getConnection();

        String orden = "UPDATE note SET "
                + " title='" + e.getTitle() + "',"
                + "description='" + e.getDescription() + "',"
                + "status = " + e.isStatus() + ","
                + "priority = " + e.getPriority() + ","
                + "autodelete = " + false + ","
                + "date = '" + e.getDate() + "'"
                + " WHERE " + condition;

        Statement sentencia = con.createStatement();
        numRows = sentencia.executeUpdate(orden);
        sentencia.close();
        closeConnection(con);
        return numRows;
    }

    public int modifyStatus(boolean value, String condition) throws SQLException {
        int numRows = 0;
        Connection con = getConnection();

        String orden = "UPDATE note SET status= " + value + " WHERE " + condition;

        //System.out.println(orden);
        Statement sentencia = con.createStatement();
        numRows = sentencia.executeUpdate(orden);
        sentencia.close();
        closeConnection(con);
        return numRows;
    }

    public ArrayList<Note> query(String condition) throws SQLException {
        ArrayList<Note> list = new ArrayList<Note>();
        Note e;
        Connection con = getConnection();
        String orden = "SELECT * FROM note "
                + (condition == null || condition.length() == 0 ? "" : "WHERE " + condition) + " ORDER BY priority DESC;";

        //System.out.println(orden);
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery(orden);
        while (rs.next()) {
            e = new Note(rs.getInt("id"), rs.getString("title"), rs.getString("description"), rs.getString("date"), rs.getInt("priority"), rs.getBoolean("status"));
            list.add(e);
        }
        statement.close();
        closeConnection(con);
        return list;
    }

    public ArrayList<Note> queryDate(String condition) throws SQLException {
        ArrayList<Note> list = new ArrayList<Note>();
        Note e;
        Connection con = getConnection();
        String orden = "SELECT * FROM note "
                + (condition == null || condition.length() == 0 ? "" : "WHERE " + condition) + " ORDER BY date;";

        //System.out.println(orden);
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery(orden);
        while (rs.next()) {
            e = new Note(rs.getInt("id"), rs.getString("title"), rs.getString("description"), rs.getString("date"), rs.getInt("priority"), rs.getBoolean("status"));
            list.add(e);
        }
        statement.close();
        closeConnection(con);
        return list;
    }

    public ArrayList<Note> querySearch(String condition) throws SQLException {
        ArrayList<Note> list = new ArrayList<Note>();
        Note e;
        Connection con = getConnection();
        String orden = "SELECT * FROM note "
                + (condition == null || condition.length() == 0 ? "" : "WHERE title LIKE '%" + condition + "%' ");
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery(orden);
        while (rs.next()) {
            e = new Note(rs.getInt("id"), rs.getString("title"), rs.getString("description"), rs.getString("date"), rs.getInt("priority"), rs.getBoolean("status"));
            list.add(e);
        }
        statement.close();
        closeConnection(con);
        return list;
    }

}

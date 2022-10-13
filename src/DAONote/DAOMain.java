/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAONote;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public abstract class DAOMain<T> {

    private String host ="sql5.freemysqlhosting.net:3306";
    private String bd="sql5526146";
    private String login="sql5526146";
    private String password="drvjCIh2uH";
    private boolean readyDriver;

    public DAOMain() {
        loadDriver();
   }

    public void loadDriver(){
        try {
            if ( !readyDriver ) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                readyDriver = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection(String host, String bd, String login, String password){
        Connection connection=null;
        String urlConexion = "jdbc:mysql://"+ host +"/" + bd + 
            "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        try {
            connection=DriverManager.getConnection(urlConexion, login, password);
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

     public Connection getConnection(){
        return getConnection(host, bd, login, password );
    }

    public void closeConnection(Connection con){
        try {
            if ( con != null )
                if ( !con.isClosed() ) 
                    con.close();
        } catch (SQLException e) { e.printStackTrace(); }
    }


    public abstract int add(T entity)throws SQLException;

    public abstract int delete(String condition)throws SQLException;

    public abstract int modify(T entity, String condition)throws SQLException;

    public abstract ArrayList<T> query(String condition)throws SQLException;

      public String getHost() {
        return host;
    }

    public String getBd() {
        return bd;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public boolean isreadyDriver() {
        return readyDriver;
    } 
}  

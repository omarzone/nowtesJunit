package DAONote;

import Model.Settings;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.ResultSet;




public class DAOSettings extends DAOMain<Settings> {

   

    public int modify(boolean isDarkThemeOn) throws SQLException {
        int numRows = 0;
        Connection con = getConnection();
        
        String orden = "UPDATE settings SET darktheme = " + isDarkThemeOn;
        Statement sentencia = con.createStatement();
        numRows = sentencia.executeUpdate(orden);
        sentencia.close();
        closeConnection(con);
        return numRows;
    }
    
//    public boolean getTheme() throws SQLException {
//        Connection con = getConnection();
//        boolean isThemeDarkOn;
//        ResultSet rs = null;
//        
//        String orden = "SELECT * FROM settings WHERE id = 1";
//        try (Statement sentencia = con.createStatement()) {
//             rs = sentencia.executeQuery(orden);
//             if(rs.next()){
//                isThemeDarkOn = rs.getBoolean("darktheme");
//                 return isThemeDarkOn;
//             }
//        }
//        return false;
//    }

    
    public int add(Settings entity) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public int delete(String condition) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public int modify(Settings settingsUser, String condition) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int modifySpecific(String config, boolean value) throws SQLException {
         int numRows = 0;
        Connection con = getConnection();
        
        String orden = "UPDATE settings SET " +config +"= "+ value;

        //System.out.println(orden);
        Statement sentencia = con.createStatement();
        numRows = sentencia.executeUpdate(orden);
        sentencia.close();
        closeConnection(con);
        return numRows;
    }
    
      public int DeleteAll() throws SQLException {
         int numRows = 0;
        Connection con = getConnection();
        
        String orden = "TRUNCATE TABLE note";

        Statement sentencia = con.createStatement();
        numRows = sentencia.executeUpdate(orden);
        sentencia.close();
        closeConnection(con);
        return numRows;
    }

    
    public ArrayList<Settings> query(String condition) throws SQLException {
        ArrayList<Settings> list = new ArrayList<Settings>();
        Settings e;
        Connection con = getConnection();
        String orden = "SELECT * FROM settings ";
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery(orden);
        while (rs.next()) {
            e = new Settings(rs.getBoolean("darktheme"),rs.getBoolean("priorityorder"));
            list.add(e);
        }
        statement.close();
        closeConnection(con);
        return list;
    }

    

 
   
}

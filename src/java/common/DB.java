package common;

import java.sql.*;

public class DB {
    public static Connection connector() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hrsystem" , "root" , "");
        Statement stmt = conn.createStatement();

        return conn;
    }
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        DB s = new DB(); 
        System.out.println(s);
    }
    
}
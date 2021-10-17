package ch04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenerateConnections {
    public static Connection getConnetcion() {
       try{
           final String url = "jdbc:mysql://localhost";
           final String user = "root";
           final String password = "1234567";

           return DriverManager.getConnection(url, user, password);
       } catch (SQLException e) {
           throw new RuntimeException(e);
       }

    }
}

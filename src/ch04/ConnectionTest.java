package ch04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
    public static void main(String[] args) throws SQLException {

        // Will represent where we're accessing the database

        // <javaapi>:<driver>://<server>:<port>
        final String url = "jdbc:mysql://localhost";

        final String user = "root";
        final String password = "1234567";

        // imports from java.sql
        Connection connection = DriverManager
                .getConnection(url, user, password);

        System.out.println("Successfully connected");

        connection.close();
    }
}

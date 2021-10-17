package ch04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GenerateDatabases {
    public static void main(String[] args) throws SQLException {

        final String url = "jdbc:mysql://localhost";
        final String user = "root";
        final String password = "1234567";

        Connection connection = DriverManager
                .getConnection(url, user, password);

        Statement stmt = connection.createStatement();

        // Creating sql database
        stmt.execute("CREATE DATABASE IF NOT EXISTS java_refresher");

        // DROP deletes database

        System.out.println("Successfully generated database");
        connection.close();

    }
}

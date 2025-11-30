package org.example.jdbcCore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        String databaseURL = "jdbc:mysql://localhost:3306/testdb";
        String databaseUser = "root";
        String databasePassword = "123456789";

        String createTable = """
                CREATE TABLE employee(
                id INT (20) PRIMARY KEY AUTO_INCREMENT,
                name VARCHAR (200) NOT NULL,
                email VARCHAR (200) NOT NULL
                )
                """;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(databaseURL, databaseUser, databasePassword);

            Statement stmt = conn.createStatement();
            stmt.executeUpdate(createTable);
            System.out.println("Table Created Successfully");

            conn.close();
            System.out.println("Connection Closed ! ! !");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

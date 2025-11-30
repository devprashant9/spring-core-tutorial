package org.example.jdbcCore;

import java.sql.Connection;
import java.sql.DriverManager;

public class EstablishConnection {
    public static void main(String[] args) {
        String databaseURL = "jdbc:mysql://localhost:3306/testdb";
        String userName = "root";
        String password = "123456789";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(databaseURL, userName, password);
            if(!conn.isClosed()) {
                System.out.println("Successfully Connected to MySQL Database");
            } else {
                System.out.println("Connection to DB Failed");
            }

            conn.close();
            System.out.println("Connection Closed ! ! !");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

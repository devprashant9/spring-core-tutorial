package org.example.jdbcCore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData {
    public static void main(String[] args) {
        String databaseURL = "jdbc:mysql://localhost:3306/testdb";
        String databaseUser = "root";
        String databasePassword = "123456789";

        String insertData = """
                INSERT INTO employee(name, email) VALUE (?, ?);
                """;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(databaseURL, databaseUser, databasePassword);
            if (!conn.isClosed()) {
                PreparedStatement stmt = conn.prepareStatement(insertData);
                stmt.setString(1, "Prashant Kumar Jha");
                stmt.setString(2, "kumarjha183@gmail.com");

                stmt.executeUpdate();
                System.out.println("Data Inserted Successfully");
            } else {
                System.out.println("Connection to DB Failed");
            }
            conn.close();
            System.out.println("Connection Closed Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

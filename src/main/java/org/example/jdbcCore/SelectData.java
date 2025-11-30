package org.example.jdbcCore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectData {
    public static void main(String[] args) {
        String databaseURL = "jdbc:mysql://localhost:3306/testdb";
        String databaseUser = "root";
        String databasePassword = "123456789";

        String getData = """
                Select * FROM employee
                """ ;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(databaseURL, databaseUser, databasePassword);
            if(!conn.isClosed()) {
                Statement stmt = conn.createStatement();
                ResultSet resultSet = stmt.executeQuery(getData);
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt(1));
                    System.out.println(resultSet.getString(2));
                    System.out.println(resultSet.getString(3));
                }
            } else {
                System.out.println("Connection to DB Failed");
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

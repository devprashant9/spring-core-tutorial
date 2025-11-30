package org.example.jdbcCore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateData {
    public static void main(String[] args) {
        String databaseURL = "jdbc:mysql://localhost:3306/testdb";
        String databaseUser = "root";
        String databasePassword = "123456789";

        String updateString = """
                UPDATE employee SET name=?, email=?
                """ ;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(databaseURL, databaseUser, databasePassword);
            if(!conn.isClosed()) {
                PreparedStatement stmt = conn.prepareStatement(updateString);
                stmt.setString(1, "Prashant Kumar");
                stmt.setString(2, "test@gmail.com");

                stmt.executeUpdate();
                System.out.println("Data Updated Successfully");
            } else {
                System.out.println("Connection to DB Failed");
            }
                conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

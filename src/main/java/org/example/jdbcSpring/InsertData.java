package org.example.jdbcSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class InsertData {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springJDBC.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");

        String insertData = """
                INSERT INTO spring_jdbc VALUE (?, ?, ?)
                """;

        int result = jdbcTemplate.update(insertData, 2, "Spring JDBC 2", "springJDBC@gmail.com 2");
        System.out.println("Results Affected: " +result);
        System.out.println("Data Inserted Successfully");
    }
}

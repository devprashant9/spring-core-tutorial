package org.example.jdbcSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class CreateTable {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springJDBC.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");

        String createTable = """
                CREATE TABLE IF NOT EXISTS spring_jdbc(
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    name VARCHAR(255),
                    email VARCHAR(100)
                )
                """ ;

        jdbcTemplate.update(createTable);
        System.out.println("Table Created Successfully");
    }
}

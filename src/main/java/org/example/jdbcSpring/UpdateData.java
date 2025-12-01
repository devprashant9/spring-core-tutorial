package org.example.jdbcSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class UpdateData {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springJDBC.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");

        String updateData = """
                UPDATE spring_jdbc SET name = ?, email = ? WHERE ID = ?
                """ ;

        jdbcTemplate.update(updateData, "Updated Spring JDBC", "updatedemial@gmail.com", 1);
        System.out.println("Data Updated Successfully");
    }
}

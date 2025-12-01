package org.example.jdbcSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class SelectData {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springJDBC.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");

        RowMapper<SelectDataClass> rowMapper = ((rs, c) -> {
            SelectDataClass selectDataClass = new SelectDataClass();
            selectDataClass.setId(rs.getInt("id"));
            selectDataClass.setName(rs.getString("name"));
            selectDataClass.setEmail(rs.getString("email"));

            return selectDataClass;
        });

        String getOneData = """
                SELECT * FROM spring_jdbc WHERE id = ?
                """ ;
        SelectDataClass selectDataClass = jdbcTemplate.queryForObject(getOneData, rowMapper, 1);
        System.out.println(selectDataClass);

        String getAllData = """
                SELECT * FROM spring_jdbc
                """;

        List<SelectDataClass> query = jdbcTemplate.query(getAllData, rowMapper);
        System.out.println(query);
    }
}

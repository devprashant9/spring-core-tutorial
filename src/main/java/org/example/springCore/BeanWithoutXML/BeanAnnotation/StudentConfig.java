package org.example.springCore.BeanWithoutXML.BeanAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    public Student getStudent() {
        return new Student();
    }
}

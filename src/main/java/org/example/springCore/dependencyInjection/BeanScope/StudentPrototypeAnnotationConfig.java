package org.example.springCore.dependencyInjection.BeanScope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class StudentPrototypeAnnotationConfig {

    @Bean
    @Scope("prototype")
    public StudentPrototypeAnnotation getStudent() {
        return new StudentPrototypeAnnotation();
    }
}

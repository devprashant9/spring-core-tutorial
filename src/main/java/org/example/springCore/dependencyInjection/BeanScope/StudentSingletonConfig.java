package org.example.springCore.dependencyInjection.BeanScope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentSingletonConfig {

    @Bean
    public StudentSingleton getStudent() {
        return new StudentSingleton();
    }
}

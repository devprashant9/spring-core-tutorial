package org.example.springCore.dependencyInjection.BeanLifeCycle.usingAnnotation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("Prashant Kumar Jha")
    private String name;

    @PostConstruct
    public void init() {
        System.out.println("InIt Method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy Method");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

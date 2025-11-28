package org.example.springCore.dependencyInjection.BeanScope;

import org.springframework.beans.factory.annotation.Value;

public class StudentPrototypeAnnotation {

    @Value("Prashant Kumar Jha Scope Annotation")
    private String name;
}

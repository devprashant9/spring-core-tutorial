package org.example.springCore.dependencyInjection.BeanLifeCycle.usingAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
        Student student = (Student) context.getBean("getStudent");
        System.out.println(student);

        context.registerShutdownHook();
    }
}

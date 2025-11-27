package org.example.springCore.dependencyInjection.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("settingValuesUsingConstructorInjection.xml");

        Student student = context.getBean("student", Student.class);
        System.out.println(student);

        AmbiguityStudent ambiguityStudent = (AmbiguityStudent) context.getBean("ambiguityStudent");
        System.out.println(ambiguityStudent);
    }
}

// Ambiguity Can Occur When We Have Multiple Constructors of Same Type
// Spring Tries to Identify It By Number of Parameters & Data Types
// If Confused Calls The First Constructor
// We Can Use "type" and "index" Attribute to Resolve This Ambiguity
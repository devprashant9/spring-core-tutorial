package org.example.springCore.dependencyInjection.setter.PrimitiveValues;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("settingPrimitiveValues.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }
}

// We Have a "Student" Class And We Need To Set Values To Primitive Data Types
// Used Setter Methods To Initialize The Values
// Configured It Using XML
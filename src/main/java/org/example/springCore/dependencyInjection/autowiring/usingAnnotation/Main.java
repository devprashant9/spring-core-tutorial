package org.example.springCore.dependencyInjection.autowiring.usingAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autoWiringUsingAnnotation.xml");
        GetStudentDetails getStudentDetails = (GetStudentDetails) context.getBean("getDetails");
        System.out.println(getStudentDetails.getDetails());
    }
}

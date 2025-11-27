package org.example.springCore.dependencyInjection.autowiring.usingXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiringUsingXML.xml");
        GetStudentDetails getStudentDetails = context.getBean("getDetails", GetStudentDetails.class);
        System.out.println(getStudentDetails.getDetails());
    }
}

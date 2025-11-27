package org.example.springCore.dependencyInjection.setter.ReferenceTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("settingReferenceTypes.xml");
        GetStudentDetails studentDetails = (GetStudentDetails) context.getBean("getDetails");
        System.out.println(studentDetails.getDetails());
    }
}

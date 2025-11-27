package org.example.springCore.dependencyInjection.setter.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("settingCollectionTypes.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }
}

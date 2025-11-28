package org.example.springCore.dependencyInjection.BeanLifeCycle.usingXML;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifeCycleUsingXML.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);

        context.registerShutdownHook(); // Invokes Destroy Method
    }
}

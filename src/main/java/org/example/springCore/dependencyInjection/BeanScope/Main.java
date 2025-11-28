package org.example.springCore.dependencyInjection.BeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Singleton Objects Gives Same HashCode
        System.out.println("Singleton Object HashCodes");
        ApplicationContext singletonContext = new AnnotationConfigApplicationContext(StudentSingletonConfig.class);
        StudentSingleton studentSingleton1 = (StudentSingleton) singletonContext.getBean("getStudent");
        StudentSingleton studentSingleton2 = (StudentSingleton) singletonContext.getBean("getStudent");
        System.out.println(studentSingleton1.hashCode());
        System.out.println(studentSingleton2.hashCode());

        // Prototype Objects Give Different HashCode
        // Using XML
        System.out.println("Prototype Object HashCodes Using XML");
        ApplicationContext prototypeContextXML = new ClassPathXmlApplicationContext("prototypeBeanScope.xml");
        StudentPrototypeXML studentPrototypeXML1 = (StudentPrototypeXML) prototypeContextXML.getBean("studentXML");
        StudentPrototypeXML studentPrototypeXML2 = (StudentPrototypeXML) prototypeContextXML.getBean("studentXML");
        System.out.println(studentPrototypeXML1.hashCode());
        System.out.println(studentPrototypeXML2.hashCode());

        // Prototype Objects Give Different HashCode
        // Using Annotation
        System.out.println("Prototype Object HashCodes Using Annotation");
        ApplicationContext prototypeContextAnnotation = new AnnotationConfigApplicationContext(StudentPrototypeAnnotationConfig.class);
        StudentPrototypeAnnotation prototypeContextAnnotation1 = (StudentPrototypeAnnotation) prototypeContextAnnotation.getBean("getStudent");
        StudentPrototypeAnnotation prototypeContextAnnotation2 = (StudentPrototypeAnnotation) prototypeContextAnnotation.getBean("getStudent");
        System.out.println(prototypeContextAnnotation1.hashCode());
        System.out.println(prototypeContextAnnotation2.hashCode());
    }
}

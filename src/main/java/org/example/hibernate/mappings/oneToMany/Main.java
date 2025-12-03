package org.example.hibernate.mappings.oneToMany;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // We Can Move To & From Between Student and Certificates Table
        // Thus These Are Already Uni & Bi Directional

        // Create Certificate
        Certificates certificate1 = new Certificates();
        certificate1.setCourseName("Web Development");
        certificate1.setUniqueNumber("XA76Yj0425B");

        Certificates certificate2 = new Certificates();
        certificate2.setCourseName("Web 3");
        certificate2.setUniqueNumber("CC8XY7890P3");

        // Create Student
        Student student = new Student();
        student.setFullName("Prashant Kumar Jha");
        student.setEmail("test2@gmail.com");
        student.setCertificates(List.of(certificate1, certificate2));

        certificate1.setStudent(student);
        certificate2.setStudent(student);


        // Hibernate operations
        SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.persist(student); // Automatically Saves Child Relationship

        tx.commit();
        session.close();
    }
}

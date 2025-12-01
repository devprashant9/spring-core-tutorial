package org.example.hibernate.studentExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("Ankit");
        student.setMiddleName("Kumar");
        student.setLastName("Giri");
        student.setEmail("girishannk@gmail.com");
        student.setPassword("Ankit123@*#");
        student.setContact("6290895675");
        student.setDateOfBirth(LocalDate.of(2000, 2, 28));
        student.setCreatedAt(LocalDateTime.now());
        student.setUpdatedAt(LocalDateTime.now());


        SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(student);

        transaction.commit();

        session.close();
    }
}

package org.example.hibernate.mappings.oneToOne.unidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        // Certificate Object
        Certificate certificate = new Certificate();
        certificate.setCourse("Web Development");
        certificate.setCertificateNumber("WXY890C624X312B12345");

        // Student Object
        Student student = new Student();
        student.setName("Prashant Kumar Jha");
        student.setEmail("kumarjha183@gmail.com");
        student.setCertificate(certificate);

        SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(student);
        transaction.commit();

        session.close();
    }
}

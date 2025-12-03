package org.example.hibernate.fetchTypes;

import org.example.hibernate.mappings.oneToMany.Student;
import org.example.hibernate.mappings.oneToMany.Certificates;
import org.example.hibernate.mappings.oneToMany.SessionFactoryProvider;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
        Session session = sessionFactory.openSession();

        Student student = session.find(Student.class, 1);
        System.out.println( student.getId());
        System.out.println(student.getFullName());

        System.out.println(student.getCertificates().size());

        session.close();

    }
}

// By Default Fetch Type is Lazy
// To Make It EAGER Apply  on @OneToMany(mapped = "student", fetch = FetchType.EAGER)
// To Make It LAZY Apply  on @OneToMany(mapped = "student", fetch = FetchType.LAZY)

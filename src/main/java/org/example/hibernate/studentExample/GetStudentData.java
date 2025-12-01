package org.example.hibernate.studentExample;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class GetStudentData {

    public static void main(String[] args) {
        SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
        int studentId = 1;

        try (Session session = sessionFactory.openSession()) {
            Student student = session.find(Student.class, studentId);

            if (student != null) {
                System.out.println("Student found: " + student);
            } else {
                System.out.println("No student found with ID: " + studentId);
            }

        } catch (HibernateException e) {
            System.err.println("Error fetching student: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

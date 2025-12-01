package org.example.hibernate.embeddedExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Address address = new Address();
        address.setHouseNo("45/B/1");
        address.setRoad("P N Mitra Lane");
        address.setPinCode(700041L);
        address.setCity("Kolkata");
        address.setState("West Bengal");
        address.setCountry("India");

        User user = new User();
        user.setFullName("Prashant Kumar Jha");
        user.setEmail("kumarjha183@gmail.com");
        user.setAddress(address);


        SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(user);
        transaction.commit();
        session.close();
    }
}

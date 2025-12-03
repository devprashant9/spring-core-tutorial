package org.example.hibernate.mappings.manyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // This Set Up Also Has
        // Uni & Bi Directional Way

        Teams team1 = new Teams();
        team1.setTeamCode("Codec 1");
        team1.setTeamName("Web Dev Team");

        Teams team2 = new Teams();
        team2.setTeamCode("Codec 2");
        team2.setTeamName("Web 3 Team");


        Projects project1 = new Projects();
        project1.setProjectName("Web Dev Project");


        Projects project2 = new Projects();
        project2.setProjectName("Web Dev Project");

        team1.setProjectsList(List.of(project1, project2));
        project1.setTeamsList(List.of(team1, team2));

        SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(team1);
        session.persist(team2);

        transaction.commit();

        session.close();
    }
}

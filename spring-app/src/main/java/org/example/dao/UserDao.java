package org.example.dao;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.example.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    public int saveUser(User user) {
        entityManager.persist(user);
        entityManager.flush();
        return user.getId();
    }
}

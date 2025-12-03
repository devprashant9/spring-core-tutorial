package org.example.repository;

import org.example.model.UserModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public UserModel save(UserModel user) {
        entityManager.persist(user);
        return user;
    }

    public List<UserModel> findAll() {
        return entityManager.createQuery("FROM UserModel", UserModel.class)
                .getResultList();
    }

    public UserModel findById(Integer id) {
        return entityManager.find(UserModel.class, id);
    }

    public UserModel update(UserModel user) {
        return entityManager.merge(user);
    }

    public void delete(UserModel user) {
        entityManager.remove(entityManager.contains(user) ? user : entityManager.merge(user));
    }
}

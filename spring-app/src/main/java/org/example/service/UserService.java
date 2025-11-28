package org.example.service;

import jakarta.transaction.Transactional;
import org.example.dao.UserDao;
import org.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;

    public int createUser(User user) {
        return this.userDao.saveUser(user);
    }
}

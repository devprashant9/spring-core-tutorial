package org.example.service.impl;

import org.example.model.UserModel;
import org.example.repository.UserRepository;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserModel> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserModel getUser(Integer userId) {
        UserModel user = userRepository.findById(userId);
        if (user == null) {
            throw new RuntimeException("User not found with ID: " + userId);
        }
        return user;
    }

    @Override
    public UserModel createUser(UserModel userModel) {
        return userRepository.save(userModel);
    }

    @Override
    public UserModel updateUser(UserModel userModel, Integer userId) {
        UserModel existingUser = userRepository.findById(userId);
        if (existingUser == null) {
            throw new RuntimeException("Cannot update. User not found with ID: " + userId);
        }
        existingUser.setUserName(userModel.getUserName());
        existingUser.setUserEmail(userModel.getUserEmail());
        // optionally update other fields like password
        return userRepository.update(existingUser);
    }

    @Override
    public String deleteUser(Integer userId) {
        UserModel existingUser = userRepository.findById(userId);
        if (existingUser == null) {
            throw new RuntimeException("Cannot delete. User not found with ID: " + userId);
        }
        userRepository.delete(existingUser);
        return "User with ID " + userId + " deleted successfully";
    }
}

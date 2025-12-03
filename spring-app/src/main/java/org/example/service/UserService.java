package org.example.service;

import org.example.model.UserModel;

import java.util.List;

public interface UserService {

    List<UserModel> getUsers();
    UserModel getUser(Integer userId);
    UserModel createUser(UserModel userModel);
    UserModel updateUser(UserModel userModel, Integer userId);
    String deleteUser(Integer UserId);

}

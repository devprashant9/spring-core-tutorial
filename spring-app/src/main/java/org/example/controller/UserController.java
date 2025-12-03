package org.example.controller;

import org.example.model.UserModel;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping
    public List<UserModel> getUsers() {
        return userService.getUsers();
    }


    @GetMapping("/{userId}")
    public UserModel getUser(@PathVariable Integer userId) {
        return userService.getUser(userId);
    }


    @PostMapping
    public UserModel createUser(@RequestBody UserModel userModel) {
        return userService.createUser(userModel);
    }


    @PatchMapping("/{userId}")
    public UserModel updateUser(@PathVariable Integer userId,
                                @RequestBody UserModel userModel) {
        return userService.updateUser(userModel, userId);
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable Integer userId) {
        return userService.deleteUser(userId);
    }
}

package com.project.jobportal.controller;

import com.project.jobportal.entity.User;
import com.project.jobportal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<Void> addNewUser(@RequestBody User user){
        userService.registerNewUser(user);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.findAllUsers();
    }
}

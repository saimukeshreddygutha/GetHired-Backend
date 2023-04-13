package com.project.jobportal.controller;

import com.project.jobportal.entity.User;
import com.project.jobportal.repository.UserRepository;
import com.project.jobportal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public ResponseEntity<Void> addNewUser(@RequestBody User user){
        userService.registerNewUser(user);
        return new ResponseEntity(null, HttpStatus.CREATED);
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.findAllUsers();
    }

    @GetMapping("/{username}")
    public ResponseEntity<String> isUsernameAlreadyExists(@PathVariable String username){
        User user = userRepository.findByUsername(username);
        if(user != null) return ResponseEntity.status(HttpStatus.CONFLICT)
                .body("Username " + username + " already exists");
        return ResponseEntity.ok().build();
    }
}

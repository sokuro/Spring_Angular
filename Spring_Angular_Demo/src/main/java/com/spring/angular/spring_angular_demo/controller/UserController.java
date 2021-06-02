package com.spring.angular.spring_angular_demo.controller;

import com.spring.angular.spring_angular_demo.entity.User;
import com.spring.angular.spring_angular_demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ugk (Sokuro Matsuda)
 * @since 6/2/2021
 *
 * @CrossOrigin enables Cross-Origin Resource Sharing on the Server
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }
}

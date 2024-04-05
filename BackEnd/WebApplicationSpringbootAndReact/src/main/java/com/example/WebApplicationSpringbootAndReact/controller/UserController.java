package com.example.WebApplicationSpringbootAndReact.controller;
import com.example.WebApplicationSpringbootAndReact.model.Users;
import com.example.WebApplicationSpringbootAndReact.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/user")

public class UserController {
    @Autowired
    private UserService userService;
    // put the data into database
    @PostMapping("/add")
    public String add(@RequestBody Users users){
        userService.saveUsers(users);
        return "new User is added";
    }
    // get the data from database
    @GetMapping("/getData")
    public List<Users> getAllUser() {
        return userService.getAllUsers();

    }

}

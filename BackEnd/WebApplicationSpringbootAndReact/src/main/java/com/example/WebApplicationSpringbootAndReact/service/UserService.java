package com.example.WebApplicationSpringbootAndReact.service;

import com.example.WebApplicationSpringbootAndReact.model.Users;

import java.util.List;

public interface UserService {
    public Users saveUsers(Users users);
    public List<Users> getAllUsers();
}

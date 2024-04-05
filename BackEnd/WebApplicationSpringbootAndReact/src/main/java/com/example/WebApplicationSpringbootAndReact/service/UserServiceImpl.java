package com.example.WebApplicationSpringbootAndReact.service;

import com.example.WebApplicationSpringbootAndReact.model.Users;
import com.example.WebApplicationSpringbootAndReact.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Users saveUsers(Users users) {
        return userRepository.save(users);
    }

    @Override
    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }
}

package com.example.WebApplicationSpringbootAndReact.repository;

import com.example.WebApplicationSpringbootAndReact.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
@EnableJpaRepositories
@Repository

public interface UserRepository extends JpaRepository<Users, Integer> {
}

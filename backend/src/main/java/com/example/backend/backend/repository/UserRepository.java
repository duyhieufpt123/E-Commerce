package com.example.backend.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.backend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    public User findByEmail(String email);

}

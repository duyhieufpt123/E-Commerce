package com.example.backend.backend.service;

import com.example.backend.backend.exception.UserException;
import com.example.backend.backend.model.User;

public interface UserService {
    public User findUserbyId(Long userId) throws UserException;

    public User findUserProfileByJwt(String jwt) throws UserException;
}

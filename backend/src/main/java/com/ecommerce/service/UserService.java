package com.ecommerce.service;

import com.ecommerce.exception.UserException;
import com.ecommerce.model.User;

public interface UserService {
    public User findUserbyId(Long userId) throws UserException;

    public User findUserProfileByJwt(String jwt) throws UserException;
}

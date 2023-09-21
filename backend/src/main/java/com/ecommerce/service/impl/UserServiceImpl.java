package com.ecommerce.service.impl;

import java.util.ArrayList;

import org.hibernate.mapping.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.ecommerce.model.User;
import com.ecommerce.repository.UserRepository;

public class UserServiceImpl implements UserDetailsService {

    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(username);
        if (user == null) {
            throw new UsernameNotFoundException("user not found with email -" +
                    username);
        }
        java.util.List<GrantedAuthority> authorities = new ArrayList<>();
        return new org.springframework.security.core.userdetails.User(user.getEmail(),
                user.getPassword(), authorities);
    }

}

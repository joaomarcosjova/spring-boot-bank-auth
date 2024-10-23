package com.example.jwtsecurity.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Hardcoded user for simplicity
        if ("user".equals(username)) {
            // Password: "password" hashed using BCrypt
            return new User("user", "$2a$10$7dV/E5pEmjE8aU8RrtS1buWxd9sVgChTu.L7z4YZH6jmkIY9EdDSG", Collections.emptyList());
        }
        throw new UsernameNotFoundException("User not found");
    }
}

package com.galaxy.universe.service;

import com.galaxy.universe.dto.User;

public interface UserService {

    // Method to create a new user
    User createUser(User user);

    // Method to retrieve a user by their ID
    User getUserById(Long id);

    // Method to update an existing user's information
    User updateUser(Long id, User user);
}

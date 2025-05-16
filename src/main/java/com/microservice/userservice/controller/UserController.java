package com.microservice.userservice.controller;

import com.microservice.userservice.model.User;
import com.microservice.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * REST controller for managing user-related operations.
 * Provides endpoints to retrieve, create, and delete users.
 */
@RestController
@RequestMapping("/V1/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * Retrieves a list of all users.
     *
     * @return List of User objects.
     */
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    /**
     * Retrieves a specific user by their ID.
     *
     * @param id UUID of the user to retrieve.
     * @return User object corresponding to the provided ID.
     */
    @GetMapping("/{id}")
    public User getUserById(@PathVariable UUID id) {
        return userService.getUserById(id);
    }

    /**
     * Creates a new user.
     *
     * @param user User object containing the new user's information.
     * @return Created a User object.
     */
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    /**
     * Deletes a specific user by their ID.
     *
     * @param id UUID of the user to delete.
     */
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable UUID id) {
        userService.deleteUser(id);
    }
}

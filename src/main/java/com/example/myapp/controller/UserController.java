package com.example.myapp.controller;

import com.example.myapp.model.User;
import com.example.myapp.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping
    public void createUser(@RequestBody User user) {
        userService.createUser(user);
    }


    @PutMapping("/{id}")
    public void updateUser(@PathVariable Long id, @RequestBody User updatedUser) {
        updatedUser.setId(id);
        userService.createUser(updatedUser);
    }


    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }


    @GetMapping
    public List<User> listUsers(@RequestParam(required = false) String name) {
        List<User> all = userService.getAllUsers();
        if (name != null) {
            return all.stream()
                    .filter(u -> u.getName().equalsIgnoreCase(name))
                    .toList();
        }
        return all;
    }


    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }
}

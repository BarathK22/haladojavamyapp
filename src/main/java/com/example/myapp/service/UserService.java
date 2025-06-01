package com.example.myapp.service;

import com.example.myapp.model.User;
import com.example.myapp.repository.UserRepository;
import com.example.myapp.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepo;

    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public void createUser(User user) {
        userRepo.save(user);
    }

    public void deleteUser(Long id) {
        userRepo.delete(id);
    }

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepo.findById(id);
    }


    public User getUserOrThrow(Long id) {
        return userRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id " + id));
    }
}

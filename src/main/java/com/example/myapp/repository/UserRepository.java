package com.example.myapp.repository;

import com.example.myapp.model.User;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserRepository {
    private final Map<Long, User> users = new HashMap<>();

    public void save(User user) {
        users.put(user.getId(), user);
    }

    public void delete(Long id) {
        users.remove(id);
    }

    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }

    public Optional<User> findById(Long id) {
        return Optional.ofNullable(users.get(id));
    }
}

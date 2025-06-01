package com.example.myapp.repository;

import com.example.myapp.model.Category;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CategoryRepository {
    private final Map<Long, Category> categories = new HashMap<>();

    public void save(Category category) {
        categories.put(category.getId(), category);
    }

    public void delete(Long id) {
        categories.remove(id);
    }

    public List<Category> findAll() {
        return new ArrayList<>(categories.values());
    }

    public Optional<Category> findById(Long id) {
        return Optional.ofNullable(categories.get(id));
    }
}

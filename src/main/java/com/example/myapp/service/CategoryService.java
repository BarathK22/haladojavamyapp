package com.example.myapp.service;

import com.example.myapp.model.Category;
import com.example.myapp.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepo;

    public CategoryService(CategoryRepository categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    public void createCategory(Category category) {
        categoryRepo.save(category);
    }

    public void deleteCategory(Long id) {
        categoryRepo.delete(id);
    }

    public List<Category> getAllCategories() {
        return categoryRepo.findAll();
    }

    public Optional<Category> getCategoryById(Long id) {
        return categoryRepo.findById(id);
    }
}

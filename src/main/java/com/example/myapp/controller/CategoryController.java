package com.example.myapp.controller;

import com.example.myapp.model.Category;
import com.example.myapp.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    public void createCategory(@RequestBody Category category) {
        categoryService.createCategory(category);
    }

    @PutMapping("/{id}")
    public void updateCategory(@PathVariable Long id, @RequestBody Category updatedCategory) {
        updatedCategory.setId(id);
        categoryService.createCategory(updatedCategory);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategory(id);
    }

    @GetMapping
    public List<Category> listCategories(@RequestParam(required = false) String name) {
        List<Category> all = categoryService.getAllCategories();
        if (name != null) {
            return all.stream()
                    .filter(c -> c.getName().equalsIgnoreCase(name))
                    .toList();
        }
        return all;
    }

    @GetMapping("/{id}")
    public Optional<Category> getCategory(@PathVariable Long id) {
        return categoryService.getCategoryById(id);
    }
}

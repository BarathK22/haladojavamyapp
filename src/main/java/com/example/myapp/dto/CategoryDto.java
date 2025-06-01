package com.example.myapp.dto;

import lombok.Data;

import java.util.Set;

@Data
public class CategoryDto {
    private Long id;
    private String name;
    private String description;
    private boolean visible;
    private int sortOrder;
    private Set<Long> courseIds;
}

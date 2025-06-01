package com.example.myapp.model;

import lombok.*;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    private Long id;
    private String name;
    private String description;
    private boolean visible;
    private int sortOrder;

    private Set<Course> courses = new HashSet<>();
}

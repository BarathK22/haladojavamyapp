package com.example.myapp.model;

import lombok.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private String email;
    private boolean active;
    private LocalDate registrationDate;

    private Set<Course> courses = new HashSet<>();
}

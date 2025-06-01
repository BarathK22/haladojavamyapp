package com.example.myapp.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Data
public class UserDto {
    private Long id;
    private String name;
    private String email;
    private boolean active;
    private LocalDate registrationDate;
    private Set<Long> courseIds;
}

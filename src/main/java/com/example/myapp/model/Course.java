package com.example.myapp.model;

import lombok.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    private Long id;
    private String title;
    private String description;
    private boolean published;
    private LocalDate startDate;

    private List<Lesson> lessons = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    private Category category;
}

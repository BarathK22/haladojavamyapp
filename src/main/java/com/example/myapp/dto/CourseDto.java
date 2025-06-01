package com.example.myapp.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class CourseDto {
    private Long id;
    private String title;
    private String description;
    private boolean published;
    private LocalDate startDate;
    private List<Long> lessonIds;
    private List<Long> userIds;
    private Long categoryId;
}

package com.example.myapp.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class LessonDto {
    private Long id;
    private String title;
    private String content;
    private int durationMinutes;
    private LocalDate availableFrom;
}

package com.example.myapp.model;

import lombok.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lesson {
    private Long id;
    private String title;
    private String content;
    private int durationMinutes;
    private LocalDate availableFrom;
}

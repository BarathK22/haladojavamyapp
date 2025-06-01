package com.example.myapp.service;

import com.example.myapp.model.Lesson;
import com.example.myapp.repository.LessonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LessonService {
    private final LessonRepository lessonRepo;

    public LessonService(LessonRepository lessonRepo) {
        this.lessonRepo = lessonRepo;
    }

    public void createLesson(Lesson lesson) {
        lessonRepo.save(lesson);
    }

    public void deleteLesson(Long id) {
        lessonRepo.delete(id);
    }

    public List<Lesson> getAllLessons() {
        return lessonRepo.findAll();
    }

    public Optional<Lesson> getLessonById(Long id) {
        return lessonRepo.findById(id);
    }
}

package com.example.myapp.repository;

import com.example.myapp.model.Lesson;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class LessonRepository {
    private final Map<Long, Lesson> lessons = new HashMap<>();

    public void save(Lesson lesson) {
        lessons.put(lesson.getId(), lesson);
    }

    public void delete(Long id) {
        lessons.remove(id);
    }

    public List<Lesson> findAll() {
        return new ArrayList<>(lessons.values());
    }

    public Optional<Lesson> findById(Long id) {
        return Optional.ofNullable(lessons.get(id));
    }
}

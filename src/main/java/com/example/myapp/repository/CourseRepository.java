package com.example.myapp.repository;

import com.example.myapp.model.Course;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CourseRepository {
    private final Map<Long, Course> courses = new HashMap<>();

    public void save(Course course) {
        courses.put(course.getId(), course);
    }

    public void delete(Long id) {
        courses.remove(id);
    }

    public List<Course> findAll() {
        return new ArrayList<>(courses.values());
    }

    public Optional<Course> findById(Long id) {
        return Optional.ofNullable(courses.get(id));
    }
}

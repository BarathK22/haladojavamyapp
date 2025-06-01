package com.example.myapp.service;

import com.example.myapp.model.Course;
import com.example.myapp.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    private final CourseRepository courseRepo;

    public CourseService(CourseRepository courseRepo) {
        this.courseRepo = courseRepo;
    }

    public void createCourse(Course course) {
        courseRepo.save(course);
    }

    public void deleteCourse(Long id) {
        courseRepo.delete(id);
    }

    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    public Optional<Course> getCourseById(Long id) {
        return courseRepo.findById(id);
    }
}

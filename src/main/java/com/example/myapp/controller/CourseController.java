package com.example.myapp.controller;

import com.example.myapp.model.Course;
import com.example.myapp.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping
    public void createCourse(@RequestBody Course course) {
        courseService.createCourse(course);
    }

    @PutMapping("/{id}")
    public void updateCourse(@PathVariable Long id, @RequestBody Course updatedCourse) {
        updatedCourse.setId(id);
        courseService.createCourse(updatedCourse);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
    }

    @GetMapping
    public List<Course> listCourses(@RequestParam(required = false) String title) {
        List<Course> all = courseService.getAllCourses();
        if (title != null) {
            return all.stream()
                    .filter(c -> c.getTitle().equalsIgnoreCase(title))
                    .toList();
        }
        return all;
    }

    @GetMapping("/{id}")
    public Optional<Course> getCourse(@PathVariable Long id) {
        return courseService.getCourseById(id);
    }
}

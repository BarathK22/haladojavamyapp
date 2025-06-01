package com.example.myapp.controller;

import com.example.myapp.model.Lesson;
import com.example.myapp.service.LessonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/lessons")
public class LessonController {

    private final LessonService lessonService;

    public LessonController(LessonService lessonService) {
        this.lessonService = lessonService;
    }

    @PostMapping
    public void createLesson(@RequestBody Lesson lesson) {
        lessonService.createLesson(lesson);
    }

    @PutMapping("/{id}")
    public void updateLesson(@PathVariable Long id, @RequestBody Lesson updatedLesson) {
        updatedLesson.setId(id);
        lessonService.createLesson(updatedLesson);
    }

    @DeleteMapping("/{id}")
    public void deleteLesson(@PathVariable Long id) {
        lessonService.deleteLesson(id);
    }

    @GetMapping
    public List<Lesson> listLessons(@RequestParam(required = false) String title) {
        List<Lesson> all = lessonService.getAllLessons();
        if (title != null) {
            return all.stream()
                    .filter(l -> l.getTitle().equalsIgnoreCase(title))
                    .toList();
        }
        return all;
    }

    @GetMapping("/{id}")
    public Optional<Lesson> getLesson(@PathVariable Long id) {
        return lessonService.getLessonById(id);
    }
}

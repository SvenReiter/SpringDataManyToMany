package com.example.SpringBootSpringDataExample.StudentVsCourseManyToMany.controller;

import com.example.SpringBootSpringDataExample.StudentVsCourseManyToMany.entity.Course;
import com.example.SpringBootSpringDataExample.StudentVsCourseManyToMany.entity.Student;
import com.example.SpringBootSpringDataExample.StudentVsCourseManyToMany.repository.CourseRepository;
import com.example.SpringBootSpringDataExample.StudentVsCourseManyToMany.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student/course")
public class WebController {

    private StudentRepository studentRepository;
    private CourseRepository courseRepository;

    public WebController(StudentRepository studentRepository,
                         CourseRepository courseRepository) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    @PostMapping
    public Student saveStudentWithCourse(@RequestBody  Student student) {
        return studentRepository.save(student);
    }

    @GetMapping
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Student findStudent(@PathVariable Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @GetMapping("/find/{name}")
    public List<Student> findStudentsContainingByName(@PathVariable String name) {
        return studentRepository.findByNameContaining(name);
    }

    @GetMapping("/search/{price}")
    public List<Course> findCourseLessThanPrice(@PathVariable double price) {
        return courseRepository.findByFeeLessThan(price);
    }
}

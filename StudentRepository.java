package com.example.SpringBootSpringDataExample.StudentVsCourseManyToMany.repository;

import com.example.SpringBootSpringDataExample.StudentVsCourseManyToMany.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByNameContaining(String name);
}

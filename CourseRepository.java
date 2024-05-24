package com.example.SpringBootSpringDataExample.StudentVsCourseManyToMany.repository;

import com.example.SpringBootSpringDataExample.StudentVsCourseManyToMany.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findByFeeLessThan(double fee);
}

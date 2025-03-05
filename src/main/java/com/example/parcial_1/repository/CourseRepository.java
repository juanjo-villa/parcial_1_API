package com.example.parcial_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.parcial_1.models.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}

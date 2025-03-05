package com.example.parcial_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.parcial_1.models.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

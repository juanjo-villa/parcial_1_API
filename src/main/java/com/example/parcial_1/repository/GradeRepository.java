package com.example.parcial_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.parcial_1.models.Grade;

public interface GradeRepository extends JpaRepository<Grade, Long> {
}

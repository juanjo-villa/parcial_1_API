package com.example.parcial_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.parcial_1.models.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
}

package com.example.parcial_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.parcial_1.models.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}

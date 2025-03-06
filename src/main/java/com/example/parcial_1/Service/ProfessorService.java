package com.example.parcial_1.Service;

import java.util.List;

import com.example.parcial_1.models.Professor;

public interface ProfessorService {

    List<Professor> getAllProfessors();

    Professor getProfessorById(Long id);

    Professor createProfessor(Professor professor);

    Professor updateProfessor(Long id, Professor professor);

    void deleteProfessor(Long id);
}

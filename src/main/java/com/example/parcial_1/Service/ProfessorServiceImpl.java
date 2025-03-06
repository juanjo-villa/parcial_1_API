package com.example.parcial_1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.parcial_1.models.Professor;
import com.example.parcial_1.repository.ProfessorRepository;

@Service
public class ProfessorServiceImpl implements ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    @Override
    public List<Professor> getAllProfessors() {
        return professorRepository.findAll();
    }

    @Override
    public Professor getProfessorById(Long id) {
        return professorRepository.findById(id).orElse(null);
    }

    @Override
    public Professor createProfessor(Professor professor) {
        return professorRepository.save(professor);
    }

    @Override
    public Professor updateProfessor(Long id, Professor professor) {
        Professor existingProfessor = professorRepository.findById(id).orElse(null);
        if (existingProfessor != null) {
            existingProfessor.setFirstName(professor.getFirstName());
            existingProfessor.setLastName(professor.getLastName());
            return professorRepository.save(existingProfessor);
        }
        return null;
    }

    @Override
    public void deleteProfessor(Long id) {
        professorRepository.deleteById(id);
    }
}

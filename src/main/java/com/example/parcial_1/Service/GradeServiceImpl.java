package com.example.parcial_1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.parcial_1.models.Grade;
import com.example.parcial_1.repository.GradeRepository;

@Service
public class GradeServiceImpl implements GradeService {

    @Autowired
    private GradeRepository gradeRepository;

    @Override
    public List<Grade> getAllGrades() {
        return gradeRepository.findAll();
    }

    @Override
    public Grade getGradeById(Long id) {
        return gradeRepository.findById(id).orElse(null);
    }

    @Override
    public Grade createGrade(Grade grade) {
        return gradeRepository.save(grade);
    }

    @Override
    public Grade updateGrade(Long id, Grade grade) {
        Grade existingGrade = gradeRepository.findById(id).orElse(null);
        if (existingGrade != null) {
            existingGrade.setScore(grade.getScore());
            existingGrade.setStudent(grade.getStudent());
            existingGrade.setCourse(grade.getCourse());
            return gradeRepository.save(existingGrade);
        }
        return null;
    }

    @Override
    public void deleteGrade(Long id) {
        gradeRepository.deleteById(id);
    }
}

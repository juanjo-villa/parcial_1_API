package com.example.parcial_1.Service;

import java.util.List;

import com.example.parcial_1.models.Grade;

public interface GradeService {

    List<Grade> getAllGrades();

    Grade getGradeById(Long id);

    Grade createGrade(Grade grade);

    Grade updateGrade(Long id, Grade grade);

    void deleteGrade(Long id);
}

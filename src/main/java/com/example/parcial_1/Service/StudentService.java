package com.example.parcial_1.Service;

import java.util.List;

import com.example.parcial_1.models.Student;

public interface StudentService {

    List<Student> getAllStudents();

    Student getStudentById(Long id);

    Student createStudent(Student student);

    Student updateStudent(Long id, Student student);

    void deleteStudent(Long id);
}

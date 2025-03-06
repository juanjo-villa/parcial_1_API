package com.example.parcial_1.Service;

import java.util.List;

import com.example.parcial_1.models.Enrollment;

public interface EnrollmentService {

    List<Enrollment> getAllEnrollments();

    Enrollment getEnrollmentById(Long id);

    Enrollment createEnrollment(Enrollment enrollment);

    Enrollment updateEnrollment(Long id, Enrollment enrollment);

    void deleteEnrollment(Long id);
}

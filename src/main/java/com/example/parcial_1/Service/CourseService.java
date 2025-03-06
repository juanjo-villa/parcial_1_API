package com.example.parcial_1.Service;

import java.util.List;

import com.example.parcial_1.models.Course;

public interface CourseService {

    List<Course> getAllCourses();

    Course getCourseById(Long id);

    Course createCourse(Course course);

    Course updateCourse(Long id, Course course);

    void deleteCourse(Long id);
}

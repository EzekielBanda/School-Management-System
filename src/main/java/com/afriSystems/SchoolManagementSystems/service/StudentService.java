package com.afriSystems.SchoolManagementSystems.service;

import com.afriSystems.SchoolManagementSystems.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    public Student saveStudent(Student student);
}

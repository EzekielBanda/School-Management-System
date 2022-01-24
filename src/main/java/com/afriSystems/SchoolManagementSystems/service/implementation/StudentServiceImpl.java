package com.afriSystems.SchoolManagementSystems.service.implementation;

import com.afriSystems.SchoolManagementSystems.entity.Student;
import com.afriSystems.SchoolManagementSystems.repository.StudentRepository;
import com.afriSystems.SchoolManagementSystems.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}

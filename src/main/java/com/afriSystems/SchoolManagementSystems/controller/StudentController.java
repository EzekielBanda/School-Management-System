package com.afriSystems.SchoolManagementSystems.controller;

import com.afriSystems.SchoolManagementSystems.entity.Student;
import com.afriSystems.SchoolManagementSystems.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }
    //Handle method to handle list and return mode and view
    @GetMapping("/student")
    public String listStudents(Model model){
        model.addAttribute("students",studentService
                .getAllStudents());
        return "students";
    }
    @GetMapping("/students/new")
    public String createStudentForm(Model model){
        //Create student object to hold form data
        Student student = new Student();
        model.addAttribute("student",student);
        return "create_student";
    }
    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student){
        studentService.saveStudent(student);
        return "redirect:/student";
    }
}

package com.assignment.studApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.assignment.studApp.Model.Student;
import com.assignment.studApp.Repository.StudentRepository;

@Controller
public class RegistrationController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("student", new Student());
        return "registration";
    }

    @PostMapping("/register")
    public String registerStudent(Student student) {
        studentRepository.save(student);
        return "redirect:/login";
    }
}
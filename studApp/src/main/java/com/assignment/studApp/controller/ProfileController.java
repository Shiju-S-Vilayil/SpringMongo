package com.assignment.studApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.assignment.studApp.Model.Student;
import com.assignment.studApp.Repository.StudentRepository;

@Controller
	public class ProfileController {
	    @Autowired
	    private StudentRepository studentRepository;

	    @GetMapping("/profile/{id}")
	    public String showProfile(@PathVariable("id") int id, Model model) {
	        Student student = studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
	        model.addAttribute("student", student);
	        return "profile";
	    }
	}


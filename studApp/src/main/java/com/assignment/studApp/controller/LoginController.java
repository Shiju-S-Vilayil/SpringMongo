package com.assignment.studApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.assignment.studApp.Model.Student;
import com.assignment.studApp.Repository.StudentRepository;

@Controller
public class LoginController {
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/")
	String home()
	{
		return "home";
	}
	@GetMapping("/login")
	String login()
	{
		return "login";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
	    Student student = studentRepository.findByUsernameAndPassword(username, password);
	    if (student != null) {
	        return "redirect:/profile/" + student.getId();
	    } else {
	        return "redirect:/login?error";
	    }
	}
}

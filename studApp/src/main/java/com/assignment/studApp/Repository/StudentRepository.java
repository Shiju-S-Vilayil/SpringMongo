package com.assignment.studApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.studApp.Model.Student;

public interface StudentRepository  extends  JpaRepository<Student, Integer>
{
	  Student findByUsernameAndPassword(String username, String password);
}

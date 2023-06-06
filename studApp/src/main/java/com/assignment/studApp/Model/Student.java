package com.assignment.studApp.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="student_details" )
public class Student 
{
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
	 	private int id;
	    private String name;
	    private String rollno;
	    private String branch;
	    @Column(unique = true)
	    private String username;

	    private String password;
	
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRollno() {
			return rollno;
		}

		public void setRollno(String rollno) {
			this.rollno = rollno;
		}

		public String getBranch() {
			return branch;
		}

		public void setBranch(String branch) {
			this.branch = branch;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		

		public Student(String name, String rollno, String branch, String username, String password) {
			super();
			this.name = name;
			this.rollno = rollno;
			this.branch = branch;
			this.username = username;
			this.password = password;
		}

		public Student() {
			
		}
		
}

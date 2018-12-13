package com.supersoft.service;

import java.util.List;

import com.supersoft.model.Student;

public interface StudentService 

{	
	public void saveStudent(Student stu);
	
	public void editStudent(Student stu);
	
	public void removeStudentById(Integer id);	
	
	public Student getStudentById(Integer id);
	
	public Student getStudentByEmail(String email);
	
	public void updateStudent(Student stu);
	
	//public List<String>userNamePassword();		
	
	public List<Student> listStudent();

	public void mergeStudent(Student stu2);
	
	public Student getStudentByMobile(String mobile);

	
}
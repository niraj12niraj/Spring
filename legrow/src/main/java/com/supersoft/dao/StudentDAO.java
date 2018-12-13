package com.supersoft.dao;

import java.util.List;

import com.supersoft.model.Student;


public interface StudentDAO {
	
	public void saveStudent(Student stu);	
	
	public void editStudent(Student stu);
	
	public void removeStudentById(Integer id);
	
	public Student getStudentByMobile(String mobile);
	
	public Student getStudentById(Integer id);
	
	public Student getStudentByEmail(String email);
	
	public List<Student> listStudent();
	
	public void updateStudent(Student stu);
	 
	public void mergeStudent(Student stu2);

}

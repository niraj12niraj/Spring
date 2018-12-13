package com.supersoft.service;

import java.util.List;

import com.supersoft.model.Student;
import com.supersoft.model.Student_FeeDetail;



public interface Student_FeeDetailService 
{
	
	
	public void saveStudent_FeeDetail(Student_FeeDetail stufee);			
	
	public Student_FeeDetail getStudent_FeeDetailById(Integer id);
	
	public List<Student_FeeDetail> listStudent_FeeDetail();
	
	public void mergeStudent_FeeDetail(Student_FeeDetail stufee);

}

package com.supersoft.service;


import java.util.List;

import com.supersoft.model.Student;
import com.supersoft.model.StudentAttedence;



public interface StudentAttedenceService

{

	public void saveStudentAttedence(StudentAttedence stua);
	
	public void updateStudentAttedence(StudentAttedence stua);

	public StudentAttedence getStudentAttedenceByAttedenceNo(Integer admission);
	
	public List<StudentAttedence> listStudentAttedence();

	public Student getStudentAttendenceService();

	public Student getStudentAttendenceById(Integer id);

	//public Excel getEmpAttedence(Integer rollNo);

	
}

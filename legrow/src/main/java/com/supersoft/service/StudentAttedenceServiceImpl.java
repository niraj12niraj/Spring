package com.supersoft.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.supersoft.dao.StudentAttedenceDAO;
import com.supersoft.model.Student;
import com.supersoft.model.StudentAttedence;




@Repository
public class StudentAttedenceServiceImpl implements StudentAttedenceService
{
	@Autowired
    private StudentAttedenceDAO  studentAttedenceDAO ;
	
	 @Transactional
		@Override
		public void saveStudentAttedence(StudentAttedence stua)
		{
			// TODO Auto-generated method stub
		studentAttedenceDAO.saveStudentAttedence(stua);
			
		}  
	 
	 @Transactional
		@Override
		public void updateStudentAttedence(StudentAttedence stua) {
			System.out.println("StudentAttedenceServiceImpl.updateUser()");
			// TODO Auto-generated method stub
			studentAttedenceDAO.updateStudentAttedence(stua);
			
		}	    
	  
	  @Transactional
	    @Override
		public StudentAttedence getStudentAttedenceByAttedenceNo(Integer admission) 
	  {
			// TODO Auto-generated method stub
			return studentAttedenceDAO.getStudentAttedenceByAttedenceNo(admission);
			} 
		
	    
		
	  @Transactional
		@Override
		public List<StudentAttedence> listStudentAttedence() {
			// TODO Auto-generated method stub
			return  studentAttedenceDAO.listStudentAttedence();
		}
/*
	  @Transactional
	@Override
	public Excel getEmpAttedence(Integer rollNo) {
		// TODO Auto-generated method stub
		return studentAttedenceDAO.getEmpAttedence(rollNo);
	}
	*/

	@Override
	public Student getStudentAttendenceService() {
		// TODO Auto-generated method stub
		return studentAttedenceDAO.getStudentAttendenceService();
	}

@Override
public Student getStudentAttendenceById(Integer id) {
	// TODO Auto-generated method stub
	return studentAttedenceDAO.getStudentAttedenceById(id);
}
}

package com.supersoft.service;

import java.util.List;


import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.supersoft.dao.Student_FeeDetailDAO;
import com.supersoft.model.Student_FeeDetail;





@Repository
public class Student_FeeDetailServiceImpl implements Student_FeeDetailService
{
	@Autowired
    private Student_FeeDetailDAO student_FeeDetailDAO;

    @Transactional
	@Override
	public void saveStudent_FeeDetail(Student_FeeDetail stufee) {
		// TODO Auto-generated method stub
    	student_FeeDetailDAO.saveStudent_FeeDetail(stufee);
		
	}     
    
    @Transactional
    @Override
	public Student_FeeDetail getStudent_FeeDetailById(Integer id) {
		// TODO Auto-generated method stub
		return student_FeeDetailDAO.getStudent_FeeDetailById(id);
	}
    

    @Transactional
	@Override
	public List<Student_FeeDetail> listStudent_FeeDetail() {
		// TODO Auto-generated method stub
		return student_FeeDetailDAO.listStudent_FeeDetail();
	}
	
	@Transactional
	@Override
	public void mergeStudent_FeeDetail(Student_FeeDetail stufee) {
		// TODO Auto-generated method stub
		student_FeeDetailDAO.mergeStudent_FeeDetail(stufee);
	}
   
}
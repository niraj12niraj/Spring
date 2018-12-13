package com.supersoft.dao;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.supersoft.model.Student_FeeDetail;
import com.supersoft.service.Student_FeeDetailService;



@Repository
public class Student_FeeDetailDAOImpl implements Student_FeeDetailDAO
{
	@Autowired
    private SessionFactory sessionFactory;
    
    @Autowired
    private Student_FeeDetailService student_FeeDetailService ; 

	@Override
	public void saveStudent_FeeDetail(Student_FeeDetail stufee) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(stufee);
		System.out.println("DATA HAS BEEN SAVED.........");
		
	}

	@Override
	public Student_FeeDetail getStudent_FeeDetailById(Integer id) {
		// TODO Auto-generated method stub
		return (Student_FeeDetail) sessionFactory.getCurrentSession().get(Student_FeeDetail.class,id);
	}

	

	@SuppressWarnings("unchecked")
	@Override
	public List<Student_FeeDetail> listStudent_FeeDetail() 
	{
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Student_FeeDetail").list();
	}

	@Override
	public void mergeStudent_FeeDetail(Student_FeeDetail stufee) {
		// TODO Auto-generated method stub
		System.out.println("StudentDAOImpl.updateUser()");
		sessionFactory.getCurrentSession().merge(stufee);
	}
        
    
    
}
	
	



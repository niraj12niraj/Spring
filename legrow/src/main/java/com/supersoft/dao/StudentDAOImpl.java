 package com.supersoft.dao;


import java.util.List;



import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.supersoft.model.Student;
import com.supersoft.service.StudentService;





@Repository
public class StudentDAOImpl implements StudentDAO


{	
	   @Autowired
	    private SessionFactory sessionFactory;
	    
	    @Autowired
	    private StudentService studentService ; 

		@Override
		public void saveStudent(Student stu) {
			// TODO Auto-generated method stub
			sessionFactory.getCurrentSession().save(stu);
			System.out.println("DATA HAS BEEN SAVED.........");
		}
		
		@Override
		public void editStudent(Student stu)
		{
			sessionFactory.getCurrentSession().update(stu);
		}

		@Override
		public void updateStudent(Student stu) 
		{
			// TODO Auto-generated method stub
			System.out.println("this doa layer;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
			try{
				sessionFactory.getCurrentSession().merge(stu);	
			}catch(Exception e){
				System.out.println("Exxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"+e);
			}
			
		}	

		
		@Override
		public void mergeStudent(Student stu2) 
		{
			// TODO Auto-generated method stub
			System.out.println("StudentDAOImpl.updateUser()");
			sessionFactory.getCurrentSession().merge(stu2);
		}
	        
		
		
		@Override
		public void removeStudentById(Integer id) 
		{
			// TODO Auto-generated method stub
			Student stu=(Student) sessionFactory.getCurrentSession().load(Student.class,id);
	        if(null!=stu)
	        {
	            sessionFactory.getCurrentSession().delete(stu);
	        }
			
		}

		@Override
		public Student getStudentById(Integer id)
		{
			// TODO Auto-generated method stub
			return (Student) sessionFactory.getCurrentSession().get(Student.class,id);
		}

		@Override
		public Student getStudentByEmail(String email) {
			// TODO Auto-generated method stub
			try{
				Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Student.class);
				
				criteria.add(Restrictions.like("email", email+"%"));
				Student stu = (Student) criteria.uniqueResult();
				Integer id=stu.getId();
				Student stuMain=studentService.getStudentById(id);
				return stuMain;

			}
			catch(Exception e)
			{
				return null;
			}
			
		}
		
		
		@Override
		public Student getStudentByMobile(String mobile) {
			// TODO Auto-generated method stub
			try{
				Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Student.class);
				criteria.add(Restrictions.like("email", mobile+"%"));
				Student stu = (Student) criteria.uniqueResult();
				Integer id=stu.getId();
				Student stuMain=studentService.getStudentById(id);
				return stuMain;

			}
			catch(Exception e)
			{
				return null;
			}
			
		}
		
	        
		
		
		

		@SuppressWarnings("unchecked")
		@Override
		public List<Student> listStudent() {
			// TODO Auto-generated method stub
			return sessionFactory.getCurrentSession().createQuery("from Student").list();
		}

		
	    
	    
	}

	
	
	
	



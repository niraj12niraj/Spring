package com.supersoft.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.supersoft.model.Excel;
import com.supersoft.model.Student;
import com.supersoft.model.StudentAttedence;
import com.supersoft.service.StudentAttedenceService;





@Repository
public class StudentAttedenceDAOImpl implements StudentAttedenceDAO

{
	
	  @Autowired
	    private SessionFactory sessionFactory;
	    
	    @Autowired
	    private StudentAttedenceService studentAttedenceService;
	
	

		@Override
		public void saveStudentAttedence(StudentAttedence stua) {
			// TODO Auto-generated method stub
			sessionFactory.getCurrentSession().save(stua);
			System.out.println("DATA HAS BEEN SAVED.........");
			
		}
	    
		
		@Override
		public StudentAttedence getStudentAttedenceByAttedenceNo(Integer admission) {
			// TODO Auto-generated method stub
			return (StudentAttedence) sessionFactory.getCurrentSession().get(StudentAttedence.class,admission);
		}
		
		
		@SuppressWarnings("unchecked")
		@Override
		public List<StudentAttedence> listStudentAttedence() {
			// TODO Auto-generated method stub
			return sessionFactory.getCurrentSession().createQuery("from StudentAttedence").list();
		}
	       
		
		@Override
		public void updateStudentAttedence(StudentAttedence stua) 
		{
			// TODO Auto-generated method stub
			System.out.println("StudentAttedenceDAOImpl.updateStudentAttedence()");
			sessionFactory.getCurrentSession().merge(stua);
			
		}


		@Override
		public Student getStudentAttendenceService() {
			// TODO Auto-generated method stub
			return (Student)sessionFactory.getCurrentSession().get(Excel.class,sessionFactory);
		}


		@Override
		public Student getStudentAttedenceById(Integer id) {
			// TODO Auto-generated method stub
			try{
				Excel xl=new Excel();
			
				Student stu=(Student) sessionFactory.getCurrentSession().get(Excel.class,id);
				xl.getAttend();
			}catch(Exception e){
				System.out.println("Please provide valid Id");
			}
			
			
			return null;
		}


		/*@Override
		public Excel getEmpAttedence(Integer rollNo) {
			// TODO Auto-generated method stub
			return (Excel) sessionFactory.getCurrentSession().get(Excel.class,rollNo);
		}
*/
	    

}

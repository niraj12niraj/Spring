package com.supersoft.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.supersoft.model.EmpRegistration;
import com.supersoft.service.EmpRegistrationService;





@Repository
public class EmpRegistrationDAOImpl implements EmpRegistrationDAO
{
	 @Autowired
	    private SessionFactory sessionFactory;
	    
	    @Autowired
	    private EmpRegistrationService empRegistrationService ; 

	    
	    
	    
	    @Override
		public void saveEmpRegistration(EmpRegistration emp) {
			// TODO Auto-generated method stub				
	    	System.out.println("EmpRegistrationDAOImpl.saveEmpRegistration()");
			sessionFactory.getCurrentSession().save(emp);
			System.out.println("DATA HAS BEEN SAVED.........");
			
		}


		@Override
		public void updateEmpRegistration(EmpRegistration emp) 
		{	// TODO Auto-generated method stub
			System.out.println("this doa layer;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
			try{
				sessionFactory.getCurrentSession().merge(emp);	
			}catch(Exception e){
				System.out.println("Exxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"+e);
			}
			
		}	
	    

		@Override
		public EmpRegistration getEmpRegistrationById(Integer id) {
			// TODO Auto-generated method stub
			return (EmpRegistration) sessionFactory.getCurrentSession().get(EmpRegistration.class,id);
		}

		@Override
		public  EmpRegistration getEmpRegistrationByEmail(String email) {
			// TODO Auto-generated method stub
			try{
				Criteria criteria = sessionFactory.getCurrentSession().createCriteria(EmpRegistration.class);
				
				criteria.add(Restrictions.like("email", email+"%"));
				 EmpRegistration stu = (EmpRegistration) criteria.uniqueResult();
				Integer id=stu.getId();
				EmpRegistration empMain=empRegistrationService.getEmpRegistrationById(id);
				return empMain;

			}
			catch(Exception e)
			{
				return null;
			}
		}


		@Override
		public List<EmpRegistration> listEmpRegistration() 
			{
				// TODO Auto-generated method stub
				return sessionFactory.getCurrentSession().createQuery("from EmpRegistration").list();
			}


	@Override
		public EmpRegistration removeEmpRegistrationById(Integer id) {
			// TODO Auto-generated method stub
			EmpRegistration emp=(EmpRegistration) sessionFactory.getCurrentSession().load(EmpRegistration.class,id);
	        if(null!=emp)
	        {
	            sessionFactory.getCurrentSession().delete(emp);
	        }
			return emp;
		}
		

	@Override
	public void mergeEmpRegistration(EmpRegistration emp) {
		// TODO Auto-generated method stub
		System.out.println("UpdateEmpRegistrationImpl.updateEmpRegistration()");
		sessionFactory.getCurrentSession().merge(emp);

	}



}
		
	


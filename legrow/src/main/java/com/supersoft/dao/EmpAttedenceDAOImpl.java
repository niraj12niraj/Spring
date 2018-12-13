package com.supersoft.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.supersoft.model.EmpAttedence;
import com.supersoft.service.EmpAttedenceService;



@Repository
public class EmpAttedenceDAOImpl  implements EmpAttedenceDAO
{
	@Autowired
    private SessionFactory sessionFactory;
    
    @Autowired
    private EmpAttedenceService  empAttedenceService ;



	@Override
	public void saveEmpAttedence(EmpAttedence empa) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(empa);
		System.out.println("DATA HAS BEEN SAVED.........");
		
	}
    
	
	@Override
	public EmpAttedence getEmpAttedenceByEmpId(Integer empid) {
		// TODO Auto-generated method stub
		return (EmpAttedence) sessionFactory.getCurrentSession().get(EmpAttedence.class,empid);
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<EmpAttedence> listEmpAttedence() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from EmpAttedence").list();
	}
       
	
	@Override
	public void updateEmpAttedence(EmpAttedence empa) 
	{
		// TODO Auto-generated method stub
		System.out.println("EmpAttedenceDAOImpl.updateEmpAttedence()");
		sessionFactory.getCurrentSession().merge(empa);
		
	}

    

}

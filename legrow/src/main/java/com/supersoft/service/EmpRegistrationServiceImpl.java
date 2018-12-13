package com.supersoft.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.supersoft.dao.EmpRegistrationDAO;
import com.supersoft.model.EmpRegistration;




@Repository
public class EmpRegistrationServiceImpl implements EmpRegistrationService
{
	@Autowired
    private EmpRegistrationDAO empRegistrationDAO;

    @Transactional
	@Override
	public void saveEmpRegistration(EmpRegistration emp) 
    {
		// TODO Auto-generated method stub
    	System.out.println("EmpRegistrationServiceImpl.saveEmpRegistration()");
    	empRegistrationDAO.saveEmpRegistration(emp);
		
	} 
    
    
    
    @Transactional
	@Override
	public void updateEmpRegistration(EmpRegistration emp)
    	{
		System.out.println("StudentServiceImpl.updateStudent()");
		// TODO Auto-generated method stub
		empRegistrationDAO.updateEmpRegistration(emp);
		}
    

    @Transactional
    @Override
	public void removeEmpRegistrationById(Integer id) {
		// TODO Auto-generated
    	empRegistrationDAO.removeEmpRegistrationById(id);
		
		
	}

    @Transactional
    @Override
	public EmpRegistration getEmpRegistrationById(Integer id) {
		// TODO Auto-generated method stub
		return empRegistrationDAO.getEmpRegistrationById(id);
	}

    @Transactional
	@Override
	public EmpRegistration getEmpRegistrationByEmail(String email) {
		// TODO Auto-generated method stub
		return empRegistrationDAO.getEmpRegistrationByEmail(email);
	}
    

    @Transactional
	@Override
	public List<EmpRegistration> listEmpRegistration() {
		// TODO Auto-generated method stub
		return empRegistrationDAO.listEmpRegistration();
	}
   
    @Transactional
    @Override
	public void mergeEmpRegistration(EmpRegistration emp) {
		// TODO Auto-generated method stub
		empRegistrationDAO.mergeEmpRegistration(emp);
	}
   
    
    
    
}
package com.supersoft.dao;

import java.util.List;

import com.supersoft.model.EmpRegistration;




public interface EmpRegistrationDAO 
{

	public void saveEmpRegistration(EmpRegistration emp);
	
	public void updateEmpRegistration(EmpRegistration emp);
	
	public EmpRegistration removeEmpRegistrationById(Integer id);	
	
	public EmpRegistration getEmpRegistrationById(Integer id);
	
	public EmpRegistration getEmpRegistrationByEmail(String email);
	
	public List<EmpRegistration> listEmpRegistration();
	
	public void mergeEmpRegistration(EmpRegistration emp);
	
	
}

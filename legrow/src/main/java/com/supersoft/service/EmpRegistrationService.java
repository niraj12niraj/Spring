package com.supersoft.service;

import java.util.List;

import com.supersoft.model.EmpRegistration;




public interface EmpRegistrationService
{
	public void saveEmpRegistration(EmpRegistration emp);
	
	public void removeEmpRegistrationById(Integer id);
	
	
	public EmpRegistration getEmpRegistrationById(Integer id);
	
	public EmpRegistration getEmpRegistrationByEmail(String email);
	

	public List<EmpRegistration> listEmpRegistration();

	public void updateEmpRegistration(EmpRegistration emp);
	
	public void mergeEmpRegistration(EmpRegistration emp);

}

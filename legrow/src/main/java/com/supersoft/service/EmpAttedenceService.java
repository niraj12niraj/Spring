package com.supersoft.service;

import java.util.List;

import com.supersoft.model.EmpAttedence;


public interface EmpAttedenceService 
{
	public void saveEmpAttedence(EmpAttedence empa);
	
	public void updateEmpAttedence(EmpAttedence empa);

	public EmpAttedence getEmpAttedenceByEmpId(Integer empid);
	
	public List<EmpAttedence> listEmpAttedence();
	
	

}

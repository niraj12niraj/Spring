package com.supersoft.dao;

import java.util.List;

import com.supersoft.model.EmpAttedence;



public interface EmpAttedenceDAO 
{

	public void saveEmpAttedence(EmpAttedence empa);
	
	public void updateEmpAttedence(EmpAttedence empa);

	public EmpAttedence getEmpAttedenceByEmpId(Integer empid);
	
	public List<EmpAttedence> listEmpAttedence();
	
	
}

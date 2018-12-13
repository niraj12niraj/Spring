package com.supersoft.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.supersoft.dao.EmpAttedenceDAO;
import com.supersoft.model.EmpAttedence;


@Repository

public class EmpAttedenceServiceImp implements EmpAttedenceService {

	@Autowired
    private EmpAttedenceDAO empAttedenceDAO ;
	
	 @Transactional
		@Override
		public void saveEmpAttedence(EmpAttedence empa)
		{
			// TODO Auto-generated method stub
		 empAttedenceDAO.saveEmpAttedence(empa);
			
		}  
	 
	 @Transactional
		@Override
		public void updateEmpAttedence(EmpAttedence empa) {
			System.out.println("EmpAttedenceServiceImp.updateEmpAttedence()");
			// TODO Auto-generated method stub
			empAttedenceDAO.updateEmpAttedence(empa);
			
		}	    
	  
	  @Transactional
	    @Override
		public EmpAttedence getEmpAttedenceByEmpId(Integer empid) 
	  {
			// TODO Auto-generated method stub
			return empAttedenceDAO.getEmpAttedenceByEmpId(empid);
			} 
		
	    
		
	  @Transactional
		@Override
		public List<EmpAttedence> listEmpAttedence() {
			// TODO Auto-generated method stub
			return  empAttedenceDAO.listEmpAttedence();
		}
	
}
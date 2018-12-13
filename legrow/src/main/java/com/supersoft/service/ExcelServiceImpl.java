package com.supersoft.service;

import java.util.List;


import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.supersoft.dao.ExcelDAO;
import com.supersoft.model.Excel;



@Repository
public class ExcelServiceImpl implements ExcelService

{
	@Autowired
    private ExcelDAO excelDAO ;
	
	 @Transactional
		@Override
		public void saveExcel(Excel excel)
		{
		 System.out.println("Thos is your service layer....................");
			
		 excelDAO.saveExcel(excel);
			
		}
	 
	 
	 @Transactional
	    @Override
		public Excel getExcelById(Integer no) {
			
			return excelDAO.getExcelById(no);
		}


	 @Transactional
	@Override
	public void updateExcel(Excel excel) {
		
		 excelDAO.updateExcel(excel);
	}  	
	 
		
	  @Transactional
		@Override
		public List<Excel> listExcel() {
			
			return  excelDAO.listExcel();
		}

}
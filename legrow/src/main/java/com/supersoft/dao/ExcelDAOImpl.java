package com.supersoft.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.supersoft.model.Excel;
import com.supersoft.service.ExcelService;




public class ExcelDAOImpl implements ExcelDAO
{
	
	 @Autowired
	    private SessionFactory sessionFactory;
	 
	 @Autowired
	    private ExcelService excelService ; 

	
	@Override
	public void saveExcel(Excel excel) {
		// TODO Auto-generated method stub
		try{
			sessionFactory.getCurrentSession().save(excel);
			System.out.println("DATA HAS BEEN SAVED::::::::::::::::::::::.........");
		}catch(Exception e){
			System.out.println("THIS IS YOUR MAIN EXCEPTION:::::::::::::"+e);
		}
		
			}

	
	@Override
	public Excel getExcelById(Integer no) {
		// TODO Auto-generated method stub
		return (Excel) sessionFactory.getCurrentSession().get(Excel.class,no);
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Excel> listExcel() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Excel").list();
	}
       
	

	@Override
	public void updateExcel(Excel excel) {
		// TODO Auto-generated method stub
	
		try{
			sessionFactory.getCurrentSession().createQuery("update EXCEL set SUBJECT = +excel+ where SUBJECT='NULL'");	
		}catch(Exception e)
		
		{
			System.out.println("HERE IS YOUR PROBLEM:::::::::::::::::::"+e);
		}
		
		
	}

	
}
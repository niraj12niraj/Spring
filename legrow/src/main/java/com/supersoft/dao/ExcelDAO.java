package com.supersoft.dao;

import java.util.List;
import com.supersoft.model.Excel;


public interface ExcelDAO 
{
	public void saveExcel(Excel excel);

	public void updateExcel(Excel excel);
	
	public Excel getExcelById(Integer no);
	
	public List<Excel> listExcel();
	
	
}
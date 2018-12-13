package com.supersoft.service;

import java.util.List;
import com.supersoft.model.Excel;

public interface ExcelService 
{
	public void saveExcel(Excel excel);
	public void updateExcel(Excel excel);
	public Excel getExcelById(Integer no);
	public List<Excel> listExcel();
	
}



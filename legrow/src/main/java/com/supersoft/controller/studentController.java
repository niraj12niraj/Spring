package com.supersoft.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.supersoft.model.Excel;
import com.supersoft.model.Student;
import com.supersoft.model.Student_FeeDetail;
import com.supersoft.model.UserProfile;
import com.supersoft.service.ExcelService;
import com.supersoft.service.Student_FeeDetailService;
import com.supersoft.service.UserProfileService;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

@Controller
@RequestMapping("/student")
public class studentController {

	@Autowired
	private UserProfileService userProfileService;
	
	@Autowired
	private ExcelService excelService;
	
	
	@Autowired
	private Student_FeeDetailService student_FeeDetailService;

	@RequestMapping(value = "/SearchStudentAttdence", method = RequestMethod.GET)
	public String SearchStudentAttdence()
	{
		System.out.println("SearchEmployee method of admin");
		return "SearchStudentAttdence";
	}
	
	
	@RequestMapping(value = "/SearchStudentAttdence1", method = RequestMethod.GET)
	public String SearchStudentAttdence1()
	{
		System.out.println("SearchStudent method of admin");
		return "SearchStudentAttdence1";
	}

	
	@RequestMapping(value = "/SearchStudentFeeByID", method = RequestMethod.GET)
	public String SearchStudentFeeByID()
	{
		System.out.println("SearchStudent method of admin");
		return "SearchStudentFeeByID";
	}
	

	@RequestMapping(value = "/SearchStudentFeeByID1", method = RequestMethod.GET)
	public String SearchStudentFeeByID1()
	{
		System.out.println("SearchStudent method of admin");
		return "SearchStudentFeeByID1";
	}


	
	
	@RequestMapping(value = "/student")
	public String student()
	{
		System.out.println("this is calling of student controller.........");
		return"Studentdb";
	}
		

	@RequestMapping(value = "/changestudentPass")
	public String studentPassword() {
		return "changestudentPass";
	}

	@RequestMapping(value = "/changePass2", method = RequestMethod.POST)
	public String studentPassword(HttpServletRequest req, ModelMap model, Principal principal) {
		String email = principal.getName();
		UserProfile user =userProfileService.getUserProfileByEmail(email);
		String databasePassword=user.getPassword();
	
		String pass = req.getParameter("pass");
		System.out.println(1);
		System.out.println("pass"+pass);
		System.out.println(2);
		String newPass = req.getParameter("newPass");
		System.out.println(3);
		String conPass = req.getParameter("conPass");
		System.out.println("databasePassword="+databasePassword);
		
		System.out.println(4);
		System.out.println("newPass="+newPass);
		System.out.println(5);
		System.out.println("conPass"+conPass);
		if (pass.equals(databasePassword)) {
			
			user.setPassword(conPass);
		
			
			
			model.addAttribute("change", "Your Password Sucessfully changed !");
			userProfileService.mergeUserProfile(user);
		} else {
			model.addAttribute("nochange", "Your Password Not Changed Now due to wrong Password !");
			 return "changestudentPass";
		}
		return "Studentdb";
	}

		
	

	// Attedence By INFORMATION BY ID
	@RequestMapping("/getAttdenceByID")
	public String getAttdence(ModelMap model, Principal principal,HttpServletRequest request,HttpServletResponse response) {
		int no = Integer.parseInt(request.getParameter("abhishek"));	
		System.out.println("hereb is your :::::::::::::::::::::::::::::::id is recieved   :   " + no);				   
		Excel excel = excelService.getExcelById(no);
        System.out.println("helllo i am here:::::::::::::;;;"+excel.getName());                    
        model.addAttribute("excel", excel);                    
		return "SearchStudentAttdence1";
	}
	
	
	// STUDENT INFORMATION BY ID
	@RequestMapping("/getStudentFeeByID")
	public String getStudentFee(ModelMap model, Principal principal,HttpServletRequest request,HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("abhishek"));
		System.out.println(" hereb is your :::::::::::::::::::::::::::::::id is recieved   :   " + id);	   
		Student_FeeDetail stufee = student_FeeDetailService.getStudent_FeeDetailById(id);
        System.out.println("hello i am here:::::::::::::;;;"+stufee.getName());                    
        model.addAttribute("stufee", stufee);
		return "SearchStudentFeeByID1";
	}
	

	
	
	// EXCEL READING IN DATABASES

	@RequestMapping("/saveExcel")
	public String saveExcel(HttpServletRequest request, HttpServletResponse response, ModelMap model)
			throws IOException, BiffException, RowsExceededException, WriteException {
		String name = request.getParameter("name");
		String department = request.getParameter("department");
		String lowr = request.getParameter("lowr");
		String lowa= request.getParameter("lowa");
		String latet= request.getParameter("latet");
		String lm = request.getParameter("lm");
		String elt = request.getParameter("elt");
		String elm = request.getParameter("elm");
		String otr = request.getParameter("otr");				
		String ots = request.getParameter("ots");
		String attend = request.getParameter("attend");
		String bt = request.getParameter("bt");
		String ab = request.getParameter("ab");
	    String l=request.getParameter("l");
	    String bpr=request.getParameter("bpr");
		String bpo = request.getParameter("bpo");
		String bpa = request.getParameter("bpa");
		String pde = request.getParameter("pde");
		String pdl = request.getParameter("pdl");
	    String pdd=request.getParameter("pdd");
	    String ap=request.getParameter("ap");
	    String memo=request.getParameter("memo");
		

		try {

			FileInputStream input = new FileInputStream("/home/supersoft/Desktop/001_2016_5_MON.XLS");
			POIFSFileSystem fs = new POIFSFileSystem(input);
			HSSFWorkbook wb = new HSSFWorkbook(fs);
			HSSFSheet sheet = wb.getSheetAt(0);

			Row row;
			for (int i = 1; i <= sheet.getLastRowNum(); i++) {
				row = sheet.getRow(i);
				
				System.out.println("NAME11111>>>>>>>>>>>>>>>>>>>>>>>>");
				String name1 = row.getCell(1).getStringCellValue();
				System.out.println("Name2222222>>>>>>>>>>>>>>>>>>>>>>>>"+name);
				String department1 = row.getCell(2).getStringCellValue();
				System.out.println("Department3333333333>>>>>>>>>>>>>>>>>>>>>>>>"+department);
				String lowr1 = row.getCell(3).getStringCellValue();
				System.out.println("Lowr4444444444>>>>>>>>>>>>>>>>>>>>>>>>"+lowr);
				String lowa1 = row.getCell(4).getStringCellValue();
				System.out.println("Lowa>>>>>>>>>>>>>>>>>>>>>>>>"+lowa);
				String latet1 = row.getCell(5).getStringCellValue();
				System.out.println("Latet66666666666666>>>>>>>>>>>>>>>>>>>>>>>>"+latet);
				String lm1 = row.getCell(6).getStringCellValue();
				System.out.println("Lm777777777>>>>>>>>>>>>>>>>>>>>>>>>"+lm);									
				String elt1 = row.getCell(7).getStringCellValue();
				System.out.println("ELT88888888888>>>>>>>>>>>>>>>>>>>>>>>>"+elt);
				String elm1 = row.getCell(8).getStringCellValue();
				System.out.println("ELM9999999999>>>>>>>>>>>>>>>>>>>>>>>>"+elm);
				String otr1 = row.getCell(9).getStringCellValue();
				System.out.println("OTR00000000>>>>>>>>>>>>>>>>>>>>>>>>"+otr);
				String ots1 = row.getCell(10).getStringCellValue();
				System.out.println("OTS11111111111>>>>>>>>>>>>>>>>>>>>>>>>"+ots);
				String attend1 = row.getCell(11).getStringCellValue();
				System.out.println("Attend112222222222222222>>>>>>>>>>>>>>>>>>>>>>>>"+attend);
				String bt1 = row.getCell(12).getStringCellValue();
				System.out.println("BT113333333333>>>>>>>>>>>>>>>>>>>>>>>>"+bt);
				String ab1 = row.getCell(13).getStringCellValue();
				System.out.println("AB1144444444444>>>>>>>>>>>>>>>>>>>>>>>>"+ab);
				String l1 = row.getCell(14).getStringCellValue();
				System.out.println("L......1115555555555555>>>>>>>>>>>>>>>>>>>>>>>>"+l);
				String bpr1 = row.getCell(15).getStringCellValue();
				System.out.println("BPR.......111666666666666>>>>>>>>>>>>>>>>>>>>>>>>"+bpr);
				String bpo1 = row.getCell(16).getStringCellValue();
				System.out.println("BPO..........11111777777777777777>>>>>>>>>>>>>>>>>>>>>>>>"+bpo);
				String bpa1 = row.getCell(17).getStringCellValue();
				System.out.println("BPA..........Line111118888888888>>>>>>>>>>>>>>>>>>>>>>>>"+bpa);
				String pde1 = row.getCell(18).getStringCellValue();
				System.out.println("PDE..............Line11111999999999999999999>>>>>>>>>>>>>>>>>>>>>>>>"+pde);
				String pdl1 = row.getCell(19).getStringCellValue();
				System.out.println("PDL...........Line20000000000000000000000000000000>>>>>>>>>>>>>>>>>>>>>>>>"+pdl);
				String pdd1 = row.getCell(20).getStringCellValue();
				System.out.println("PDD............Line211111111111>>>>>>>>>>>>>>>>>>>>>>>>"+pdd);
				String ap1 = row.getCell(21).getStringCellValue();
				System.out.println("AP...............Line222222228888>>>>>>>>>>>>>>>>>>>>>>>>"+ap);
				String memo1 = row.getCell(22).getStringCellValue();
				System.out.println("MEMO................NAME23333333333333333333333333>>>>>>>>>>>>>>>>>>>>>>>>"+memo);
				Excel excel = new Excel();
				excel.setName(name1);
				excel.setDepartment(department1);
				excel.setLowr(lowr1);
				excel.setLowa(lowa1);
				excel.setLatet(latet1);
				excel.setLatemin(lm1);
				excel.setElt(elt1);
				excel.setElm(elm1);
				excel.setOtr(otr1);
				excel.setOts(ots1);
				excel.setAttend(attend1);
				excel.setBt(bt1);
				excel.setAb(ab1);
				excel.setL(l1);
				excel.setBpr(bpr1);
				excel.setBpo(bpo1);
				excel.setBpa(bpa1);
				excel.setPde(pde1);
				excel.setPdl(pdl1);
				excel.setPdd(pdd1);
				excel.setActualpay(ap1);
				excel.setMemo(memo1);
				excelService.saveExcel(excel);
			}
			}
			catch (Exception ex) 
			{
			System.out.println("Exception is Controller......" + ex);
			}

							
		return "Excel1";
	}
    @RequestMapping("/returnStudentHome")
	public String getStudentHome(){
		return "Studentdb";
	}
	
	
	
	}

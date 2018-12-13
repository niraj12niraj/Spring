package com.supersoft.controller;
import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.supersoft.model.Excel;
import com.supersoft.model.UserProfile;
import com.supersoft.service.ExcelService;
import com.supersoft.service.UserProfileService;

@Controller
@RequestMapping("/employee")
public class EmployeeController 
{
	
	@Autowired
	private UserProfileService userProfileService;
	
	@Autowired
	private ExcelService excelService;
	
	
	
	@RequestMapping(value = "/employee")
	public String employee(){
		System.out.println("this is calling of employee controller.........");
		return"EmployeeDashboard";
	}
	
	
	
	@RequestMapping(value = "/SearchEmployeeAttdence", method = RequestMethod.GET)
	public String SearchEmployeeAttdence()
	{
		System.out.println("SearchE mployee method of admin");
		return "SearchEmployeeAttdence";
	}
	
	
	@RequestMapping(value = "/SearchEmployeeAttdence1", method = RequestMethod.GET)
	public String SearchEmployeeAttdence1()
	{
		System.out.println("Search Employee method of admin");
		return "SearchEmployeeAttdence1";
	}
	
	
	
	


	/*----------change employee Password--------*/	

	@RequestMapping(value = "/changeEmployeePass")
	public String empPassword() {
		return "changeEmployeePass";
	}

	@RequestMapping(value = "/changePass3", method = RequestMethod.POST)
	public String empPassword(HttpServletRequest req, ModelMap model, Principal principal) {
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
			return "changeEmployeePass";
		}
		return "EmployeeDashboard";
	}
    
    
	
	
	// Attedence By INFORMATION BY ID
		@RequestMapping("/getAttdenceByID")
		public String getAttdence(ModelMap model, Principal principal,HttpServletRequest request,HttpServletResponse response) {
			int no = Integer.parseInt(request.getParameter("abhishek"));	
			System.out.println("hereb is your :::::::::::::::::::::::::::::::id is recieved   :   " + no);				   
			Excel excel = excelService.getExcelById(no);
	        System.out.println("helllo i am here:::::::::::::;;;"+excel.getName());                    
	        model.addAttribute("excel", excel);                    
			return "SearchEmployeeAttdence1";
		}
		
  
    
	

}

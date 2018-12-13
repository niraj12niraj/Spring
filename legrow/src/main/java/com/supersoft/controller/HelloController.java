package com.supersoft.controller;


import com.supersoft.model.EmpRegistration;

import com.supersoft.model.Excel;
import com.supersoft.model.ForgotPass;
import com.supersoft.model.Student;
import com.supersoft.model.UserProfile;
import com.supersoft.service.EmpRegistrationService;
import com.supersoft.service.ExcelService;
import com.supersoft.service.ForgotPassService;
import com.supersoft.service.StudentService;
import com.supersoft.service.UserProfileService;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.util.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Principal;
import java.util.Collection;
import java.util.UUID;



@Controller
@RequestMapping("/")
public class HelloController {

	
	
	@Autowired
	private UserProfileService userProfileService;
		
	@Autowired
	private ForgotPassService forgotPassService;
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private EmpRegistrationService empRegistrationService;
	
	private String host = "mail.leggrow.com";
	private String portNo = "25";
	
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(Principal principal, ModelMap model) {
		try {
			String userName=principal.getName();
			model.addAttribute("userName",userName);
			return "index";
		} catch (Exception e) {
			return "index";
		}
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String printWelcome2(Principal principal, ModelMap model) {
		try {
			
			String userEmail = principal.getName();
			model.addAttribute("userEmail", userEmail);

			return "index";
		} catch (Exception e) {
			return "index";
		}
	}




	@RequestMapping(value = "/signUp", method = RequestMethod.GET)
	public String signUp(Principal principal, ModelMap model) {
		try {
			String userEmail = principal.getName();
			model.addAttribute("userEmail", userEmail);
			return "signUpUser";
		} catch (Exception e) {
			return "signUpUser";
		}
	}

	@RequestMapping(value = "/signUpUser", method = RequestMethod.GET)
	public String signUpUser(Principal principal, ModelMap model) {
		try {
			String userEmail = principal.getName();
			model.addAttribute("userEmail", userEmail);
			return "signUp";
		} catch (Exception e) {
			return "signUp";
		}
	}


	@RequestMapping(value = "/saveSignUp", method = RequestMethod.POST)
	public String signUp(HttpServletRequest request, ModelMap model) throws MessagingException {
		String fullName, email, password, mobileNumber, address, city, state, pincode, website, authority;
		fullName = request.getParameter("fullName");
		email = request.getParameter("email");
		password = request.getParameter("password");
		authority = request.getParameter("authority");
		mobileNumber = request.getParameter("mobileNumber");
		address = request.getParameter("address");
		city = request.getParameter("city");
		state = request.getParameter("state");
		pincode = request.getParameter("pincode");
		website = request.getParameter("website");
		System.out.println("fullName: " + fullName);
		System.out.println("email : " + email);
		System.out.println("password : " + password);
		System.out.println("authority : " + authority);
		System.out.println("mobileNumber: " + mobileNumber);
		System.out.println("address: " + address);
		System.out.println("city: " + city);
		System.out.println("state: " + state);
		System.out.println("country: INDIA");
		System.out.println("pincode : " + pincode);
		System.out.println("website : " + website);
		System.out.println("enabled: TRUE");
		UserProfile userProfile = new UserProfile();
		userProfile.setFullName(fullName);
		userProfile.setEmail(email);
		userProfile.setPassword(password);
		userProfile.setMobileNumber(mobileNumber);
		userProfile.setAddress(address);
		userProfile.setCity(city);
		userProfile.setPincode(pincode);
		userProfile.setState(state);
		userProfile.setCountry("INDIA");
		userProfile.setEnabled(1 < 2);
		userProfile.setAuthority(authority);

		userProfile.setWebsite(website);

		userProfileService.saveUserProfile(userProfile);

		model.addAttribute("mobileNo", mobileNumber);	

		return "index";
		/*return "sms";*/
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLogin(@RequestParam(value = "error", required = false) String error, ModelMap model,
			@RequestParam(value = "logout", required = false) String logout) {
		if (error != null) {
			model.addAttribute("error", "Invalid username and password");
		}
		if (logout != null) {
			model.addAttribute("msg", "You've been logged out successfully.");
		}
		return "login";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "redirect:/index?logout";
	}

	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public String accesssDenied(Principal user, ModelMap model) {
		if (user.getName() != null) {
			model.addAttribute("msg", "Hi " + user.getName() + ", you do not have permission to access this page!");
		} else {
			model.addAttribute("msg", "You do not have permission to access this page!");
		}
		return "403";
	}

	@RequestMapping(value = "/profile")
	public String my(Authentication authentication, Principal principal, ModelMap model, HttpServletRequest request,
			HttpServletResponse response) {
		boolean isStudent = false;
		boolean isAdmin = false;
	/*	boolean isCustomer = false;*/
		boolean isEmployee = false;
		/* String email=principal.getName(); */
		Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
		for (GrantedAuthority grantedAuthority : authorities) {
			if (grantedAuthority.getAuthority().equals("ROLE_STUDENT")) {
				isStudent = true;
				break;
				/*
				 * Authentication auth =
				 * SecurityContextHolder.getContext().getAuthentication(); if
				 * (auth != null){ new
				 * SecurityContextLogoutHandler().logout(request, response,
				 * auth); isAdmin = true; break; } else { isStudent = true; break;
				 * }
				 */
			} else if (grantedAuthority.getAuthority().equals("ROLE_ADMIN")) {
				isAdmin = true;
				break;
			}

/*			else if (grantedAuthority.getAuthority().equals("ROLE_CUSTOMER")) {
				isCustomer = true;
				break;
			}*/

			else if (grantedAuthority.getAuthority().equals("ROLE_EMPLOYEE")) {
			System.out.println("employee problem*********************************************************");
				isEmployee = true;
				break;
			}
		}
		if (isStudent) {

			model.addAttribute("name", "updateProfile");
			return "redirect:/student/student";
			/*
			 * String userEmail=principal.getName(); UserProfile
			 * userProfile=userProfileService.getUserProfileByEmail(userEmail);
			 * String test=userProfile.getFullName(); System.out.println(
			 * "full name: "+test); if(test == null) { return
			 * "redirect:/user/profile"; } else { return "redirect:/user"; }
			 */
		} else if (isAdmin) {

			return "redirect:/admin/adminProfile";
			
			
		}

		/*else if (isAdmin) 
		{
			return "redirect:/admin/AddUser";		
		}*/

		else if (isEmployee) {
			System.out.println("employee problem#########################################################");
			return "redirect:/employee/employee";
		}

		else {
			throw new IllegalStateException();
		}
	}

	
	
	

	
		@RequestMapping(value = "/forgotPassword1", method = RequestMethod.GET)
		public String forgot(Principal principal, ModelMap model) {
			try {
				String userEmail = principal.getName();
			
				model.addAttribute("userEmail", userEmail);
				return "forgotPassword";
			} catch (Exception e) {
				return "forgotPassword";
			}
		}
		 @RequestMapping("/emailSend")
		    public  String updateForgotPassword(Principal principal, ModelMap model, HttpServletRequest request){
			 String fullName, email, password, mobileNumber, address, city, state, pincode, website, authority;
				/*fullName = request.getParameter("fullName");*/
				email = request.getParameter("email");
			
				System.out.println("email : " + email);
				UserProfile user= userProfileService.getUserProfileByEmail(email);
				try{
				ForgotPass userProfile = new ForgotPass();
				/*userProfile.setFullName(fullName);*/
				userProfile.setEmail(email);
				

				forgotPassService.saveUserProfile(userProfile);
												
	  			// for email service
				String subject = "from LegGrow";
				String senderEmail = "info@leggrow.com";
				String senderPassword = "theone123";
				String receiverEmail = request.getParameter("email");
				
				UUID uuid = UUID.randomUUID();
		        String randomUUIDString = uuid.toString();

		       /* user.setUuid(randomUUIDString);
		        userProfileService.mergeUserProfile(user);
		        System.out.println("Random UUID String = " + randomUUIDString);
			
				String content = "<!DOCTYPE html>" + "<html>" + "<head>" + "</head>"
						+ "<body style='height:450px;background-color:#800000;align:center;'>" + "<br><br>"
						+ "<div style='font-size:14px;background-color:white;padding-left:10px;margin-left:5%;width:90%'>"
						+ "<img src='<%= request.getContextPath()%>/resources/images/logo.png' style='height: 45px;width: 100px'  align='left'/>"
						+"<h1 style='align:center;'>Please Varify your email id!</h1>"
						
						+ "<h1 style='align:center;'>   Change your password </h1>" 
						+"<form action='http://localhost:8080/legrow/updatePass'>"
						+"<input type='text' name='uuid' value='${randomUUIDString}' >"
						+"<input type='text' name='email' value='' >"
						+"</form>"
						+ "<a href='http://localhost:8080/legrow/updatePass?name="+randomUUIDString+"!"+email+"'>Click here to Get you Password</a>"  + "<p>   </p>" + "<br>" + "<br>"
						+ "<a href='http://localhost:8080/legrow/updatePass?name="+randomUUIDString+"!"+email+"'>Click here to Get you Password</a>"  + "<p>   </p>" + "<br>" + "<br>"
						+randomUUIDString +"<p>You Email_id is: </p>"+ email
						+ "<p>Thank & Regards,</p>" + "<br>" + "<p>Team LegGrow</p>" + "<p>Sincerely,</p>";
				EmailUtility.sendEmail(host, portNo, senderEmail, senderPassword, receiverEmail, subject, content);
*/
				return "ForgotSuccess";
				}	
				catch(Exception e){
					model.addAttribute("msg","Email_id does not exist.");
					return "forgotPassword";
				}
			
		        
		    }
		  @RequestMapping(value = "/setNewPassword", method = RequestMethod.POST)
		    public String setNewPassword(HttpServletRequest request, ModelMap model){
			  String email=request.getParameter("email1");
			  String pass=request.getParameter("cnfPWD");
			  UserProfile userProfile=userProfileService.getUserProfileByEmail(email);
			  userProfile.setPassword(pass);
			  userProfileService.mergeUserProfile(userProfile);
			  model.addAttribute("msg","You have changed password Successfully");
			  return "ForgotChangePass";
		  }
		 
		    @RequestMapping(value = "/updatePass", method = RequestMethod.GET)
		    public String changePass1(HttpServletRequest request, ModelMap model){
		    	String uuidAndEmail=request.getParameter("name");
		    	String phone = "012-3456789";
		    
		    	System.out.println(1);
		    	String[] token = uuidAndEmail.split("!");
		    	System.out.println(2);
		    	String checkUUID=token[0];
		    	System.out.println(3);
		    	String checkEmail=token[1];
		    	System.out.println(4);
		    	System.out.println(checkUUID);
		    	System.out.println(5);
		   	System.out.println(checkEmail);
		    	System.out.println(6);
		    	UserProfile user11= userProfileService.getUserProfileByEmail(checkEmail);
		    	String uuidStore=user11.getUuid();
		    	if(uuidStore.equals(checkUUID)){
		    		model.addAttribute("email", checkEmail);
		    		model.addAttribute("name","match");
		    		
		    	return"ForgotChangePass";
		    	
		    	}else{
		    	model.addAttribute("name","notmatch");
		    	return"ForgotChangePass"; }
		    }
	
		    
		    
		    
		 
		    
		   
		    
			
			/*----------change user Password--------*/	
			
			@RequestMapping(value = "/changePass1")
			public String sendUserPassword() {
				return "changePass";
			}

			
			@RequestMapping(value = "/changePass1", method = RequestMethod.POST)
			public String changePassword(HttpServletRequest req, ModelMap model, Principal principal) {
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
					return "userProfile";
				}
				  
				return "userProfile";
			}

			
			
			
			
}

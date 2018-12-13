package com.supersoft.controller;

import java.io.ByteArrayInputStream;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.apache.poi.hssf.model.Model;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.util.IOUtils;
import org.hibernate.SessionFactory;
/*import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;


import com.supersoft.model.EmpRegistration;
import com.supersoft.model.Excel;
import com.supersoft.model.Student;
import com.supersoft.model.Student_FeeDetail;
import com.supersoft.model.UserProfile;
import com.supersoft.service.EmpRegistrationService;
import com.supersoft.service.ExcelService;
import com.supersoft.service.StudentAttedenceService;
import com.supersoft.service.StudentService;
import com.supersoft.service.Student_FeeDetailService;
import com.supersoft.service.UserProfileService;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;


@Controller
@RequestMapping("/admin")

public class adminController {
	
	@Autowired
	private ExcelService excelService;
	
	@Autowired
	private UserProfileService userProfileService;
		
	
	@Autowired
	private  EmpRegistrationService empRegistrationService;
	
	@Autowired
	private Student_FeeDetailService student_FeeDetailService;
	
	@Autowired
	private  StudentService studentService;
	
		
	@RequestMapping(value = "/adminProfile")
	public String adminDashBoard()
	{
		System.out.println("This is calling of admin controller..............");
		return"Admindb";
	}
	
	/*@RequestMapping(value = "/testing")
	public String testing(){
		System.out.println("this is for testing......");
		return"testing";
	}*/
				 // SAVE EMPLOYEE REGISTRATION
	
	
	
	@RequestMapping(value = "/AddEmployee", method = RequestMethod.GET)
	public String AddEmployee()
	{
		System.out.println("AddEmployee method of admin");
		return "AddEmployee";
	}
	
	
	@RequestMapping(value = "/EmployeeList", method = RequestMethod.GET)
	public String List()
	{					
		return "EmployeeList";
	}
	
	
	@RequestMapping(value = "/AddStudent", method = RequestMethod.GET)
	public String AddStudent(){
		System.out.println("AddStudent method of admin");
		return "AddStudent";
	}
	
	@RequestMapping(value = "/SearchStudent", method = RequestMethod.GET)
	public String SearchStudent(){
		System.out.println("SearchStudent method of admin");
		return "SearchStudent";
	}
	
	
	@RequestMapping(value = "/SearchStudent1", method = RequestMethod.GET)
	public String SearchStudent1(){
		System.out.println("SearchStudent method of admin");
		return "SearchStudent1";
	}
	
	
	
	
	@RequestMapping(value = "/SearchEmployee", method = RequestMethod.GET)
	public String SearchEmployee(){
		System.out.println("SearchEmployee method of admin");
		return "SearchEmployee";
	}
	
	
	@RequestMapping(value = "/SearchEmployee1", method = RequestMethod.GET)
	public String SearchEmployee1(){
		System.out.println("SearchStudent method of admin");
		return "SearchEmployee1";
	}
	
	
	
	
	@RequestMapping(value = "/SearchAttedence", method = RequestMethod.GET)
	public String SearchAttedence(){
		System.out.println("SearchEmployee method of admin");
		return "SearchAttedence";
	}
	
	
	@RequestMapping(value = "/SearchAttedence1", method = RequestMethod.GET)
	public String SearchExcel1(){
		System.out.println("SearchStudent method of admin");
		return "SearchAttedence1";
	}
	

	// EMPLOYYE DELETE BY ID
		@RequestMapping(value = "/deleteEmpRegistrationByID/{id}", method = RequestMethod.GET)
		public String deleteEmpRegistration(@PathVariable("id") Integer id, HttpServletRequest request, ModelMap model) {
			System.out.println("id is recieved   :   " + id);
			empRegistrationService.removeEmpRegistrationById(id);
			model.addAttribute("EmployeeDELETE", "Employee IS REMOVEDDDDDDDDDDDDDDDDDDD.................");
		    return  "redirect:/admin/EmployeeListDetail";
		}
	
		

		@RequestMapping(value = "/StudentFeeList", method = RequestMethod.GET)
		public String StudentFeeList()
		{					
			return "StudentFeeList";
		}


		// SHOW LIST OF STUDENTS
		@RequestMapping(value = "/StudentFeeListDetail")
		public String showStudentsFee(ModelMap map) {
			try{
			List<Student_FeeDetail> stufee = student_FeeDetailService.listStudent_FeeDetail();
			Iterator<Student_FeeDetail> itr = stufee.iterator();
			// traversing elements of ArrayList object
			while (itr.hasNext()) {
				Student_FeeDetail st = (Student_FeeDetail) itr.next();
				System.out.println(st.getId() + " " + st.getName() + " " + st.getExaminationfee() + " " + st.getHostelfee() + " "
						+ st.getRegistrationfee() + " " + st.getTutionfee());
			}
			System.out.println(stufee);
			map.addAttribute("stufee", stufee);
			}catch(Exception e){
				System.out.println("Fee List not available or deleted");
			}
			return "StudentFeeList";
		}
		
		
		
		
		
		

		@RequestMapping(value = "/StudentFeeRegister", method = RequestMethod.GET)
		public String StudentFeeRegister(){
			System.out.println("SearchStudent method of admin");
			return "StudentFeeRegister";
		}
		

		// SAVE STUDENT FEE DETAIL
		@RequestMapping(value = "/saveStudent_FeeDetail", method = RequestMethod.POST)
		public String saveStudent_FeeDetail(HttpServletRequest request, HttpServletResponse response, ModelMap model) 
		{
			try{
			String name,tutionfee, hostelfee, examinationfee, registrationfee;
			name=request.getParameter("name");
			tutionfee = request.getParameter("tutionfee");
			hostelfee = request.getParameter("hostelfee");
			examinationfee = request.getParameter("examinationfee");
			registrationfee = request.getParameter("registrationfee");
			System.out.println("Tution Fee is   :   " + tutionfee);
			System.out.println("Hostel Fee is   :   " + hostelfee);
			System.out.println("Examination Fee is   :   " + examinationfee);
			System.out.println("Registration Fee is   :   " + registrationfee);
			System.out.println("Registration Fee is   :   " + name);
			
			Student_FeeDetail stufee = new Student_FeeDetail();
			stufee.setName(name);
			stufee.setTutionfee(tutionfee);
			stufee.setHostelfee(hostelfee);
			stufee.setExaminationfee(examinationfee);
			stufee.setRegistrationfee(registrationfee);
			student_FeeDetailService.saveStudent_FeeDetail(stufee);
			model.addAttribute("stufeeData", "STUDENT DATA HAS BEEN SAVED.................");
			}catch(Exception e){
				System.out.println("Fee Record not available");
			}
			return "StudentFeeRegister";
		}	
		
		
		
	
	// SHOW LIST OF STUDENTS
	@RequestMapping(value = "/EmployeeListDetail")
	public String showEmployee(ModelMap map) {
		try{
		List<EmpRegistration> emp = empRegistrationService.listEmpRegistration();
		Iterator<EmpRegistration> itr = emp.iterator();
		// traversing elements of ArrayList object
		while (itr.hasNext())
		{
			EmpRegistration st = (EmpRegistration) itr.next();
			System.out.println(st.getId() + " " + st.getName() + " " + st.getFatherName() + " " + st.getEmail() + " "
					+ st.getCaddress() + " " + st.getCity() + " " + st.getGender() + " " + st.getPaddress() + " "
					+ st.getDepartment() + " " + st.getDistrict() + " " + st.getMobile() + " " + st.getDob() + " "
					+ st.getPincode() + " " + st.getState());
		}
		System.out.println(emp);
		map.addAttribute("emp", emp);
		}catch(Exception e){
			System.out.println("Employee not found in Employe List");
		}
		return "EmployeeList";
	}
	
	 				
	
	

	// STUDENT Mobile INFORMATION BY ID
	@RequestMapping("/getMobileByID")
	public String getMobile(ModelMap model, Principal principal,HttpServletRequest request,HttpServletResponse response) {
		
		try{
		int id = Integer.parseInt(request.getParameter("vivek"));
		System.out.println(" hereb is your :::::::::::::::::::::::::::::::id is recieved   :   " + id);
	   
		Student stu = studentService.getStudentById(id);
        System.out.println("helllo i am here:::::::::::::;;;"+stu.getName());                    
        model.addAttribute("stu", stu);
		}catch(Exception e){
			System.out.println("Id not available");
		}
		return "contactUs.1";
	}
	
	 				
	 				

	 				@RequestMapping(value = "/saveEmpRegistration", method = RequestMethod.POST)
				public String saveEmpRegistration(HttpServletRequest request, HttpServletResponse response, ModelMap model,
						@RequestParam CommonsMultipartFile[] fileUpload) {
				
						String email, name, fname, password, paddress, caddress, gender, department, district, state, pincode, dob,
					
							mobile, city, salary;

					name = request.getParameter("name");
					fname = request.getParameter("fname");
					salary = request.getParameter("salary");
					email = request.getParameter("email");
					mobile = request.getParameter("mobile");
					city = request.getParameter("city");
					password = request.getParameter("password");
					paddress = request.getParameter("paddress");
					caddress = request.getParameter("caddress");
					gender = request.getParameter("gender");
					department = request.getParameter("department");
					district = request.getParameter("district");
					state = request.getParameter("state");
					pincode = request.getParameter("pincode");
					dob = request.getParameter("dob");

					System.out.println("Salary  is   :   " + salary);
					System.out.println("name is   :   " + name);
					System.out.println("email is   :   " + email);
					System.out.println("phone is   :   " + mobile);
					System.out.println("city is   :   " + city);
					System.out.println("password is   :   " + password);
					System.out.println("Present address is   :   " + paddress);
					System.out.println("Current address is   :   " + caddress);
					System.out.println("Father name is   :   " + fname);
					System.out.println("Gender is   :   " + gender);
					System.out.println("department is   :   " + department);
					System.out.println("District is   :   " + district);
					System.out.println("State is   :   " + state);
					System.out.println("Pincode is   :  " + pincode);
					System.out.println("DOB is   :   " + dob);

					EmpRegistration emp = new EmpRegistration();

					try {
						if (fileUpload != null && fileUpload.length > 0) {

							emp.setPhoto(fileUpload[0].getBytes());
						}
					} catch (Exception e) {
						System.out.println(e);
					}

					emp.setName(name);
					emp.setEmail(email);
					emp.setMobile(mobile);
					emp.setCity(city);
					emp.setPaddress(paddress);
					emp.setCaddress(caddress);
					emp.setSalary(salary);
					emp.setPassword(password);
					emp.setFatherName(fname);
					emp.setGender(gender);
					emp.setDepartment(department);
					emp.setDistrict(district);
					emp.setState(state);
					emp.setPincode(pincode);
					emp.setDob(dob);
					model.addAttribute("empData", "EMPLOYEE DATA HAS BEEN SAVED.................");
					

					empRegistrationService.saveEmpRegistration(emp);

					return "AddEmployee";

				}
	 				

					@RequestMapping("/downloadEmpPhoto/{id}")
					public String downloadEmpPhoto(@PathVariable("id") Integer id, HttpServletResponse response) {
					System.out.println("Student Image 0");
						
						EmpRegistration emp = empRegistrationService.getEmpRegistrationById(id);
						System.out.println("Student image 1");
						try {
							if (emp.getPhoto() != null) {
								// response.setHeader("Content-Dispositon", "inline;filename=\""
								// + usersProfileService.getUsersProfileById(id).getFullName()+
								// "\"");
								OutputStream out = response.getOutputStream();
								response.setContentType("image/gif");
								byte[] bytes = emp.getPhoto();
								InputStream is = new ByteArrayInputStream(bytes);
								IOUtils.copy(is, out);
								out.flush();
								out.close();
							}
						} catch (IOException e) {
							e.printStackTrace();
						}
						return null;
					}
	 				
	 				
	 				
	 				
	 				
	 				
	 				
	 				
	 					 				
	 				
	 			// Student UPDATE INFORMATION BY ID
	 				@RequestMapping("/updateStudent")
	 				public String editStudentData(HttpServletRequest request,ModelMap modal) 
	 				{
	 					int stuId = Integer.parseInt(request.getParameter("id"));
	 			 					
	 					Student stu= studentService.getStudentById(stuId);
	 					modal.addAttribute("stu",stu);
	 					
	 					return "UpdateStudent";

	 				}

	 				
					@RequestMapping(value = "/saveUpdateStudent", method = RequestMethod.POST)
					public String UpdateStudent(HttpServletRequest request,ModelMap modal){
	 					
						try{
							String email, name, fname, password, paddress, caddress, gender, department, district, state, pincode, dob,
						
						mobile, city, time,batch;
                        byte[] photo;
	 					int stuId = Integer.parseInt(request.getParameter("id"));
	 				
						name = request.getParameter("name");
						fname = request.getParameter("fatherName");		
						email = request.getParameter("email");
						mobile = request.getParameter("mobile");
						city = request.getParameter("city");
						password = request.getParameter("password");
						paddress = request.getParameter("paddress");
						caddress = request.getParameter("caddress");
						gender = request.getParameter("gender");
						department = request.getParameter("department");
						district = request.getParameter("district");
						state = request.getParameter("state");
						pincode = request.getParameter("pincode");
						dob = request.getParameter("dob");
						batch = request.getParameter("batch");
						time = request.getParameter("time");
	 					
						

		 			     	System.out.println("this is student id;;;;;;;;;;;;;;;;;;;;;" + stuId);
		 					System.out.println(request.getParameter("name"));
		 					System.out.println(request.getParameter("fname"));
		 					System.out.println(request.getParameter("mobile"));
		 					System.out.println(request.getParameter("city"));
		 					System.out.println(request.getParameter("paddress"));
		 					System.out.println(request.getParameter("caddress"));
		 					System.out.println(request.getParameter("password"));
		 					System.out.println(request.getParameter("gender"));
		 					System.out.println(request.getParameter("salary"));
		 					System.out.println(request.getParameter("dob"));
		 					System.out.println(request.getParameter("state"));
		 					System.out.println(request.getParameter("district"));
		 					System.out.println(request.getParameter("pincode"));
		 					System.out.println(request.getParameter("salary"));
	 					
		 					
		 					Student stu = studentService.getStudentById(stuId);
		 					modal.addAttribute("stu", stu);
		 					stu.setName(request.getParameter("name"));
		 					stu.setFatherName(request.getParameter("fatherName"));
		 					stu.setMobile(request.getParameter("mobile"));
		 					stu.setCity(request.getParameter("city"));
		 					stu.setPaddress(request.getParameter("paddress"));
		 					stu.setCaddress(request.getParameter("caddress"));
		 					stu.setPassword(request.getParameter("password"));
		 					stu.setGender(request.getParameter("gender"));
		 					stu.setDob(request.getParameter("dob"));
		 					stu.setState(request.getParameter("state"));
		 					stu.setDistrict(request.getParameter("district"));
		 					stu.setPincode(request.getParameter("pincode"));
		 					stu.setBatch(request.getParameter("batch"));
		 					stu.setTime(request.getParameter("time"));
		 				 					
		 					studentService.mergeStudent(stu);
						System.out.println("Updated Student method of admin");
						}catch(Exception e){
							System.out.println("Try again!..");
						}
						return "UpdateStudent";
					}				
	 			
						
					// EMPLOYEE INFORMATION BY ID
					@RequestMapping("/getEmployeeByID")
					public String getEmpRegistration(ModelMap model, Principal principal,HttpServletRequest request,HttpServletResponse response) {
						try{
							int id = Integer.parseInt(request.getParameter("abhishek"));
						
						System.out.println(" here is your Employee :::::::::::::::::::::::::::::::id is recieved   :   " + id);
					   
						EmpRegistration emp = empRegistrationService.getEmpRegistrationById(id);
	                    System.out.println("helllo i am here:::::::::::::;;;"+emp.getName());                    
	                    model.addAttribute("emp",emp);
					}catch(Exception e){
					System.out.println("Please Enter valid Employee Id..");
					}
					return "SearchEmployee1";
					}
				

				
				// STUDENT INFORMATION BY ID
				@RequestMapping("/getStudentByID")
				public String getStudent (ModelMap model, Principal principal,HttpServletRequest request,HttpServletResponse response) {
					try{
					
					int id = Integer.parseInt(request.getParameter("niraj"));
					System.out.println(" hereb is your :::::::::::::::::::::::::::::::id is recieved   :   " + id);
				   
					Student stu = studentService.getStudentById(id);
                    System.out.println("helllo i am here:::::::::::::;;;"+stu.getName());                    
                    model.addAttribute("stu", stu);
					}catch(Exception e){
						System.out.println("Invalid Id or Id is not Found..");
					}
                    return "SearchStudent1";
				}
				
				
				
				
				
				
			
				// STUDENT DELETE BY ID
				@RequestMapping(value = "/deleteStudentByID/{id}", method = RequestMethod.GET)
				public String deleteStudent(@PathVariable("id") Integer id, HttpServletRequest request, ModelMap model) {
					
					try{
					System.out.println("id is recieved   :   " + id);
					studentService.removeStudentById(id);
					System.out.println("IDDDDDDDDDDDDDDDDDDDDDDDDDDDd"+id);
					model.addAttribute("StudentDELETE", "Student IS REMOVEDDDDDDDDDDDDDDDDDDD.................");
					}catch(Exception e){
						System.out.println("Chech Student Id..");
					}
					return "redirect:/admin/StudentListDetail";
				}
				
				
							
				// SAVE STUDENT INFORMATION
				@RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
				public String saveStudent(HttpServletRequest request, HttpServletResponse response, ModelMap model,
						@RequestParam CommonsMultipartFile[] fileUpload) {
					String email, name, fname, password, paddress, caddress, gender, cource, district, state, pincode, dob, mobile,
							city,time,batch;
					System.out.println("HelloController.saveStudent()");
					name = request.getParameter("name");
					fname = request.getParameter("fname");
					email = request.getParameter("email");
					mobile = request.getParameter("mobile");
					city = request.getParameter("city");
					password = request.getParameter("password");
					paddress = request.getParameter("paddress");
					caddress = request.getParameter("caddress");
					gender = request.getParameter("gender");
					cource = request.getParameter("cource");
					district = request.getParameter("district");
					state = request.getParameter("state");
					pincode = request.getParameter("pincode");
					dob = request.getParameter("dob");
				    time=request.getParameter("time");
				    batch=request.getParameter("batch");
				    
					
					
					System.out.println("name is   :   " + name);
					System.out.println("Father name is   :   " + fname);
					System.out.println("email is   :   " + email);
					System.out.println("phone is   :   " + mobile);
					System.out.println("city is   :   " + city);
					System.out.println("password is   :   " + password);
					System.out.println("Present address is   :   " + paddress);
					System.out.println("Current address is   :   " + caddress);
					System.out.println("Gender is   :   " + gender);
					System.out.println("Cource is   :   " + cource);
					System.out.println("District is   :   " + district);
					System.out.println("State is   :   " + state);
					System.out.println("Pincode is   :  " + pincode);
					System.out.println("DOB is   :   " + dob);


					Student stu = new Student();

					try {
						if (fileUpload != null && fileUpload.length > 0) {

							stu.setPhoto(fileUpload[0].getBytes());
						}
					
							if (fileUpload != null && fileUpload.length > 0) {

								stu.setPhoto(fileUpload[1].getBytes());
							}
						
						/*studentService.updateStudent(stu);*/
					} catch (Exception e) {
						System.out.println(e);
					}

					stu.setName(name);
					stu.setEmail(email);
					stu.setCity(city);
					stu.setPaddress(paddress);
					stu.setCaddress(caddress);
					stu.setFatherName(fname);
					stu.setGender(gender);
					stu.setCource(cource);
					stu.setDistrict(district);
					stu.setState(state);
					stu.setPincode(pincode);
					stu.setDob(dob);
					stu.setPassword(password);
					stu.setMobile(mobile);
					stu.setTime(time);
					stu.setBatch(batch);
			  
					
					model.addAttribute("stuData", "STUDENT DATA HAS BEEN SAVED.................");
					
					studentService.saveStudent(stu);
					
					return "AddStudent";
					
				}

				@RequestMapping("/downloadPhoto/{id}")
				public String downloadAddressProof(@PathVariable("id") Integer id, HttpServletResponse response) {
				System.out.println("Student Image 0");
					
					Student stu = studentService.getStudentById(id);
					System.out.println("Student image 1");
					try {
						if (stu.getPhoto() != null) {
							// response.setHeader("Content-Dispositon", "inline;filename=\""
							// + usersProfileService.getUsersProfileById(id).getFullName()+
							// "\"");
							OutputStream out = response.getOutputStream();
							response.setContentType("image/gif");
							byte[] bytes = stu.getPhoto();
							InputStream is = new ByteArrayInputStream(bytes);
							IOUtils.copy(is, out);
							out.flush();
							out.close();
			           
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
					return null;
				}
				
				@RequestMapping("/downloadPhoto1/{id}")
				public String downloadAddressProof1(@PathVariable("id") Integer id, HttpServletResponse response,HttpServletRequest request) {
				System.out.println("Student Image 0");
					
					Student stu = studentService.getStudentById(id);
					System.out.println("Student image 1");
					try {
						if (stu.getPhoto()!= null) {
							// response.setHeader("Content-Dispositon", "inline;filename=\""
							// + usersProfileService.getUsersProfileById(id).getFullName()+
							// "\"");
							InputStream input = request.getInputStream();
						    request.getContentType();
							OutputStream out=response.getOutputStream();
							response.setContentType("image/gif");
							byte[] bytes = stu.getPhoto();
							InputStream is = new ByteArrayInputStream(bytes);
							IOUtils.copy(is, out);
							out.flush();
							out.close();
			           
						}
						else{
							if(stu.getPhoto()==null){
								
							}
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
					return null;
				}
				
				
				
				
				
				
	 			// EMPLOYEE UPDATE INFORMATION BY ID
	 				@RequestMapping("/updateEmployee")
	 				public String editEmployeeData(HttpServletRequest request,ModelMap modal) 
	 				{
	 					int empId = Integer.parseInt(request.getParameter("id"));
	 			 					
	 					EmpRegistration emp= empRegistrationService.getEmpRegistrationById(empId);
	 					modal.addAttribute("emp",emp);
	 					
	 					return "UpdateEmployee";

	 				}

	 				
					@RequestMapping(value = "/saveUpdateEmployee", method = RequestMethod.POST)
					public String UpdateEmployee(HttpServletRequest request,ModelMap modal){
	 					String email, name, fname, password, paddress, caddress, gender, department, district, state, pincode, dob,
						mobile, city, salary;

	 					int empId = Integer.parseInt(request.getParameter("id"));
	 					
						name = request.getParameter("name");
						fname = request.getParameter("fatherName");
						salary = request.getParameter("salary");
						email = request.getParameter("email");
						mobile = request.getParameter("mobile");
						city = request.getParameter("city");
						password = request.getParameter("password");
						paddress = request.getParameter("paddress");
						caddress = request.getParameter("caddress");
						gender = request.getParameter("gender");
						department = request.getParameter("department");
						district = request.getParameter("district");
						state = request.getParameter("state");
						pincode = request.getParameter("pincode");
						dob = request.getParameter("dob");
	 					
						

		 			     	System.out.println("this is student id;;;;;;;;;;;;;;;;;;;;;" + empId);
		 					System.out.println(request.getParameter("name"));
		 					System.out.println(request.getParameter("fname"));
		 					System.out.println(request.getParameter("mobile"));
		 					System.out.println(request.getParameter("city"));
		 					System.out.println(request.getParameter("paddress"));
		 					System.out.println(request.getParameter("caddress"));
		 					System.out.println(request.getParameter("password"));
		 					System.out.println(request.getParameter("gender"));
		 					System.out.println(request.getParameter("salary"));
		 					System.out.println(request.getParameter("dob"));
		 					System.out.println(request.getParameter("state"));
		 					System.out.println(request.getParameter("district"));
		 					System.out.println(request.getParameter("pincode"));
		 					System.out.println(request.getParameter("salary"));
	 					
		 					
		 					EmpRegistration emp = empRegistrationService.getEmpRegistrationById(empId);
		 					modal.addAttribute("emp", emp);
		 					emp.setName(request.getParameter("name"));
		 					emp.setFatherName(request.getParameter("fatherName"));
		 					emp.setMobile(request.getParameter("mobile"));
		 					emp.setCity(request.getParameter("city"));
		 					emp.setPaddress(request.getParameter("paddress"));
		 					emp.setCaddress(request.getParameter("caddress"));
		 					emp.setPassword(request.getParameter("password"));
		 					emp.setGender(request.getParameter("gender"));
		 					emp.setDob(request.getParameter("dob"));
		 					emp.setState(request.getParameter("state"));
		 					emp.setDistrict(request.getParameter("district"));
		 					emp.setPincode(request.getParameter("pincode"));
		 				 					
		 					empRegistrationService.mergeEmpRegistration(emp);
						System.out.println("Updated Employee method of admin");
						return "UpdateEmployee";
					}			
			
				@RequestMapping(value = "/contactUs.1", method = RequestMethod.GET)
				public String contactUs()
				{					
					return "contactUs.1";
				}

				
				

				@RequestMapping(value = "/StudentList", method = RequestMethod.GET)
				public String StudentList()
				{					
					return "StudentList";
				}
	

				// SHOW LIST OF STUDENTS
				@RequestMapping(value = "/StudentListDetail")
				public String showStudents(ModelMap map) {
					List<Student> stu = studentService.listStudent();
					Iterator<Student> itr = stu.iterator();
					// traversing elements of ArrayList object
					while (itr.hasNext()) {
						Student st = (Student) itr.next();
						System.out.println(st.getId() + " " + st.getName() + " " + st.getFatherName() + " " + st.getEmail() + " "
								+ st.getCaddress() + " " + st.getCity() + " " + st.getGender() + " " + st.getPaddress() + " "
								+ st.getCource() + " " + st.getDistrict() + " " + st.getMobile() + " " + st.getDob() + " "
								+ st.getPincode() + " " + st.getState());
					}
					System.out.println(stu);
					map.addAttribute("stu", stu);
					return "StudentList";
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

						FileInputStream input = new FileInputStream("/home/supersoft/Desktop/001_2016_5_MON.XLS.XLS");
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
						System.out.println("Excel file is not found..." + ex);
						}

										
					return "Excel1";
				}

				
				

				@RequestMapping(value = "/ExcelList", method = RequestMethod.GET)
				public String ExcelList()
				{					
					return "ExcelList";
				}
	

				// SHOW LIST OF STUDENTS
				@RequestMapping(value = "/ExcelListDetail")
				public String showExcel(ModelMap map) {
					List<Excel> excel = excelService.listExcel();
					Iterator<Excel> itr = excel.iterator();
					// traversing elements of ArrayList object
					while (itr.hasNext()) {
						Excel ex = (Excel) itr.next();
						System.out.println(ex.getNo()+ " " + ex.getName() + " " + ex.getDepartment() + " " + ex.getLowr()+ " "
								+ ex.getLowa() + " " + ex.getLatet() + " " + ex.getLatemin() + " " + ex.getElt() + " "
								+ ex.getElm() + " " + ex.getOtr() + " " + ex.getOts() + " " + ex.getAttend() + " "
								+ ex.getBt() + " " + ex.getAb()+ ex.getL() + " " + ex.getBpr() + " " + ex.getBpo() + " " + ex.getPde()+ " "	+ex.getPdl() + " " + ex.getPdd()+ " "+ex.getActualpay()+ " "+ex.getMemo());
								
					}
					System.out.println(excel);
					map.addAttribute("excel", excel);
					return "ExcelList";
				}
				

				
				// Attedence By INFORMATION BY ID
				@RequestMapping("/getAttdenceByID")
				public String getAttdence(ModelMap model, Principal principal,HttpServletRequest request,HttpServletResponse response) {
					int no = Integer.parseInt(request.getParameter("abhishek"));	
					System.out.println("hereb is your :::::::::::::::::::::::::::::::id is recieved   :   " + no);				   
					Excel excel = excelService.getExcelById(no);
                    System.out.println("helllo i am here:::::::::::::;;;"+excel.getName());                    
                    model.addAttribute("excel", excel);                    
					return "SearchAttedence1";
				}
	
				
						
				
				
				
				
				
				
				
				/*----------change admin Password--------*/	
				@RequestMapping(value = "/changeadminPass")
				public String sendAdminPassword() {
					return "changeadminPass";
				}

				@RequestMapping(value = "/changePass0", method = RequestMethod.POST)
				public String adminPassword(HttpServletRequest req, ModelMap model, Principal principal) {
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
						return "changeadminPass";
					}
					return "Admindb";
				}
              
				@RequestMapping("/returnAdminHome")
				public String adminHome(){
					return "Admindb";
					
				}
				
				@RequestMapping("/viewStudent")
 				public String viewStudentData(HttpServletRequest request,ModelMap modal) 
 				{
 					int stuId = Integer.parseInt(request.getParameter("id"));
 			 					
 					Student stu= studentService.getStudentById(stuId);
 					modal.addAttribute("stu",stu);
 					
 					return "viewStudent";

 				}
				
				@RequestMapping("/viewEmployee")
 				public String viewEmployeeData(HttpServletRequest request,ModelMap modal) 
 				{
 					int empId = Integer.parseInt(request.getParameter("id"));
 			 					
 					EmpRegistration emp= empRegistrationService.getEmpRegistrationById(empId);
 					modal.addAttribute("emp",emp);
 					
 					return "viewEmployee";

 				}

}


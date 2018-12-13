package com.supersoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;



@Entity
@Table(name="EMP_REGISTRATION")
public class EmpRegistration 
{
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Integer id;				
	
	@Lob
	@Column(name = "PHOTO" , columnDefinition="mediumblob")
	private byte[] photo;	
		
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "FATHER_NAME")
	private String fatherName;
	
	@Column(name = "PERMANENT_Address")
	private String paddress;
	
	@Column(name = "Current_Address")
	private String caddress;
	
	@Column(name ="SALARY")
	private String salary;
		
	
	@Column(name = "GENDER")
	private String gender;
	
	@Column(name = "City")
	private String city;
	
	@Column(name = "DEPARTMENT")
	private String department;
	
	@Column(name = "DISTRICT")
	private String district;
	
	@Column(name = "STATE")
	private String state;
	
	@Column(name = "PINCODE")
	private String pincode;	
			
	@Column(name = "EMAILID")
	private String email;		
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "DOB")
	private String dob;		
		
	@Column(name = "MOBILENO")
	private String mobile;
	
	@Column(name ="AUTHORITY")
	private String authority;
	
	@Column(name ="ENABLED")
	private Boolean enabled;
	
	
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	public byte[] getPhoto() 
	{
		return photo;
	}
	
	public void setPhoto(byte[] photo) 
	{
		this.photo = photo;
	}

	
	public String getSalary(){
		return salary;
	}
	
	public void setSalary(String salary)
	{
	this.salary=salary;	
	}
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPaddress() {
		return paddress;
	}

	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	
	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
		
	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String cource) {
		this.department = department;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String getAuthority()
	{
		return authority;
	}
	public void setAuthority(String authority)
	{
		this.authority=authority;
	}
	
	public Boolean getEnabled()
	{
		return enabled;		
	}
	
	public void setEnabled(Boolean enabled)
	{
	this.enabled=enabled;	
	}

	

	
	


	
}

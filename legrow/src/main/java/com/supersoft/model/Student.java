package com.supersoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;


	
	@Entity
	@Table(name="STUDENTS")
	public class Student  
	{
		
		@Id
		@GeneratedValue
		@Column(name="ID")
		private Integer id;	
		
		@Lob
		@Column(name = "PHOTO" , columnDefinition="mediumblob")
		private byte[] photo;	
		
		/*@Lob
		@Column(name = "PHOTO1" , columnDefinition="mediumblob")
		private byte[] photo1;
		
		public byte[] getPhoto1() {
			return photo1;
		}

		public void setPhoto1(byte[] photo1) {
			this.photo1 = photo1;
		}*/

		@Column(name = "NAME")
		private String name;
		
		@Column(name = "FATHER_NAME")
		private String fatherName;
		
		@Column(name = "PERMANENT_Address")
		private String paddress;
		
		@Column(name = "Current_Address")
		private String caddress;
		
		@Column(name = "GENDER")
		private String gender;
		
		@Column(name = "City")
		private String city;
		
		@Column(name = "COURCE")
		private String cource;		
		
		@Column(name = "BATCH")
		private String batch;
		
		@Column(name = "TIME")
		private String time;				

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
		
		
		
		public String getBatch() {
			return batch;
		}

		public void setBatch(String batch) {
			this.batch = batch;
		}

		public String getTime() {
			return time;
		}

		public void setTime(String time) {
			this.time = time;
		}
				
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
		
		public String getCource() {
			return cource;
		}

		public void setCource(String cource) {
			this.cource = cource;
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
		

		
	}



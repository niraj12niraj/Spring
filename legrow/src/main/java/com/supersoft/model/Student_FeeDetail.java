package com.supersoft.model;

 import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;


	
	@Entity
	@Table(name="STUDENT_FEEDETAIL")
	public class Student_FeeDetail  {
		
		@Id
		@GeneratedValue
		@Column(name="ID" )
		private Integer id;
			
		@Column(name = "TUTION_FEE")
		private String tutionfee;
		
		@Column(name = "NAME")
		private String name;
		
		@Column(name = "HOSTEL_FEE")
		private String hostelfee;
		
		@Column(name = "EXAMINATION_FEE")
		private String examinationfee;
		
		@Column(name = "REGISTRATION_FEE")
		private String registrationfee;
		
			
		
		
		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}
		
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTutionfee() {
			return tutionfee;
		}

		public void setTutionfee(String tutionfee) {
			this.tutionfee = tutionfee;
		}

		
		public String getHostelfee() {
			return hostelfee;
		}

		public void setHostelfee(String hostelfee) {
			this.hostelfee = hostelfee;
		}
		
		public String getExaminationfee() {
			return examinationfee;
		}

		public void setExaminationfee(String examinationfee) {
			this.examinationfee = examinationfee;
		}
		

		public String getRegistrationfee() {
			return registrationfee;
		}

		public void setRegistrationfee(String registrationfee) {
			this.registrationfee = registrationfee;
		}
		
	}
package com.supersoft.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="STUDENTS_ATTEDENCE")
public class StudentAttedence 
{
	@Id
	@GeneratedValue
	@Column(name="ADMISSION_NO")
	private Integer admission;	
	
	@Column(name="COURSE")
	private String course;	
	
	
	@Column(name = "MORNING_SHIFT")
	private String morningshift;
	
	@Column(name = "EVININGSHIFT")
	private String eviningshift;
	
	@Column(name = "MONTH")
	private String month;
	
	@Column(name = "DATE")
	private String date;
	
	
	
	public Integer getAdmissionNo() {
		return admission;
	}

	public void setAdmissionNo(Integer admisssion) {
		this.admission = admission;
	}
	
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}	
	

	public String getMorningShift() {
		return morningshift;
	}

	public void setMorningShift(String morningshift) {
		this.morningshift = morningshift;
	}

	
	public String getEviningShift() {
		return eviningshift;
	}

	public void setEviningShift(String eviningshift) {
		this.eviningshift = eviningshift;
	}
	
	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) 
	{
		this.date = date;
	}	

}

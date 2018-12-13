package com.supersoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="EMP_ATTEDENCE")
public class EmpAttedence 
{
	@Id
	@GeneratedValue
	@Column(name="EMP_ID")
	private Integer empid;	
	
	@Column(name="DEPARTMENT")
	private String department;	
	
	
	@Column(name = "TIME_IN")
	private String timein;
	
	@Column(name = "TIME_OUT")
	private String timeout;
	
	@Column(name = "DATE")
	private String date;
	
	
	
	public Integer getEmpId() 
	{
		return empid;
	}

	public void setEmpId(Integer empid) 
	{
		this.empid = empid;
	}
	
	public String getDepartment() 
	{
		return department;
	}

	public void setDepartment(String deparment) 
	{
		this.department = department;
	}	
	
	
	
	public String getTimeIn() {
		return timein;
	}

	public void setTimeIn(String timein) {
		this.timein = timein;
	}	
	

	public String getTimeOut() {
		return timeout;
	}

	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) 
	{
		this.date = date;
	}	

}

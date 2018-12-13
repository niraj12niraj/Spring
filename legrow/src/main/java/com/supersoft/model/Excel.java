package com.supersoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;



@Entity
@Table(name="EXCEL_READ")
public class Excel 
{	
	@Id
	@GeneratedValue
	@Column(name="No")
	private Integer no;				
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Department")
	private String department;
	
	@Column(name = "LengthOWR")
	private String lowr;
	
	@Column(name = "LengthOWA")
	private String lowa;
	
	@Column(name = "LateT")
	private String latet;
	
	@Column(name = "LateMin")
	private String lm;
	
	@Column(name = "EarlyLT")
	private String elt;
	
	@Column(name = "EarlyLmin")
	private String elm;
	
	@Column(name = "OverTR")
	private String otr;
	
	@Column(name = "OverTS")
	private String ots;	
			
	@Column(name = "Attend")
	private String attend;		
	
	@Column(name = "BT")
	private String bt;
	
	@Column(name = "AB")
	private String ab;		
		
	@Column(name = "L")
	private String l;
	
	@Column(name = "BonusPR")
	private String bpr;
	
	@Column(name ="BonusPO")
	private String bpo;
	
	@Column(name = "BouncePA")
	private String bpa;
	
	@Column(name = "PayDE")
	private String pde;
	
	@Column(name = "PayDL")
	private String pdl;
	
	@Column(name="PayDD")
	private String pdd;
	
	@Column(name="ActualP")
	private String ap;
	
	@Column(name="Memo")
	private String memo;
	
	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}	
	
	public String getLowr() {
		return lowr;
	}

	public void setLowr(String lowr) {
		this.lowr = lowr;
	}
	

	
	public String getLowa() {
		return lowa;
	}

	public void setLowa(String lowa) {
		this.lowa = lowa;
	}

	
	public String getLatet() {
		return latet;
	}

	public void setLatet(String latet) {
		this.latet = latet;
	}	

	public String getLatemin() {
		return lm;
	}

	public void setLatemin(String lm) {
		this.lm = lm;
	}

	public String getElt() {
		return elt;
	}

	public void setElt(String elt) {
		this.elt = elt;
	}
	
	
	public String getElm() {
		return elm;
	}

	public void setElm(String elm) {
		this.elm = elm;
	}	
	
	
	public String getOtr() {
		return otr;
	}

	public void setOtr(String otr) {
		this.otr = otr;
	}
	
	
	public String getOts() {
		return ots;
	}

	public void setOts(String ots) {
		this.ots = ots;
	}
	
	public String getAttend() {
		return attend;
	}

	public void setAttend(String attend) {
		this.attend = attend;
	}

	public String getBt() {
		return bt;
	}

	public void setBt(String bt) {
		this.bt = bt;
	}
	
	public String getAb() {
		return ab;
	}

	public void setAb(String ab) {
		this.ab = ab;
	}
	
	public String getL() {
		return l;
	}

	public void setL(String l) {
		this.l = l;
	}
	
	public String getBpr() {
		return bpr;
	}

	public void setBpr(String bpr) {
		this.bpr = bpr;
	}

	public String getBpo() {
		return bpo;
	}

	public void setBpo(String bpo) {
		this.bpo = bpo;
	}
	
	public String getBpa() {
		return bpa;
	}

	public void setBpa(String bpa) {
		this.bpa = bpa;
	}

	public String getPde() {
		return pde;
	}

	public void setPde(String pde) {
		this.pde = pde;
	}


	public String getPdl() {
		return pdl;
	}

	public void setPdl(String pdl) {
		this.pdl = pdl;
	}

	public String getPdd() {
		return pdd;
	}

	public void setPdd(String pdd) {
		this.pdd = pdd;
	}

	public String getActualpay() {
		return ap;
	}

	public void setActualpay(String ap) {
		this.ap = ap;
	}
	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}


	
}

package com.supersoft.model;

import javax.persistence.*;


/**
 * Created by krishna on 4/5/16.
 */

@Entity
@Table(name="USER_PROFILE")
public class UserProfile
{
    @Id
    @GeneratedValue
    @Column(name="ID")
    private Integer id;

    @Column(name = "FULL_NAME")
    private String fullName;

    @Column(name="EMAIL",unique=true)
    private String email;

    @Column(name="PASSWORD")
    private String password;
 
    @Column(name="MOBILE_NUMBER")
    private String mobileNumber;

    @Column(name="ADDRESS",length =1000)
    private String address;

    @Column(name="CITY")
    private String city;

    @Column(name="STATE")
    private String state;

    @Column(name="PINCODE")
    private String pincode;

    @Column(name = "WEBSITE")
    private String website;

    @Column(name="COUNTRY")
    private String country;

    @Column(name="AUTHORITY")
    private String authority;

    @Column(name="ENABLED")
    private boolean enabled;

    @Column(name="UUID")
    private String uuid;


    public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid2) {
		this.uuid = uuid2;
	}


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}

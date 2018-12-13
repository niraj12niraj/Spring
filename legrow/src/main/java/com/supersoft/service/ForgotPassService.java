package com.supersoft.service;


import java.util.List;

import com.supersoft.model.ForgotPass;
import com.supersoft.model.UserProfile;

public interface ForgotPassService {
	
	public void saveUserProfile(ForgotPass userProfile);
    public void mergeUserProfile(ForgotPass userProfile);
	public ForgotPass getUserProfileById(Integer id);
	public ForgotPass getUserProfileByEmail(String email);
    public ForgotPass getUserProfileByCode(String code);
	public ForgotPass getPassByEnroll(String email);
	public void changePassword(ForgotPass userProfile);
	public List<ForgotPass> getSellerInfoBrEmailId(String userEmail);
	public List<ForgotPass> listUserProfile();
	/*public List<ForgotPass> listUserProfile();*/
	 public List<ForgotPass> listOfselerByUserProfile();
}

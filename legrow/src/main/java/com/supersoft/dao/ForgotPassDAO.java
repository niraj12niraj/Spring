package com.supersoft.dao;

import com.supersoft.model.ForgotPass;
import com.supersoft.model.UserProfile;

import java.util.List;

public interface ForgotPassDAO {
	public void saveUserProfile(ForgotPass personalDetails);
	

	
	public ForgotPass getUserProfileById(Integer id);
	
	public ForgotPass getUserProfileByEmail(String email);

    public ForgotPass getUserProfileByCode(String code);

    public void mergeUserProfile(ForgotPass userProfile);

    public List<ForgotPass> listUserProfile() ;

	public ForgotPass getPassByEnroll(String email);

	public void changePassword(ForgotPass userProfile);

	public List<ForgotPass> getSellerInfoBrEmailId(String userEmail);
	
	public List<ForgotPass> listOfselerByUserProfile();
	
	
}

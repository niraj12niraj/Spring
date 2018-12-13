package com.supersoft.dao;

import com.supersoft.model.UserProfile;

import java.util.List;

public interface UserProfileDAO {
	public void saveUserProfile(UserProfile personalDetails);
	
	public UserProfile getUserProfileById(Integer id);
	
	public UserProfile getUserProfileByEmail(String email);

    public UserProfile getUserProfileByCode(String code);

    public void mergeUserProfile(UserProfile userProfile);

    public List<UserProfile> listUserProfile() ;

	public UserProfile getPassByEnroll(String email);

	public void changePassword(UserProfile userProfile);

	public List<UserProfile> getSellerInfoBrEmailId(String userEmail);
	
	public List<UserProfile> listOfselerByUserProfile();
	
	
}

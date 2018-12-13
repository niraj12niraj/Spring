package com.supersoft.service;


import java.util.List;


import com.supersoft.model.UserProfile;

public interface UserProfileService {
	public void saveUserProfile(UserProfile userProfile);
    public void mergeUserProfile(UserProfile userProfile);
	public UserProfile getUserProfileById(Integer id);
	public UserProfile getUserProfileByEmail(String email);
    public UserProfile getUserProfileByCode(String code);
	public UserProfile getPassByEnroll(String email);
	public void changePassword(UserProfile userProfile);
	public List<UserProfile> getSellerInfoBrEmailId(String userEmail);
	public List<UserProfile> listUserProfile();
	/*public List<UserProfile> listUserProfile();*/
	 public List<UserProfile> listOfselerByUserProfile();
}

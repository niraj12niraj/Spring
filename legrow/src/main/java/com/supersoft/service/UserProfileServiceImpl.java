package com.supersoft.service;

import com.supersoft.dao.UserProfileDAO;

import com.supersoft.model.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import javax.transaction.Transactional;

public class UserProfileServiceImpl implements UserProfileService
{
	
	@Autowired
    private UserProfileDAO userProfileDAO;
	
	@Transactional
	@Override
	public void saveUserProfile(UserProfile userProfile)
	{
		userProfileDAO.saveUserProfile(userProfile);
	}

    @Transactional
    @Override
    public void mergeUserProfile(UserProfile userProfile) {
        userProfileDAO.mergeUserProfile(userProfile);
    }

    @Transactional
	@Override
	public UserProfile getUserProfileById(Integer id)
	{
		return userProfileDAO.getUserProfileById(id);
	}
	
	@Transactional
	@Override
	public UserProfile getUserProfileByEmail(String email)
	{
		return userProfileDAO.getUserProfileByEmail(email);
	}

    @Transactional
    @Override
    public UserProfile getUserProfileByCode(String code) {
        return userProfileDAO.getUserProfileByCode(code);
    }

    @Transactional
	@Override
	public UserProfile getPassByEnroll(String email) {
		// TODO Auto-generated method stub
		return userProfileDAO.getPassByEnroll(email);
	}

    @Transactional
	@Override
	public void changePassword(UserProfile userProfile) {
		// TODO Auto-generated method stub
    	userProfileDAO.changePassword(userProfile);
	}

    @Transactional
	@Override
	public List<UserProfile> getSellerInfoBrEmailId(String userEmail) {
		// TODO Auto-generated method stub
		return userProfileDAO.getSellerInfoBrEmailId(userEmail);
	}

  /*  @Transactional
	@Override
	public List<UserProfile> listUserProfile() {
		// TODO Auto-generated method stub
		return userProfileDAO.listUserProfile();
	}
    */
    @Transactional
    @Override
    public List<UserProfile> listUserProfile() {
     // TODO Auto-generated method stub
     return userProfileDAO.listUserProfile();
    }
   @Transactional
    @Override
   public List<UserProfile> listOfselerByUserProfile(){
    return userProfileDAO.listOfselerByUserProfile();
   }
}

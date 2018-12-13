package com.supersoft.service;

import com.supersoft.dao.ForgotPassDAO;
import com.supersoft.dao.UserProfileDAO;
import com.supersoft.model.ForgotPass;
import com.supersoft.model.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import javax.transaction.Transactional;

public class ForgotPassServiceImpl implements ForgotPassService
{
	
	@Autowired
    private ForgotPassDAO userProfileDAO;
	
	@Transactional
	@Override
	public void saveUserProfile(ForgotPass userProfile)
	{
		userProfileDAO.saveUserProfile(userProfile);
	}

    @Transactional
    @Override
    public void mergeUserProfile(ForgotPass userProfile) {
        userProfileDAO.mergeUserProfile(userProfile);
    }

    @Transactional
	@Override
	public ForgotPass getUserProfileById(Integer id)
	{
		return userProfileDAO.getUserProfileById(id);
	}
	
	@Transactional
	@Override
	public ForgotPass getUserProfileByEmail(String email)
	{
		return userProfileDAO.getUserProfileByEmail(email);
	}

    @Transactional
    @Override
    public ForgotPass getUserProfileByCode(String code) {
        return userProfileDAO.getUserProfileByCode(code);
    }

    @Transactional
	@Override
	public ForgotPass getPassByEnroll(String email) {
		// TODO Auto-generated method stub
		return userProfileDAO.getPassByEnroll(email);
	}

    @Transactional
	@Override
	public void changePassword(ForgotPass userProfile) {
		// TODO Auto-generated method stub
    	userProfileDAO.changePassword(userProfile);
	}

    @Transactional
	@Override
	public List<ForgotPass> getSellerInfoBrEmailId(String userEmail) {
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
    public List<ForgotPass> listUserProfile() {
     // TODO Auto-generated method stub
     return userProfileDAO.listUserProfile();
    }
   @Transactional
    @Override
   public List<ForgotPass> listOfselerByUserProfile(){
    return userProfileDAO.listOfselerByUserProfile();
   }
/*
@Override
public void saveUserProfile(ForgotPass userProfile) {
	// TODO Auto-generated method stub
	userProfileDAO.saveUserProfile(userProfile);
}*/
}

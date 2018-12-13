package com.supersoft.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.supersoft.model.ForgotPass;
import com.supersoft.service.ForgotPassService;


public class ForgotPassDAOImpl implements ForgotPassDAO {
	
	@Autowired
    private SessionFactory sessionFactory;
	
	@Autowired
	private ForgotPassService userProfileService;
	
	
	@Override
	public void saveUserProfile(ForgotPass userProfile) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(userProfile);
	}
	
	@SuppressWarnings("unchecked")
	 @Override
	 public List<ForgotPass> listOfselerByUserProfile() {
	  return (List<ForgotPass>) sessionFactory.getCurrentSession()
	    .createQuery("FROM UserProfile WHERE AUTHORITY='ROLE_USER'").list();
	 }
	
	
	
	/*@Override
	public UserProfile getUserProfileById(Integer id)
	{
		try
		{
			return (UserProfile) sessionFactory.getCurrentSession().get(UserProfile.class, id);
		}
		catch(Exception e)
		{
			UserProfile userProfile=new UserProfile();
			userProfile.setFullName("nothing");
			return userProfile;
		}
	}


	
	
	
	
	
	@Override
	public UserProfile getUserProfileByEmail(String email) {
		// TODO Auto-generated method stub
		try{
            Criteria criteria = sessionFactory.getCurrentSession().createCriteria(UserProfile.class);
            criteria.add(Restrictions.eq("emailId",email));
            UserProfile userProfile = (UserProfile) criteria.uniqueResult();
            Integer id=userProfile.getId();
            return userProfileService.getUserProfileById(id);
		}
		catch(Exception e)
		{
            System.out.println("DAO 01 catch");
			return null;
		}
	}
*/
	
	
	@Override
	 public ForgotPass getUserProfileById(Integer id)
	 {
	  try
	  {
	   return (ForgotPass) sessionFactory.getCurrentSession().get(ForgotPass.class, id);
	  }
	  catch(Exception e)
	  {
		  ForgotPass userProfile=new ForgotPass();
	  /* userProfile.setFullName("nothing");*/
	   return userProfile;
	  }
	 }
	 
	 @Override
	 public ForgotPass getUserProfileByEmail(String email) {
	  try{
	Criteria criteria = sessionFactory.getCurrentSession().createCriteria(ForgotPass.class);
	criteria.add(Restrictions.eq("email",email));
	ForgotPass userProfile = (ForgotPass) criteria.uniqueResult();
	Integer id=userProfile.getId();
	System.out.println("User profile id from email"+id);
	return userProfileService.getUserProfileById(id);
	  }
	  catch(Exception e)
	  {
	System.out.println("DAO 01 catch");
	   return null;
	  }
	 }
	
	
	
	
    @Override
    public ForgotPass getUserProfileByCode(String code) {
        try
        {
            Criteria criteria=sessionFactory.getCurrentSession().createCriteria(ForgotPass.class);
            criteria.add(Restrictions.eq("emailVerificationCode",code));
            return (ForgotPass)criteria.uniqueResult();
        }
        catch(Exception ex)
        {
            return null;
        }

    }

    @Override
    public void mergeUserProfile(ForgotPass userProfile) {
        sessionFactory.getCurrentSession().merge(userProfile);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<ForgotPass> listUserProfile() {
        return (List<ForgotPass>)sessionFactory.getCurrentSession().createQuery("FROM UserProfile WHERE AUTHORITY='ROLE_EMPLOYEE'").list();
        
    }





	@Override
	public ForgotPass getPassByEnroll(String email) {
		// TODO Auto-generated method stub
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(ForgotPass.class);
		criteria.add(Restrictions.eq("email", email));
		return (ForgotPass)criteria.uniqueResult();
		
	}


	@Override
	public void changePassword(ForgotPass userProfile) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().merge(userProfile);
	}





	@SuppressWarnings("unchecked")
	@Override
	public List<ForgotPass> getSellerInfoBrEmailId(String userEmail) {
		// TODO Auto-generated method stub
		  try{
			   Criteria criteria = sessionFactory.getCurrentSession().createCriteria(ForgotPass.class);
			   
			   criteria.add(Restrictions.like("studentName", "%"+userEmail+"%"));
			   List<ForgotPass> sellerInfo = (List<ForgotPass>) criteria.list();
			   System.out.println("this is for search by name on DAO layer.....");
			   System.out.println("list of sellerInfo"+sellerInfo);
			   return sellerInfo;
			   
			  }
			  catch(Exception e)
			  {
			   System.out.println("in catch");
			   return null;
			  }
			}
/*
	@Override
	public void saveUserProfile(ForgotPass personalDetails) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(personalDetails);
	}*/
	}


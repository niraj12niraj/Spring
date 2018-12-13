package com.supersoft.dao;

import com.supersoft.model.UserProfile;
import com.supersoft.service.UserProfileService;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class UserProfileDAOImpl implements UserProfileDAO {
	
	@Autowired
    private SessionFactory sessionFactory;
	
	@Autowired
	private UserProfileService userProfileService;
	
	
	@Override
	public void saveUserProfile(UserProfile userProfile) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(userProfile);
	}
	
	@SuppressWarnings("unchecked")
	 @Override
	 public List<UserProfile> listOfselerByUserProfile() {
	  return (List<UserProfile>) sessionFactory.getCurrentSession()
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
	  try{
	Criteria criteria = sessionFactory.getCurrentSession().createCriteria(UserProfile.class);
	criteria.add(Restrictions.eq("email",email));
	UserProfile userProfile = (UserProfile) criteria.uniqueResult();
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
    public UserProfile getUserProfileByCode(String code) {
        try
        {
            Criteria criteria=sessionFactory.getCurrentSession().createCriteria(UserProfile.class);
            criteria.add(Restrictions.eq("emailVerificationCode",code));
            return (UserProfile)criteria.uniqueResult();
        }
        catch(Exception ex)
        {
            return null;
        }

    }

    @Override
    public void mergeUserProfile(UserProfile userProfile) {
        sessionFactory.getCurrentSession().merge(userProfile);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<UserProfile> listUserProfile() {
        return (List<UserProfile>)sessionFactory.getCurrentSession().createQuery("FROM UserProfile WHERE AUTHORITY='ROLE_EMPLOYEE'").list();
        
    }





	@Override
	public UserProfile getPassByEnroll(String email) {
		// TODO Auto-generated method stub
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(UserProfile.class);
		criteria.add(Restrictions.eq("email", email));
		return (UserProfile)criteria.uniqueResult();
		
	}


	@Override
	public void changePassword(UserProfile userProfile) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().merge(userProfile);
	}





	@SuppressWarnings("unchecked")
	@Override
	public List<UserProfile> getSellerInfoBrEmailId(String userEmail) {
		// TODO Auto-generated method stub
		  try{
			   Criteria criteria = sessionFactory.getCurrentSession().createCriteria(UserProfile.class);
			   
			   criteria.add(Restrictions.like("studentName", "%"+userEmail+"%"));
			   List<UserProfile> sellerInfo = (List<UserProfile>) criteria.list();
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
	}


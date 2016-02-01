package com.rule.safety.DAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.rule.safety.exception.DisplayException;
import com.rule.safety.pojo.Users;

public class UsersDAO extends DAO {

	public UsersDAO() {
    }

	public Users create(String username, String password, String role) throws DisplayException {
		 try {
	            begin();
	            Users user = new Users(username, password, role);
	            getSession().save(user);
	            commit();
	            return user;
	        } catch (HibernateException e) {
	            rollback();
	            throw new DisplayException("Exception while screating user: " + e.getMessage());
	        }
	}
	
    public Users get(String username, String password)
            throws DisplayException {
      try {
            begin();
            Query q = getSession().createQuery("from Users where username = :username AND password = :password");
            q.setString("username", username);
            q.setString("password", password);
            Users user = (Users) q.uniqueResult();
            getSession().save(user);
            commit();
            return user;
        } catch (HibernateException e) {
            rollback();
            throw new DisplayException("Could not get user " + username, e);
        }
    }
    
    public List<Users> get()
            throws DisplayException {
      try {
            begin();
            Query q = getSession().createQuery("from Users where confirm = :confirm");
            q.setString("confirm", "N/A");
            List<Users> user =  q.list();
            commit();
            return user;
        } catch (HibernateException e) {
            rollback();
            throw new DisplayException("Could not get users " , e);
        }
    }
    
    public String setRole(int userID, String role) {
    	Query q = getSession().createQuery("update Users set role = :role, confirm = :confirm where userID = :userID");
    	q.setParameter("role", role);
		q.setParameter("userID", userID);    
		q.setParameter("confirm", "True");
		q.executeUpdate();
		return "success";
    }
}

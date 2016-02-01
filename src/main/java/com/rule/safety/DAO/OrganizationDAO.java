package com.rule.safety.DAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.rule.safety.exception.DisplayException;
import com.rule.safety.pojo.Cities;
import com.rule.safety.pojo.Organizations;
import com.rule.safety.pojo.States;

public class OrganizationDAO extends DAO {

	public OrganizationDAO() {
		
	}
	
	public States create(String statename) throws DisplayException {
		 try {
	            begin();
	            States state = new States(statename);
	            getSession().save(state);
	            commit();
	            return state;
	        } catch (HibernateException e) {
	            rollback();
	            throw new DisplayException("Exception while screating state: " + e.getMessage());
	        }
	}
	
	public Cities createCity(String cityname, int stateID) throws DisplayException {
		 try {
	            begin();
	            Cities city = new Cities(cityname, stateID);
	            getSession().save(city);
	            commit();
	            return city;
	        } catch (HibernateException e) {
	            rollback();
	            throw new DisplayException("Exception while screating city: " + e.getMessage());
	        }
	}
	
	public Organizations createOrg(String orgname, int cityID, int stateID) throws DisplayException {
		 //try {
	            begin();
	            Organizations org = new Organizations(orgname, cityID, stateID);
	            getSession().save(org);
	            commit();
	            return org;
	        //} catch (HibernateException e) {
	          //  rollback();
	            //throw new DisplayException("Exception while screating Organization: " + e.getMessage());
	        //}
	}
	
	public List<States> getStates() throws DisplayException {
		try {
            begin();
            Query q = getSession().createQuery("from States");
            List<States> list = q.list();
            commit();
            return list;
        } catch (HibernateException e) {
            rollback();
            throw new DisplayException("Could not list the categories", e);
        }
	}
	
	public States getState(String state) throws DisplayException {
		try {
            begin();
            Query q = getSession().createQuery("from States where statename = :statename");
            q.setString("statename", state);
            States states = (States) q.uniqueResult();
            commit();
            return states;
        } catch (HibernateException e) {
            rollback();
            throw new DisplayException("Could not list the categories", e);
        }
	}
	
	public Cities getCity(String city) throws DisplayException {
		try {
            begin();
            Query q = getSession().createQuery("from Cities where cityname = :cityname");
            q.setString("cityname", city);
            Cities cities = (Cities) q.uniqueResult();
            commit();
            return cities;
        } catch (HibernateException e) {
            rollback();
            throw new DisplayException("Could not list the categories", e);
        }
	}
	
	public List<Cities> getCity() throws DisplayException {
		try {
            begin();
            Query q = getSession().createQuery("from Cities");
            List<Cities> list = q.list();
            commit();
            return list;
        } catch (HibernateException e) {
            rollback();
            throw new DisplayException("Could not list the categories", e);
        }
	}
}

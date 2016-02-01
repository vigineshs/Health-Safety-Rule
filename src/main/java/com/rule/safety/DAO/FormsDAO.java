package com.rule.safety.DAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.rule.safety.exception.DisplayException;
import com.rule.safety.pojo.Herf;

public class FormsDAO extends DAO {

	public FormsDAO() {
		
	}
	
	public Herf create(String report, String evidence, String discoveryDate, String discoveryTime, String reportDesc, String reportLocation, String categories, String categoryDesc, int patientNumer, String patientName, String patientDob, int recordNumber, String patientGender,  String nPatientName, String nPatientDob, int nRecordNumber, String nPatientGender, String reportDate, String anonymousReporter, String reporterName, String reporterPhone, String reporterUsername, String reporterJob) throws DisplayException {
		try {
	            begin();
	            Herf herf = new Herf(report, evidence, discoveryDate, discoveryTime, reportDesc, reportLocation, categories, categoryDesc, patientNumer, patientName, patientDob, recordNumber, patientGender, nPatientName, nPatientDob, nRecordNumber, nPatientGender, reportDate, anonymousReporter, reporterName, reporterPhone, reporterUsername, reporterJob);
	            getSession().save(herf);
	            commit();
	            return herf;
	        } catch (HibernateException e) {
	            rollback();
	            throw new DisplayException("Exception while creating Form herf: " + e.getMessage());
	        }
	}
	
	public List<Herf> getHerf() throws DisplayException {
		try {
            begin();
            Query q = getSession().createQuery("from Herf");
            List<Herf> list = q.list();
            commit();
            return list;
        } catch (HibernateException e) {
            rollback();
            throw new DisplayException("Could not list the Herf complaints", e);
        }
	}
	
	public Herf getSelectedHerf(int reportID) throws DisplayException {
		try {
            begin();
            Query q = getSession().createQuery("from Herf where reportid = :reportID");
            q.setInteger("reportID", reportID);
            Herf herf = (Herf) q.uniqueResult();
            getSession().save(herf);
            commit();
            return herf;
        } catch (HibernateException e) {
            rollback();
            throw new DisplayException("Could not list the Herf complaints", e);
        }
	}
	
	public List<Herf> getSelectedHerf(String username) throws DisplayException {
		try {
            begin();
            Query q = getSession().createQuery("from Herf where reporterUsername = :username");
            q.setParameter("username", username);
            List<Herf> messages =  q.list();
            commit();
            return messages;
        } catch (HibernateException e) {
            rollback();
            return null;
        }
	}
	
	public List<Herf> getSelectedComplaints(String username) throws DisplayException {
		try {
            begin();
            Query q = getSession().createQuery("from Herf where complaintOn = :username AND forwarded = :word");
            q.setParameter("username", username);
            q.setParameter("word", "True");
            List<Herf> complaints =  q.list();
            commit();
            return complaints;
        } catch (HibernateException e) {
            rollback();
            return null;
        }
	}
	
	public String setComment(int reportID, String messageText) throws DisplayException {
		try {
			Query q = getSession().createQuery("update Herf set status = :status, comment = :comment where reportID = :reportID");
			q.setParameter("reportID", reportID);
			q.setParameter("comment", messageText);
			q.setParameter("status", "Processing");
			q.executeUpdate();
			return "success";
		} catch (HibernateException e) {
	        return "failed";
	    }
	}
	
	public String setForward(int reportID, String messageText) throws DisplayException {
		try {
			Query q = getSession().createQuery("update Herf set status = :status, task = :task, forwarded = :forwarded where reportID = :reportID");
			q.setParameter("reportID", reportID);
			q.setParameter("task", messageText);
			q.setParameter("status", "Forwarded");
			q.setParameter("forwarded", "True");
			q.executeUpdate();
			return "success";
		} catch (HibernateException e) {
	        return "failed";
	    }
	}
}

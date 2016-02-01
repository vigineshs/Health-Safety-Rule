package com.rule.safety;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.HibernateException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rule.safety.DAO.FormsDAO;
import com.rule.safety.exception.DisplayException;
import com.rule.safety.pojo.Herf;

@Controller
public class MessagesController {

	public MessagesController() {
		
	}
	
	@RequestMapping(value="/showadminmessages.htm", method=RequestMethod.GET)
	public String toAdminShow(HttpServletRequest request,
            HttpServletResponse response) throws DisplayException {
		try {
			FormsDAO formsDAO = new FormsDAO();
			List<Herf> herfList = formsDAO.getHerf();
			
			request.setAttribute("herfList", herfList);
			return "adminmessages";
		} catch (HibernateException e) {
	        throw new DisplayException("Exception while fetching Form herf: " + e.getMessage());
	    }
	}
	
	@RequestMapping(value="/showadminmessages.htm", method=RequestMethod.POST)
	public String onAdminShow(HttpServletRequest request,
            HttpServletResponse response) throws DisplayException {
		try {
			int reportID = Integer.parseInt(request.getParameter("messageID"));
			FormsDAO formsDAO = new FormsDAO();
			Herf herf  = formsDAO.getSelectedHerf(reportID);
			request.setAttribute("message", herf);
			return "adminMessage";
		} catch (HibernateException e) {
	        throw new DisplayException("Exception while fetching Form herf: " + e.getMessage());
	    }
	}
	

	@RequestMapping(value="/showmessages.htm", method=RequestMethod.GET)
	public String toShow(HttpServletRequest request,
            HttpServletResponse response) throws DisplayException {
		try {
			FormsDAO  formsDAO = new FormsDAO();
			List<Herf> messageList = formsDAO.getSelectedHerf((String) request.getSession().getAttribute("username"));
			request.setAttribute("messages", messageList);
			return "userMessages";
		} catch (HibernateException e) {
	        throw new DisplayException("Exception while fetching Form herf: " + e.getMessage());
	    }
	}
	
	@RequestMapping(value="/showmessages.htm", method=RequestMethod.POST)
	public String onShow(HttpServletRequest request,
            HttpServletResponse response) throws DisplayException {
		try {
			int reportID = Integer.parseInt(request.getParameter("messageID"));
			FormsDAO formsDAO = new FormsDAO();
			Herf herf  = formsDAO.getSelectedHerf(reportID);
			request.setAttribute("message", herf);
			return "userMessage";
		} catch (HibernateException e) {
	        throw new DisplayException("Exception while fetching Form herf: " + e.getMessage());
	    }
	}
	
	@RequestMapping(value="/reply.htm", method=RequestMethod.GET)
	public String toReply(HttpServletRequest request, HttpServletResponse response) throws DisplayException {
		try {
			int reportID = Integer.parseInt(request.getParameter("messageID"));
			FormsDAO formsDAO = new FormsDAO();
			Herf herf  = formsDAO.getSelectedHerf(reportID);
			request.setAttribute("message", herf);
			return "replyMessage";
		} catch (HibernateException e) {
	        throw new DisplayException("Exception while fetching Form herf: " + e.getMessage());
	    }
	}
	
	@RequestMapping(value="/reply.htm", method=RequestMethod.POST)
	public String onReply(HttpServletRequest request, HttpServletResponse response) throws DisplayException {
		try {
			int reportID = Integer.parseInt(request.getParameter("messageID"));
			String messageText = request.getParameter("messageText");
			FormsDAO formsDAO = new FormsDAO();
			String result  = formsDAO.setComment(reportID, messageText);
			
			Herf herf  = formsDAO.getSelectedHerf(reportID);
			request.setAttribute("message", herf);
			if(result.equals("success")) {
				return "adminMessage";
			}
			return "replyMessage";
		} catch (HibernateException e) {
	        throw new DisplayException("Exception while fetching Form herf: " + e.getMessage());
	    }
	}
	
	@RequestMapping(value="/forward.htm", method=RequestMethod.GET)
	public String toForward(HttpServletRequest request, HttpServletResponse response) throws DisplayException {
		try {
			int reportID = Integer.parseInt(request.getParameter("messageID"));
			FormsDAO formsDAO = new FormsDAO();
			Herf herf  = formsDAO.getSelectedHerf(reportID);
			request.setAttribute("message", herf);
			return "adminMessageForward";
		} catch (HibernateException e) {
	        throw new DisplayException("Exception while fetching Form herf: " + e.getMessage());
	    }
	}
	
	@RequestMapping(value="/forward.htm", method=RequestMethod.POST)
	public String onForward(HttpServletRequest request, HttpServletResponse response) throws DisplayException {
		try {
			int reportID = Integer.parseInt(request.getParameter("messageID"));
			String messageText = request.getParameter("messageText");
			FormsDAO formsDAO = new FormsDAO();
			String herf  = formsDAO.setForward(reportID, messageText);
			System.out.println(herf);
			request.setAttribute("message", herf);
			if(herf.equals("success")) {
				List<Herf> herfList = formsDAO.getHerf();
				request.setAttribute("herfList", herfList);
				
			}
			return "adminmessages";
		} catch (HibernateException e) {
	        throw new DisplayException("Exception while fetching Form herf: " + e.getMessage());
	    }
	}
	
}

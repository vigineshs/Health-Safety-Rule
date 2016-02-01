package com.rule.safety;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rule.safety.DAO.FormsDAO;
import com.rule.safety.DAO.UsersDAO;
import com.rule.safety.exception.DisplayException;
import com.rule.safety.pojo.Herf;
import com.rule.safety.pojo.Users;

@Controller
public class UsersController {
	
	UsersDAO usersDAO = new UsersDAO();
	
	public UsersController() {
		
	}
	
	@RequestMapping(value="/register.htm", method=RequestMethod.GET)
	public String doRegister() {
		return "register";
	}
	
	@RequestMapping(value="/register.htm", method=RequestMethod.POST)
	public String onRegister(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String role = "user";
		usersDAO.create(username, password, role);
		request.setAttribute("message", "You've registered successfully!");
		return "index";
		
	}
	
	@RequestMapping(value="/login.htm", method=RequestMethod.POST)
	public String onLogin(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Users user = usersDAO.get(username, password);
		if(user != null ) {
			request.getSession().setAttribute("username", username);
			String role = user.getRole();
			FormsDAO  formsDAO = new FormsDAO();
			if(role.equals("admin"))
				return "adminHome";
			else if(role.equals("others")) {
				List<Herf> messageList = formsDAO.getSelectedHerf(username);
				List<Herf> complaintList = formsDAO.getSelectedComplaints(username); 
				request.setAttribute("messages", messageList);
				request.setAttribute("complaints", complaintList);
				return "othersHome";
			}
			else {
				List<Herf> messageList = formsDAO.getSelectedHerf(username);
				request.setAttribute("messages", messageList);
				return "home";
			}
		}
		return "index";
		
	}
	
	@RequestMapping(value="/set.htm", method=RequestMethod.GET)
	public String doSet(HttpServletRequest request,
            HttpServletResponse response) throws DisplayException {
		List<Users> userList = usersDAO.get();
		request.setAttribute("userList", userList);
		return "adminSetRole";
	}
	
	@RequestMapping(value="/set.htm", method=RequestMethod.POST)
	public String onSet(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
		int userID = Integer.parseInt(request.getParameter("userID"));
		String role = request.getParameter("role");
		String result = usersDAO.setRole(userID, role);
		if(result.equals("success"))
			request.setAttribute("message", "You've set the role successfully!");
		List<Users> userList = usersDAO.get();
		request.setAttribute("userList", userList);
		return "adminSetRole";
		
	}
}

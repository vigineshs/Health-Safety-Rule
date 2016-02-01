package com.rule.safety;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rule.safety.DAO.OrganizationDAO;
import com.rule.safety.exception.DisplayException;
import com.rule.safety.pojo.Cities;
import com.rule.safety.pojo.States;

@Controller
public class AddOrganizationController {
	
	@RequestMapping(value="/add.htm", method=RequestMethod.GET)
	public String getData(HttpServletRequest request, HttpServletResponse response) throws DisplayException {
		OrganizationDAO org = new OrganizationDAO();
		List<States> statesList = org.getStates();
		request.setAttribute("stateList", statesList);
		List<Cities> citiesList = org.getCity();
		request.setAttribute("cityList", citiesList);
		return "addOrg";
	}
	
	@RequestMapping(value="/add.htm", method=RequestMethod.POST)
	public String addOrg(HttpServletRequest request, HttpServletResponse response) throws DisplayException {
		String state=request.getParameter("state");
		String city=request.getParameter("city");
		String organization=request.getParameter("organization");
		OrganizationDAO organizationDAO = new OrganizationDAO();
		States states =  organizationDAO.getState(state);
		Cities cities =  organizationDAO.getCity(city);
		int stateid = states.getStateID();
		int cityid = cities.getCityID();
		organizationDAO.createOrg(organization, cityid, stateid);
		return "adminHome";
	}
}

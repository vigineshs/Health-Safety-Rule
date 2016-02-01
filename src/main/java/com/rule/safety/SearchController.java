package com.rule.safety;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rule.safety.DAO.FormsDAO;
import com.rule.safety.exception.DisplayException;
import com.rule.safety.pojo.Herf;

@Controller
public class SearchController {

	@RequestMapping(value="/search.htm", method=RequestMethod.GET)
	public void toSearch() {
		
	}
	
	@RequestMapping(value="/search.htm", method=RequestMethod.POST)
	public String onSearch(HttpServletRequest request, HttpServletResponse response) throws DisplayException {
		String keyword = request.getParameter("keyword");
		String method = request.getParameter("method");
		FormsDAO formsDAO = new FormsDAO();
		if(method.equals("search")) {
			List<Herf> complaints = formsDAO.getSelectedHerf(keyword);
			return "search";
		}
		else if(method.equals("post")) {
			request.setAttribute("person", keyword);
/////////////////s			return "forms";
		}
		return null;
	}
}

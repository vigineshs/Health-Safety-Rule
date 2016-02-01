package com.rule.safety;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rule.safety.DAO.FormsDAO;
import com.rule.safety.exception.DisplayException;
import com.rule.safety.pojo.Herf;

@Controller
public class FormController {
	String categories= "";
	@RequestMapping(value="/herf.htm", method=RequestMethod.GET)
	public String onStart() {
		return "herf";
	}
	
	@RequestMapping(value="/herf.htm", method=RequestMethod.POST)
	public String onReport(HttpServletRequest request, HttpServletResponse response) throws DisplayException {
		String discoveryTime, discoveryDate;
		String report =  request.getParameter("report");
		String evidence = request.getParameter("evidence");
		String discoveryDated = request.getParameter("discoveryDate");
		String discoveryMonth = request.getParameter("discoveryDate");
		String discoveryYear = request.getParameter("discoveryDate");
		String discoveryDateWhen = discoveryMonth+"/"+discoveryDated+"/"+discoveryYear;
		String discoveryDateUnknown = request.getParameter("discovery");
		if(discoveryDateUnknown == null)
			discoveryDate = discoveryDateWhen;
		else
			discoveryDate = discoveryDateUnknown;
		String discoveryMinutes = request.getParameter("discoveryMinutes");
		String discoveryHours = request.getParameter("discoveryHours");
		String discoveryWhen = discoveryMinutes +"-"+ discoveryHours;
		String discoveryUnknown = request.getParameter("discoveryTime");
		if(discoveryUnknown == null )
			discoveryTime = discoveryWhen;
		else
			discoveryTime = discoveryUnknown;
		String reportDesc = request.getParameter("reportDesc");
		String reportLoc = request.getParameter("reportLoc");
		String[] categoryList= request.getParameterValues("categories");
		
        for (int i = 0; i < categoryList.length; i++) {
        	categories += categoryList[i] + ",  ";
        	System.out.println(categoryList[i]);
        	System.out.println(categories);
        }
        System.out.println(categories);
        String categoryDesc = request.getParameter("categoryDesc");
        int patientNumber = Integer.parseInt(request.getParameter("patientNumber"));
        String patientFirst = request.getParameter("patientFirst");
        String patientMiddle = request.getParameter("patientMiddle");
        String patientLast = request.getParameter("patientLast");
        String patientName = patientFirst + " " + patientMiddle + " " + patientLast;
        String patientMonth = request.getParameter("patientMonth");
        String patientDate = request.getParameter("patientDate");
        String patientYear = request.getParameter("patientYear");
        String patientDob = patientMonth + "/" + patientDate + "/" + patientYear;
        String recordNumber = request.getParameter("recordNumber");
        String patientGender = request.getParameter("gender");
        String nPatientFirst = request.getParameter("nPatientFirst");
        String nPatientMiddle = request.getParameter("nPatientMiddle");
        String nPatientLast = request.getParameter("nPatientLast");
        String nPatientName = nPatientFirst + " " + nPatientMiddle + " " + nPatientLast;
        String nPatientMonth = request.getParameter("nPatientMonth");
        String nPatientDate = request.getParameter("nPatientDate");
        String nPatientYear = request.getParameter("nPatientYear");
        String nPatientDob = nPatientMonth + "/" + nPatientDate + "/" + nPatientYear;
        String nPatientGender = request.getParameter("nGender");
        String nRecordNumber = request.getParameter("nRecordNumber");
        String reportMonth = request.getParameter("reportMonth");
        String reportDated = request.getParameter("reportDate");
        String reportYear = request.getParameter("reportYear");
        String reportDate = reportMonth + "/" + reportDated + "/" + reportYear;
        String anonymousReporter = request.getParameter("anonymous");
        String reporterFirst = request.getParameter("reporterFirst");
        String reporterMiddle = request.getParameter("reporterMiddle");
        String reporterLast = request.getParameter("reporterLast");
        String reporterName =  reporterFirst + " " + reporterMiddle + " " + reporterLast;
        String reporterPhone = request.getParameter("reporterPhone");
        String reporterUsername = request.getParameter("reporterUsername");
        String reporterJob = request.getParameter("reporterJob");
        FormsDAO formsDAO =  new FormsDAO();
        Herf herf = formsDAO.create(report, evidence, discoveryDate, discoveryTime, reportDesc, reportLoc, categories, categoryDesc, patientNumber, patientName, patientDob, Integer.parseInt(recordNumber), patientGender, nPatientName, nPatientDob, Integer.parseInt(nRecordNumber), nPatientGender, reportDate, anonymousReporter, reporterName, reporterPhone, reporterUsername, reporterJob);
        if(herf != null)
        	return "home";
		return "herf";
	}

}

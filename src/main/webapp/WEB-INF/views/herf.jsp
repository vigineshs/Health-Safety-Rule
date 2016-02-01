<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Health Safety Rule - HEALTHCARE EVENT REPORTING FORM (HERF)</title>
<!-- Bootstrap core CSS -->
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet" />
</head>
<body class="container">
<form:form action="herf.htm" method="POST" >
1. What is being reported? <br/><input type="radio" name="report" value="Incident" /><b>Incident:</b> A patient safety event that reached 
the patient, whether or not the patient was harmed --> 2. Was there any evidence of harm to a patient at the 
time of this report? &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;CHECK ONE: 
a.<input type="radio" name="evidence" value="Yes" /> Yes 
b.<input type="radio" name="evidence" value="No" /> No 
c.<input type="radio" name="evidence" value="Unknown" /> Unknown<br/>
<input type="radio" name="report" value="Near Miss" /><b>Near Miss:</b> A patient safety event that did 
not reach the patient --> 3. Event Discovery Date: 
<input type="text" name="discoveryDate" /> / <input type="text" name="discoveryMonth" /> / <input type="text" name="discoveryYear" /> MM DD YYYY 
 <input type="checkbox" name="discovery" value="Unknown" />Unknown 

 4. Event Discovery Time: 
 <input type="text" name="discoveryMinutes" />Minutes <input type="text" name="discoveryHours" /> HOURS 
(MILITARY TIME) 
 
<br/><input type="checkbox" name="discoveryTime" value="Unknown" />Unknown <br/>
<input type="radio" name="report" value="Unsafe Condition" /><b>Unsafe Condition:</b> Any circumstance that 
increases the probability of a patient safety 
event. <br/>
5. Briefly describe the event that occurred or unsafe condition:  <br/>
 <textarea rows="3" cols="25" name="reportDesc" > </textarea> <br/>

6. Briefly describe the location where the event occurred or where the unsafe condition exists:  <br/>
 <textarea rows="3" cols="25" name="reportLoc" ></textarea> <br/>
 
 7. Which of the following categories are associated with the event or unsafe condition? CHECK ALL THAT APPLY: 
FOR EACH CATEGORY SELECTED BELOW, EXCEPT "OTHER", PLEASE COMPLETE THE CORRESPONDING CATEGORY-SPECIFIC FORM. ALL 
CATEGORIES INCLUDE REPORTING OF INCIDENTS. ANY CATEGORY WITH + ALSO INCLUDES REPORTING OF NEAR MISSES. ANY 
CATEGORY WITH * ALSO INCLUDES REPORTING OF UNSAFE CONDITIONS.  <br/>
 
a. <input type="checkbox" name="categories" value="Blood or Blood Product" />Blood or Blood Product*+ <br/>
b. <input type="checkbox" name="categories" value="Device or Medical/Surgical Supply" />Device or Medical/Surgical Supply*+  <br/>
c. <input type="checkbox" name="categories" value="Fall" />Fall <br/>
d. <input type="checkbox" name="categories" value="Healthcare-associated Infection" />Healthcare-associated Infection  <br/> 
e. <input type="checkbox" name="categories" value="Medication or Other Substance" />Medication or Other Substance*+ <br/>
f. <input type="checkbox" name="categories" value="Perinatal" />Perinatal  <br/>
g. <input type="checkbox" name="categories" value="Pressure Ulcer" />Pressure Ulcer <br/>
h. <input type="checkbox" name="categories" value="Surgery or Anesthesia" />Surgery or Anesthesia (includes invasive procedure)+  <br/>
i. Other*+: PLEASE SPECIFY 
<input type="text" name="categoryDesc" /> <br/>
Please complete the patient identifiers below. Additional patient information is captured on the Patient Information Form 
(PIF). (When reporting a perinatal incident that affected a mother and a neonate, please complete the patient identifiers 
below for the mother (Q8 - Q12) and the neonate (Q13 - Q16). Please also complete a separate PIF for the neonate 
involved.) <br/>
8. How many patients did the incident reach? ENTER NUMBER  <input type="text" name="patientNumber" /><br/>
9. Patient's Name: FIRST MIDDLE LAST 
 <input type="text" name="patientFirst" /> <input type="text" name="patientMiddle" /> <input type="text" name="patientLast" /><br/>
10. Patient's Date of Birth:<input type="text" name="patientMonth" />/ <input type="text" name="patientDate" /> / <input type="text" name="patientYear" /> 11. Medical Record #: <input type="text" name="recordNumber" /><br/>
12. Patient's Gender:<input type="radio" name="gender" value="Male" />a. Male <input type="radio" name="gender" value="Female" />b. Female <input type="radio" name="gender" value="Unknown" />c. Unknown <br/>
 <br/>
NEONATAL PATIENT INFORMATION (COMPLETE ONLY FOR NEONATE AFFECTED BY PERINATAL INCIDENT): <br/> 
13. Patient's Name: FIRST MIDDLE LAST  <input type="text" name="nPatientFirst" /> <input type="text" name="nPatientMiddle" /> <input type="text" name="nPatientLast" /><br/>
 
 14. Patient's Date of Birth: <input type="text" name="nPatientMonth" /> / <input type="text" name="nPatientDate" /> / <input type="text" name="nPatientYear" /> MM DD YYYY <br/>
15. Medical Record #: <input type="text" name="nRecordNumber" /> <br/>
 
16. Patient's Gender: <input type="radio" name="nGender" value="Male" />a. Male <input type="radio" name="nGender" value="Female" />b. Female <input type="radio" name="nGender" value="Unknown" />c. Unknown <br/>
 
REPORT AND EVENT REPORTER INFORMATION <br/>
17. Report Date: <input type="text" name="reportMonth" /> / <input type="text" name="reportDate" /> / <input type="text" name="reportYear" />  <br/>
MM DD YYYY 
18. Anonymous Reporter <input type="radio" name="anonymous" value="Anonymous" /><br/>
19. Reporter's Name: FIRST MIDDLE LAST <input type="text" name="reporterFirst" /><input type="text" name="reporterMiddle" /><input type="text" name="reporterLast" /><br/>
 
20. Telephone Number: <input type="text" name="reporterPhone"  /> <br/>
21. Email Address: <input type="text" name="reporterUsername" /><br/>
 
22. Reporter's Job or Position: <input type="text" name="reporterJob" /> <br/>
 <input type="submit" value="Send" />
 </form:form>

</body>
</html>
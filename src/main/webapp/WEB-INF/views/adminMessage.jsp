<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Detailed Message</title>
</head>
<body>
<h3>Detailed ${message.report} Report</h3>
<table border='1'>
	<tr>
		<td> report</td>
		<td> evidence</td>
		<td> discoveryDate</td>
		<td> discoveryTime</td>
		<td> reportDesc</td>
		<td> reportLocation</td>
		<td> categories</td>
		<td> categoryDesc</td>
	</tr>
	<tr>
		<td>${message.report}</td>
		<td>${message.evidence}</td>
		<td>${message.discoveryDate}</td>
		<td>${message.discoveryTime}</td>
		<td>${message.reportDesc}</td>
		<td>${message.reportLocation}</td>
		<td>${message.category}</td>
		<td>${message.categoryDesc}</td>
	</tr>
</table><br/><br/>
<h4>Patient Information</h4>
<table border='1'>
<tr>
	<td>patientNumber</td>
	<td> patientName</td>
	<td> patientDob</td>
	<td> medRecordNo</td>
	<td>patientGender</td>
	</tr>
	<tr>
		<td>${message.patients}</td>
		<td>${message.patientName}</td>
		<td>${message.patientDob}</td>
		<td>${message.medRecordNo}</td>
		<td>${message.patientGender}</td>
	</tr>
</table><br/><br/>
<h4>Neonate Patient Information</h4>
<table border='1'>
<tr>
	<td> nPatientName</td>
	<td> nPatientDob</td>
	<td> nMedRecordNo</td>
	<td> nPatientGender</td>
	</tr>
	<tr>
		<td>${message.nPatientName}</td>
		<td>${message.nPatientDob}</td>
		<td>${message.nMedRecordNo}</td>
		<td>${message.nPatientGender}</td>
	</tr>
</table><br/><br/>
<h4>Report Details</h4>
<table border='1'>
<tr>
	<td> reportDate</td>
	<td>reporterName</td>
	<td> reporterPhone</td>
	<td>reporterUsername</td>
	<td> reporterJob</td>
	</tr>
	<tr>
		<td>${message.reportDate}</td>
		<td>${message.reporterName}</td>
		<td>${message.telephoneNumber}</td>
		<td>${message.reporterUsername}</td>
		<td>${message.reporterJob}</td>
	</tr>
</table>
<form:form action="reply.htm" method="GET">
<input type="hidden" name="messageID" value="${message.reportID}" />
<input type="submit" value="Reply" />
</form:form>
<form:form action="forward.htm" method="GET">
<input type="hidden" name="messageID" value="${message.reportID}" />
<input type="submit" value="Forward" />
</form:form>
</body>
</html>
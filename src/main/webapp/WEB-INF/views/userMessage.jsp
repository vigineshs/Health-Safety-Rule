<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	<td>Status</td>
	<td>Comment</td>
	<td>Action Taken</td>
	</tr>
	<tr>
		<td>${message.reportDate}</td>
		<td>${message.status}</td>
		<td>${message.comment}</td>
		<td>${message.actionTaken}</td>
	</tr>
</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border='1'>
	<tr><td>Message</td><td>Reporter</td><td>Reported about </td><td>View Message</td></tr>
	<c:forEach var="message" items="${messages}">
		<form:form action="showmessages.htm" method="POST">
		<input type="hidden" name="messageID" value="${message.reportID}"/> 			
		<tr> <td>${message.reportDesc}</td><td>${message.reporterName}</td><td>${message.report}</td><td><input type="submit" value="View" /></td></tr>
		</form:form>
	</c:forEach>
</table>
</body>
</html>
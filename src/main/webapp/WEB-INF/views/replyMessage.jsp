<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="reply.htm" method="POST">
	<table>
		<tr>
		<td>To</td>
		<td>${message.reporterUsername}</td>
		</tr>
		<tr><td>From</td>
		<td>PSO Admin</td>
		</tr>
		<tr>
		<td>Message</td>
		<td><textarea rows="10" cols="15" name="messageText" ></textarea></td>
		</tr>
	</table>
	<input type="hidden" name="messageID" value="${message.reportID}" />
	<input type="submit" name="send" value="Send Message" />
	<input type="reset" name="clear" value="Clear" />
</form:form>
</body>
</html>
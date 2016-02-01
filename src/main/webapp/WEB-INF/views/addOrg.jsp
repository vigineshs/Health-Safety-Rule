<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="add.htm" method="POST">
	<select name="state">
		<c:forEach var="state" items="${stateList}">
			<option value="${state.statename}">${state.statename}</option>
		</c:forEach>
	</select>
	City : <input type="text" name="city" />
	Organization :<input type="text" name="organization" />
	<input type="submit" name="add" value="Add Organization" />
</form:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Health Safety Rule - Register</title>
 <!-- Bootstrap core CSS -->
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet" />

    <!-- Custom styles for this template -->
    <link href="<c:url value="/resources/css/signin.css" />" rel="stylesheet" />
</head>
<body>
<form:form class="form-signin" role="form" action="register.htm" method="POST" >
        <h2 class="form-signin-heading">Please sign in</h2>
        <input  class="form-control" name="username" placeholder="Username" required autofocus>
        <input type="password" class="form-control" name="password" placeholder="Password" required>
        <label class="checkbox">
          <input type="checkbox" value="remember-me"> Remember me
        </label>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Register</button>
	</form:form>
</body>
</html>
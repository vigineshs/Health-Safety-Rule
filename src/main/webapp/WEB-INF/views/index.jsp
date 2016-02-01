<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
	<title>Health Safety Rule</title>
	 <!-- Bootstrap core CSS -->
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet" />

    <!-- Custom styles for this template -->
    <link href="<c:url value="/resources/css/signin.css" />" rel="stylesheet" />
</head>
<body class="container">
<h1>
	Welcome to Health Safety Rule - Patient Safety Organization (PSO) Program!  
</h1>
<h3>${message}</h3>
	<form:form class="form-signin" role="form" action="login.htm" method="POST" >
        <h2 class="form-signin-heading">Please sign in</h2>
        <input  class="form-control" name="username" placeholder="Username" required autofocus>
        <input type="password" class="form-control" name="password" placeholder="Password" required>
        <label class="checkbox">
          <input type="checkbox" value="remember-me"> Remember me
        </label>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
        <a href="register.htm" >Not member? Register now!</a>
	</form:form>
      

</body>
</html>

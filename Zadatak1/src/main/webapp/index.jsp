<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>
<h2>Login form</h2>
	<div>
		<p>${message}</p>
		<form action="login" name="Form" method="post">
			
			<label for="username">Username</label>
			<input type="text" id="username" name="username" placeholder="Enter username" /> 
			<label for="password">Password</label> 
			<input type="password" id="password"name="password" placeholder="Enter password" /> 
			<input type="submit" value="Login" name="Login">
		
		</form>
	</div>
</body>
</html>

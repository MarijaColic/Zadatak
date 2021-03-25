<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	form{
		display: flex;
		flex-direction: column;
		
	}
	form>input {
		margin:10px;
		padding: 10px;
}
	footer{
		display: flex;
		justify-content: flex-end;
	
	}
	#logout{
		color: blue;
		width: 100px;
		margin: 10% 87%;
	}
</style>
</head>
<body>
<h2> Welcome ${user.ime} ${user.prezime}</h2>
	<div id="id">
		<form action="login" name="form" method="get">
			<input type="submit" value="City" name="operation">
			<input type="submit" value="Manufacturer" name="operation">
			<input type="submit" value="Product" name="operation">
			<input id="logout" type="submit" value="Logout" name="operation">
		</form>
	</div>
</body>
</html>
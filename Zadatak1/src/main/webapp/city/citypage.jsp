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
	margin: 10px;
	padding: 10px;
	width: 150px;
	
}
#one{
display: flex;
flex-direction: row;
height: 60px;
}
#one>input{
margin: 10px;

}
</style>
</head>
<body>
<h1>City</h1>
	<form action="city" name="form"method="get">
		<input type="submit" value="Dodaj grad" name="option" >
		<p>${errorAdd}</p> 
		<input type="submit" value="Prikazi sve gradove" name="option">
		<input type="submit" value="Izmeni naziv grada" name="option">
		<p>${errorUpdate}</p>
		<div id="one">
		<input type="text" name="naziv" placeholder="Unesi grad" /> 
		<input type="submit" value="Prikaz podataka o gradu" name="option">
		</div>
		<p>${city}</p>
		<p>${errorCity}</p>
		<div id="one">
		<input type="text" name="nazivG" placeholder="Unesi grad" /> 
		<input type="submit" value="Obrisi grad" name="option">
		<p>${errorCityO}</p>
		</div>
	</form>
</body>
</html>
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
	width: 220px;
	
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
<h1>Manufacturer</h1>
	<form action="man" name="form"method="get">
		<input type="submit" value="Dodaj proizvodjaca" name="option" >
		<p>${errorAdd}</p>
		<input type="submit" value="Prikazi sve proizvodjace" name="option">
		<input type="submit" value="Izmeni podatke o proizvodjacu" name="option">
		
		<div id="one">
		<input type="text" name="naziv" placeholder="Unesi naziv proizvodjaca" /> 
		<input type="submit" value="Prikaz podataka o proizvodjacu" name="option">
		</div>
		
		<div id="one">
		<input type="text" name="naziv" placeholder="Unesi naziv proizvodjaca" /> 
		<input type="submit" value="Obrisi proizvodjaca" name="option">
		
		</div>
	</form>
</body>
</html>
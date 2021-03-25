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
	<form action="city" name="form"method="post">
		<input type="submit" value="Dodaj grad" name="option" disabled="disabled">
		<div>
			<label for="pttb">PTT Broj: </label>
			<input type="number" name="pttb" placeholder="Dodaj PTT Broj" /> 
			<label for="naziv">Naziv: </label> 
			<input type="text" name="naziv" placeholder="Dodaj Naziv" /> 
			<input type="submit" value="Dodaj" name="option">
		</div>
		<input type="submit" value="Prikazi sve gradove" name="option" disabled="disabled">
		<input type="submit" value="Izmeni naziv grada" name="option" disabled="disabled">
		<div id="one">
		<input type="text" name="naziv" placeholder="Unesi grad" disabled="disabled"/> 
		<input type="submit" value="Prikaz podataka o gradu" name="option" disabled="disabled">
		</div>
		
		<input type="submit" value="Brisanje grada" name="option" disabled="disabled">
	</form>
</body>
</html>
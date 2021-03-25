<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Brisanje grada</h1>
	<form action="city" name="form" method="get">
	<div>
		<p>Naziv grada koji zelite da obrisete : </p>
		<input type="submit" value="${naziv}" name="deletenaziv" disabled="disabled">
	</div>
	<div>
		<p>Ptt broj grada koji zelite da obrisete : ${pttb} 	</p>
		<input type="text" value="${pttb}" name="deleteptt" disabled="disabled">
	</div>
	<div>
		<label>Da li ste sigurni da zelite da obrisete ovaj grad?</label>
	</div>
	<div>
		
			<input type="submit" value="Potvrdi brisanje" name="option">
			<input type="submit" value="Odustani od brisanja" name="option">
		
	</div>
	</form>
</body>
</html>
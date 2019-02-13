<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.scalefocus.bookStore.services.impl.AuthorsService"%>
<%@page import="com.scalefocus.bookStore.services.IAuthorsService"%>
<%@page import="com.scalefocus.bookStore.models.Authors"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Author by ID</title>
<style>

</style>
</head>
<body>
			<h2>Get Author from the Bookstore</h2>

	<form method="GET" action="${pageContext.request.contextPath}/authors/id"  >
		Authors's Id:<br> <input type="number" name="ID" min="1" required>
		<br> <input type="submit" value="Submit">
	</form>
	
	
	<%@ include file = "ShowAuthors.jsp" %>

</body>
</html>
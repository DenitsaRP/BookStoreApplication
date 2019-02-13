<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.scalefocus.bookStore.models.Books"%>
<%@page import="com.scalefocus.bookStore.services.impl.BookService"%>
<%@page import="com.scalefocus.bookStore.services.IBooksService"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book by ISBN</title>
<style>
tr:nth-child(even) {
	background-color: #B0E0E6;
}

th {
	background-color: #87CEEB;
	color: black;
}
</style>
</head>
<body>
	<table width="100%" border="1">
			<tr>
			<th>ISBN</th>
			<th>Title of the book</th>
			<th>Author's Name</th>
			<th>Books's Description</th>
		</tr>
	<tr>


	
<%-- 		<td align="center"><%=book.getId()%></td> --%>
<%-- 		<td align="center"><%=book.getName()%></td> --%>
<%-- 		<td align="center"><%=book.getAuthor().getName()%></td> --%>
<%-- 		<td align="left"><%=book.getDescription()%></td> --%>
	</tr>


</body>
</html>
<%@page import="com.scalefocus.bookStore.models.BooksList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BookStoreApplication</title>
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
	<%-- <c:set var="books" value="${Books}" scope="request" /> --%>
	<%-- <c:out value='${books}' /> --%>
	<table width="100%" border="1">
		<tr>
			<th>ISBN</th>
			<th>Title of the book</th>
			<th>Author's Name</th>
			<th>Books's Description</th>
		</tr>
		<c:forEach items="${Books}" var="book">
			<tr>
				<td align="center">${book.id}</td>
				<td align="center">${book.name}</td>
				<td align="center"><a href="/BookStoreApplication/author/${book.author.id}">${book.author.name}</td>
				</a>
				<td align="left">${book.description}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
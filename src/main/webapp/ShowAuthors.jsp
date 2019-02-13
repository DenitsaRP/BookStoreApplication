<%@page import="com.scalefocus.bookStore.models.AuthorsList"%>
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

 	<c:if test="${Authors ne null && !empty Authors.size()}"> 
		<table width="100%" border="1">
			<tr>
				<th>ID</th>
				<th>Author's Name</th>
				<th>Author's Description</th>
			</tr>
			<c:forEach items="${Authors}" var="author">
				<tr>
					<td align="center">${author.id}</td>
					<td align="center">${author.name}</td>
					<td align="left">${author.description}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>
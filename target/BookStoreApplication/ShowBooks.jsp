<%@page import="com.scalefocus.bookStore.services.impl.AuthorsClient"%>
<%@page import="com.scalefocus.bookStore.services.impl.BookService"%>
<%@page import="com.scalefocus.bookStore.services.IAuthorsService"%>
<%@page import="com.scalefocus.bookStore.services.IBooksService"%>
<%@page import="com.scalefocus.bookStore.models.Authors"%>
<%@page import="java.io.IOException"%>
<%@page import="java.util.List"%>
<%@page import="com.scalefocus.bookStore.models.Books"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.ArrayList"%>
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
	<%
		IBooksService booksService = new BookService();
		List<Books> books = booksService.getAllBooksInBookstore();

 		IAuthorsService authorService = new AuthorsClient();
  		List<Authors> authors = authorService.getAuthorsInBookstore();
	%>
 	<table width="100%" border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>AuthorId</th>
			<th>Author Name</th>
			<th>Description</th>
		</tr>
		<%
			for (Books bookInList : books) {
		%>
		<tr>
			<td align="center"><%=bookInList.getId()%></td>
			<td align="center"><%=bookInList.getName()%></td>
			<td align="center"><%=bookInList.getAuthorId()%></td>
			<td align="center"><%=bookInList.getAuthorName()%></td>
			<td align="left"><%=bookInList.getDescription()%></td>
		</tr>
		<%
			}
		%>
	</table>
	</br> 
 	<table width="100%" border="1"> 
 		<tr> 
 			<th>Id</th> 
 			<th>Name</th> 
 			<th>Description</th> 
 		</tr> 
		<% 
			for (Authors authorsInBookstore : authors) {
 		%> 
 		<tr>
			<td align="center"><%=authorsInBookstore.getId()%></td> 
 			<td align="center"><%=authorsInBookstore.getName()%></td> 
 			<td align="left"><%=authorsInBookstore.getDescription()%></td> 
 		</tr> 
		<%
 			}
 		%> 
	</table>
</body>
</html>
<%@page import="com.scalefocus.bookStore.services.IAuthorService"%>
<%@page import="com.scalefocus.bookStore.services.impl.AuthorService"%>
<%@page import="com.scalefocus.bookStore.services.impl.BooksService"%>
<%@page import="com.scalefocus.bookStore.services.IBookService"%>
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
		// 		Books book = (Books) request.getAttribute("Books");
		// 		out.println(book + "</br>");

		IBookService booksService = new BooksService();
		List<Books> books = booksService.getAllBooksInBookStore();

		IAuthorService authorService = new AuthorService();
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
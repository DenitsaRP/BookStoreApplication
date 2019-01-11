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
</head>
<body>
	<%
		Books book = (Books) request.getAttribute("Books");
		out.println(book + "</br>");

		IBookService booksService = new BooksService();
		List<Books> books = booksService.getAllBooksInBookStore();
		for (Books bookInList : books) {
			out.println(bookInList + "</br>");
		}

		IAuthorService authorService = new AuthorService();
		List<Authors> authors = authorService.getAuthorsInBookstore();
		for (Authors authorsInBookstore : authors) {
			out.println(authorsInBookstore + "</br>");
		}
	%>
	<!-- 	<table> -->
	<%-- 		<c:forEach items="${authors}" var="author"> --%>
	<!-- 			<tr> -->
	<%-- 				<td><c:out value="${authors}" /></td> --%>
	<!-- 			</tr> -->
	<%-- 		</c:forEach> --%>
	<!-- 	</table> -->

	<c:forEach var="authors" items="author">
		<tr>
			<td><c:out value="${author}.Id" /></td>
			<td><c:out value="${author}.name" /></td>
			<td><c:out value="${author}.description" /></td>
		</tr>
	</c:forEach>
</body>
</html>
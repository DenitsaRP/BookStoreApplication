<%@page import="com.scalefocus.bookStore.models.Authors"%>
<%@page import="com.scalefocus.bookStore.services.AuthorService"%>
<%@page import="java.io.IOException"%>
<%@page import="java.util.List"%>
<%@page import="com.scalefocus.bookStore.services.BooksService"%>
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

		BooksService booksService = new BooksService();
		List<Books> books = booksService.getAllBooksInBookStore();
		for (Books bookInList : books) {
			out.println(bookInList + "</br>");
		}

		AuthorService authorService = new AuthorService();
		List<Authors> authors = authorService.getAuthorsInBookstore();
		for (Authors authorsInBookstore : authors) {
			out.println(authorsInBookstore + "</br>");
		}
	%>
	<!-- 	<table> -->
	<!-- 		<tr> -->
	<!-- 			<th>Books</th> -->
	<!-- 		</tr> -->

	<%-- 		<c:forEach items="${books}" var="book"> --%>
	<!-- 			<tr> -->
	<%-- 				<td>${book.id}</td> --%>
	<%-- 				<td>${book.name}</td> --%>
	<%-- 				<td>${book.authorId}</td> --%>
	<%-- 				<td>${book.authorName}</td> --%>
	<%-- 				<td>${book.description}</td> --%>
	<!-- 			</tr> -->
	<%-- 		</c:forEach> --%>

	<!-- 	</table> -->

</body>
</html>
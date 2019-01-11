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
		out.println(book);
		BooksService booksService = new BooksService();
		out.println(booksService.getAllBooksInBookStore());
	%>
	<!-- 	<br> -->
	<%-- 	<% --%>
	<!-- // 		TODO Call service here  -->
	<!-- // 		BooksService booksService = new BooksService(); -->
	<!-- // 		for (Books b : booksService.getAllBooksInBookStore()) { -->
	<%-- 	%> --%>
	<!-- 	<p> -->
	<%-- 		<%=b%></p> --%>
	<%-- 	<% --%>
	// }
	<%-- 	%> --%>

</body>
</html>
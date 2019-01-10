<%@page import="com.scalefocus.bookStore.models.Books"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.ArrayList" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<%
		Books book = (Books) request.getAttribute("Books");
		out.println(book);
		// TODO Call service here
	%>
	
	List of users:
	<br />
	<table style="border: 1px solid;">
		<c:forEach items="${BooksDao.getAllBooks}" var="book">
			<tr>
				<td><c:out value="${book.id}"></c:out></td>
				<td><c:out value="${book.name}"></c:out></td>
				<td><c:out value="${book.authorId}"></c:out></td>
				<td><c:out value="${book.authorName}"></c:out></td>
				<td><c:out value="${book.description}"></c:out></td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>
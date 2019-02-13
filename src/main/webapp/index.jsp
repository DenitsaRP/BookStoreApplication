<html>
<body>

	<h2>BookStore</h2>
	<h2>
		<a href="${pageContext.request.contextPath}/books/all">View all
			books in Bookstore Application</a>
	</h2>
	<h2>
		<a href="${pageContext.request.contextPath}/authors/all">View all
			authors in Bookstore Application</a>
	</h2>
	
	<h2><a href="${pageContext.request.contextPath}/author/1">Show author by ID</a></h2>
	<h2><a href="${pageContext.request.contextPath}/book/1">Show book by ID</a></h2>
	<h2><a href="${pageContext.request.contextPath}/authorByBookID/1">Show Author by Book's ID</a></h2>


	<br>

	<h2>Get Book from the Bookstore</h2>

	<form action="ShowBookById.jsp" method="GET">
		Books's ISBN:<br> <input type="number" name="ID" min="1" required>
		<br> <input type="submit" value="Submit">
	</form>

<!-- 	<h2>Get Author from the Bookstore</h2> -->

<!-- 	<form action="ShowAuthorById.jsp" method="GET"> -->
<!-- 		Authors's Id:<br> <input type="number" name="ID" min="1" required> -->
<!-- 		<br> <input type="submit" value="Submit"> -->
<!-- 	</form> -->

	<h2>Add Author in the Bookstore</h2>

	<form action="addAuthors" method="POST">
		Author's name:<br> <input type="text" name="name" value=""
			required> <br> Author's description:<br> <input
			type="text" name="description" value=""> <br> <br>
		<input type="submit" value="Submit">
	</form>




</body>
</html>

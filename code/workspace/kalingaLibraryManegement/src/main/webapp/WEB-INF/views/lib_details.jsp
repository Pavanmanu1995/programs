<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Library Details</title>
</head>
<body>
<form:form method="post" modelAttribute="books">
	<div>
		<table border="1" cellpadding="10">
			<thead>
				<tr>
					<th>Book ID</th>
					<th>Book Name</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${books}" var="books">
					<tr>
						<td><c:out value="${books.bookId}"></c:out></td>
						<td><c:out value="${books.bookName}"></c:out></td>
						<td>
						<a href="updatebook">Update</a>&nbsp;&nbsp;&nbsp;
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="deleteone">Delete</a>
		<a href="/gotobook">Add Book</a>
	</div>
	</form:form>
</body>
</html>
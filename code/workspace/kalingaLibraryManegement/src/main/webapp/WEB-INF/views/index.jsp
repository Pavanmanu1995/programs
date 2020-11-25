<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home</title>
</head>
<body>
	<div align="center">
		<br /> <br />

		<table border="1" cellpadding="10">
			<thead>
				<tr>
					<th>Library ID</th>
					<th>Library Name</th>
					<th>Actions</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach var="libList" items="${libList}">
					<tr>
						<td><c:out value="${libList.libraryId}"></c:out></td>
						<td><c:out value="${libList.libraryName}"></c:out></td>
						<td><a href="/update/${libList.libraryId}">Update</a>&nbsp;&nbsp;&nbsp;
						
						<a href="details/${libList.libraryId}">Details</a>
						</td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
		<a href="/remove/">Delete</a>&nbsp;&nbsp;&nbsp;
		<input type="button" value="add" onclick="window.location.href='add'"/>
	</div>
</body>
</html>
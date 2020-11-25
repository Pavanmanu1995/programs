<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Book</title>
</head>
<body>
	<div>
		<form:form action="savebook" modelAttribute="book" method="post">
			<table>
				<tr>

					<td>Book Name:<form:input path="bookName" /></td>
				</tr>
			</table>
			<input type="submit" value="Submit ">
		</form:form>

	</div>
</body>
</html>
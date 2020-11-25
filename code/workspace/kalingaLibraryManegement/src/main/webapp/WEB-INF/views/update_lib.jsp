<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body>
	<div>
		<form:form action="/save/${library.libraryId }"
			modelAttribute="library" method="post">
			<table>
				<tr>
					<td>Library Name:<form:input path="libraryName" /></td>
				</tr>
			</table>
			<input type="submit" value="Submit ">
		</form:form>
	</div>
</body>
</html>
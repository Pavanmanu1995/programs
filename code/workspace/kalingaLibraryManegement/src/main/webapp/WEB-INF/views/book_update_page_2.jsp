<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body>

<div>
		<form:form action="/updatenewbook/${bookupdate.bookId }"
			modelAttribute="bookupdate" method="post" >
			<table>
				<tr>
					<td>New Book Name:<form:input path="bookName" /></td>
				</tr>
			</table>
			<input type="submit" value="Submit ">
		</form:form>
	</div>
</body>
</html>
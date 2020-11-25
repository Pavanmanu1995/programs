<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
  
	text-align: center;
    max-width: 400px;
    border-radius:10px;
    margin: auto;
    background-color: #ff6666;
    box-sizing: border-box;
    padding: 40px;
    color: #fff;
    margin-top: 50px;
}
</style>
</head>
<body>
<form action="/deletebook" method="post">
	<div class="select">
		<select name="bookId" class="selectpicker" data-style="btn-primary">

			<option>--Select Book--</option>

			<c:forEach var="book" items="${bookList}">

				<option value="${book.bookId}">${book.bookName}</option>

			</c:forEach>

		</select>
		</div>
		<button type="submit">Delete Book</button>

	</form>

</body>
</html>
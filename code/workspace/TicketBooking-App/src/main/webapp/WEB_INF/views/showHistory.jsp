<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<title>history</title>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- <link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"> -->
	 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	
<link rel="stylesheet" type="text/css"
	href="/resources/css/showHistory.css">
	
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="homepage">TicketBookingApp</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="homepage">Home</a></li>
      <li><a href="book">book ticket</a></li>
      <li><a href="check">check train</a></li>
      <li><a href="view">travel history</a></li>
      <li><a href="/">log out</a></li>
    </ul>
  </div>
</nav>
	<div class="container justify-content-md-conter">

		<div class="container">
			<form:form name="myForm" action="getHistory"
				onsubmit="return validation()" method="post">


				<label for="user"><h3>User Name:</h3></label>
				<select name="userId">
					<c:forEach items="${users}" var="u">
						<option class="option" value="${u.userId}">${u.userName}</option>
					</c:forEach>
				</select>
				<br><br>
				
				<button type="submit" class="btn btn-primary btn-info btn-lg active">get
					booking</button>
			</form:form>
		</div>


		<div class="container">
		<span class="err"><c:out value="${error.errorMsg}"></c:out></span>	
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Source</th>
						<th>Destination</th>
						<th>Date</th>
				</thead>
				<tbody>
					<c:forEach var="booking" items="${blist}">
						<tr>
							<td>${booking.train.source}</td>
							<td>${booking.train.destination}</td>
							<td>${booking.date}</td>
							<th><a href="" class="btn btn-primary btn-sm" id="b">update</a></th>

							<th><a href="" class="btn btn-primary btn-danger btn-sm"
								id="b">cancel</a></th>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>
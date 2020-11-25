<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<title>bookticket</title>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<!-- <link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"> -->
	<link rel="stylesheet" type="text/css"
	href="/resources/css/bookTicket.css">
</head>
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
	<div class="container-fluid justify-content-center">
		<div class="row jumbatron">
			<div class="col-md-4 col-sm-4 col-xs-12"></div>
			<div class="col-md-4 col-sm-4 col-xs-12" id="pdiv">
				<form id="regForm" action="saveBooking" method="post">
					<div class="form-group">
						<label for="user">User Name:</label> <select name="userId">
							<c:forEach items="${userList}" var="u">
								<option value="${u.userId}">${u.userName}</option>
							</c:forEach>
						</select> <br />
					</div>
					<button type="submit" class="btn btn-success  btn-block">
						<h4>get book</h4>
					</button>
				</form>
			</div>
			<div class="col-md-4 col-sm-4 col-xs-12"></div>
		</div>
	</div>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</body>
</html>
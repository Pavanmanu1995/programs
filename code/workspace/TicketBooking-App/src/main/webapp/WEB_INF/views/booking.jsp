
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>booking</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css"
	href="/resources/css/booking.css">
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
	<div class="container">
		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-4" id="con">
			<form:form id="myForm" action="search" modelAttribute="searchDto">
				<div class="row">

					<div class="header">
						<label id="label" for="user">Ticket booking</label>
					</div>
				</div>
				<div class="row">
					<div class="form-group col-md-2">
						<label id="label" for="user">Source:</label>
					</div>
					<div class="form-group col-md-2" id="option">
						<select name="source" id="source">
							<option value="">---select Source----</option>
							<c:forEach items="${trains}" var="train">
								<option value="${train.source}">${train.source}</option>
							</c:forEach>
						</select> <br />
					</div>
				</div>
				<div class="row">
					<div class="form-group col-md-2">
						<label id="label" for="user">Destination: </label>
					</div>
					<div class="form-group col-md-2" id="option">
						<select name="destination" id="destination">

							<option value="">---select destination---</option>
							<c:forEach items="${trains}" var="train">
								<option value="${train.destination}">${train.destination}</option>
							</c:forEach>
						</select> <br />
					</div>
				</div>
				<div class="form-group">
					<button class="btn btn-primary" type="submit">Search</button>
				</div>
</form:form>
			</div>
			<div class="col-md-4"></div>

		</div>
	</div>
	<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-2.1.3.min.js"></script>
	<script
		src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.0/jquery.validate.min.js"></script>
	<script
		src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.0/additional-methods.min.js"></script>
		<script type="text/javascript" src="/resources/js/bookingValidate.js"></script>
		
</body>
</html>
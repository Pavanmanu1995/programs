<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<title>show train</title>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- <link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"> -->
	 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	 <link rel="stylesheet" type="text/css"
	href="/resources/css/showTrain.css">
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
	<div class="container justify-content-md-conter">
		<div class="container">
		<div style="align:center"><h1><span class="err"><c:out value="${error.errorMsg}"></c:out></span></h1></div>
			<c:forEach var="train" items="${trainList}">
				<h2>${train.key}</h2>

				<table class="table table-striped">
					<thead>
						<tr>
							<th>Train Id</th>
							<th>Train Name</th>
							<th>cost</th>
							<th>book</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="t" items="${train.value}">
							<tr>
								<td>${t.trainId}</td>
								<td>${t.trainName}</td>
								<td>${t.cost}</td>
								<th><a href="bookTrain?id=${t.trainId}" class="btn btn-primary btn-sm" id="b">book</a></th>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</c:forEach>
		</div>
	</div>
</body>
</html>
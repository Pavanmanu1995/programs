<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>">
<title>Insert title here</title>
<style type="text/css">
.index-body {
	background-image: url("/resources/images/img3.jpeg");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: 100% 100%;
}

.parallax1 {
	margin-top: 2%;
	/* The image used */
	background-image: url("/resources/images/img3.jpg");
	border: 10px solid gray;
	/* Full height */
	height: 528px;
	/* Create the parallax scrolling effect */
	background-attachment: fixed;
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
	text-align: center;
	color: aqua;
}

.centered {
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
}

.parallax {
	/* The image used */
	background-image: url("/resources/images/img3.jpg");
	border: 10px solid gray;
	/* Full height */
	height: 528px;
	/* Create the parallax scrolling effect */
	background-attachment: fixed;
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
}
</style>


</head>

<body class="index-body" style="background-color: white;">

	<nav class="navbar navbar-inverse navbar-fixed-top"
		style="background-color: black;">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="/">Resto Line Portal</a>
			</div>
			<ul class="nav navbar-nav navbar-right">

				<li><a href="/register"><span
						class="glyphicon glyphicon-user"></span> Register</a></li>
				<li><a href="/login"><span
						class="glyphicon glyphicon-log-in"></span> Login</a></li>

			</ul>
		</div>
	</nav>

	<div class="parallax1">
		<div class="centered" style="font-weight: bold;font-size: 50px">Welcome <br>To<br> Resto Line Portal</div>
	</div>


	<div style="height: 340px; background-color: gray;">
		<br> <br>

		<div
			style="background-color: white; width: 90%; height: 250px; margin-left: 5%; box-shadow: 0 10px 15px 0 rgba(0, 0, 0, 0.5), 0 10px 25px 0 rgba(0, 0, 0, 0.25);">
			<div style="padding-top: 25px; font-size: 20px; margin-left: 44%">
				<h2 style="font-weight: bold;">About Us</h2>
			</div>
			<hr style="width: 10%; border-color: black;">

			<div
				style="padding-left: 10%; padding-right: 10%; font-size: 17px; text-align: center;">
				Welcome to <b>"Resto Line Portal"</b>, In this website you can book
				your Book Seat in restaurant.You can also see your Reservation
				Histroy in this site.
			</div>
		</div>
	</div>

	<div class="parallax"></div>


</body>
</html>
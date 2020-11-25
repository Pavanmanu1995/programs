<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>

<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Ticket</title>
<style>
.item {
	height: 100vh;
	min-height: 300px;
	background: no-repeat center center scroll;
	-webkit-background-size: cover;
	background-size: cover;
}
</style>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toogle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> 
					<span class="icon-bar"></span> 
					<span class="icon-bar"></span>
				    <span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">RAIL.GO</a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li class="active"> <a href="#"> <span
							class="glyphicon glyphicon-home"
							style="font-size: 24px; color: lightblue;"></span>Home</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="register"><span
							class="glyphicon glyphicon-user"
							style="font-size: 24px; color: lightblue;"></span>REGISTER</a></li>
					<li><a href="book">BOOK TICKET</a></li>
					<li><a href="checkTrain"><span
							class="glyphicon glyphicon-search"
							style="font-size: 24px; color: lightblue;"></span>CHECK TRAIN</a></li>
							<li><a href="showHistory">TRAVELHISTORY</a>
							<li><a href="/">LOG OUT</a>
				</ul>


			</div>
		</div>
	</nav>
	<div class="container">
		<!--  <div id="myCarousel" class="carousel slide" data-ride="carousel">
			
			<ol class="caroulsel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
			</ol>
			
			<div class="carousel-inner">
				<div class="item active">
					<img class="d-block w-100" src="images/train1.jpg" alt="train one"
						style="width: 100%; height: 100vh; -webkit-background-size: cover; background-size: cover;">
				</div>
				
				<div class="item">
					<img class="d-block w-100" src="images/train2.jpg" alt="train two"
						style="width: 100%; height: 100vh; -webkit-background-size: cover; background-size: cover;">
				</div>
				
				<div class="item">
					<img class="d-block w-100" src="images/train3.jpg"
						alt="train three"
						style="width: 100%; height: 100vh; -webkit-background-size: cover; background-size: cover;">
				</div>
			</div>
			
			
			<a class="left carousel-control" href="#myCarousel" data-slide="prev">
				<span class="glyphicon glyphicon-chevron-left"></span> <span
				class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#myCarousel"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right"></span> <span
				class="sr-only">Next</span>
			</a>
		</div>
	</div> 
-->

		<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<!-- Indicators -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
			</ol>

			<!-- Wrapper for slides -->
			<div class="carousel-inner">
				<div class="item active">
					<img src="images/train1.jpg" alt="Los Angeles" style="width: 100%;">
				</div>

				<div class="item">
					<img src="images/train2.jpg" alt="Chicago" style="width: 100%;">
				</div>

				<div class="item">
					<img src="images/train3.jpg" alt="New york" style="width: 100%;">
				</div>
			</div>

			<!-- Left and right controls -->
			<a class="left carousel-control" href="#myCarousel" data-slide="prev">
				<span class="glyphicon glyphicon-chevron-left"></span> <span
				class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#myCarousel"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right"></span> <span
				class="sr-only">Next</span>
			</a>
		</div>
	</div>
</body>
</html>
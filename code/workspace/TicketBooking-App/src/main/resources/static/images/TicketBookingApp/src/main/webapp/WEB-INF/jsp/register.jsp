<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>


 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	 <link rel="stylesheet" type="text/css" href="/resources/css/register.css">
<style>
.help-block {
	color: red;
}

.form-group {
	color: red;
}

#content{
text-align:center;
border: 1px solid black;
border-radius: 20px;
width: 400px;
height: 400px;
margin-top: 100px;
background-color: #66e0ff; 
}
body{
background-image: url('https://www.baublatt.ch/sites/default/files/styles/facebook/public/2017-11/lavaux.jpg?h=7b0a74da&itok=jIpcep1P');
background-position: center;
background-size: cover;
background-repeat: no-repeat;
height: 800px;
}
</style>

</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">TicketBookingApp</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#">Register</a></li>
      <li><a href="#">book ticket</a></li>
      <li><a href="#">check train</a></li>
      <li><a href="#">travel history</a></li>
    </ul>
  </div>
</nav>
	<div class="container">
		<div class="col-md-4"></div>
		<form id="regform" action="saveUser" modelAttribute="user" method="post">

			<div class="col-md-10 m-auto" id="content">
			<h1>New Register </h1>
				<div class="form-group">
					<input class="form-control" name="userName" id="userName"
						placeholder="user name" type="text">
				</div>
				<div class="form-group">
					<input class="form-control" name="email" id="email"
						placeholder="Email address" type="email">
				</div>
				<div class="form-group">
					<input class="form-control" name="password" id="password"
						placeholder="Password" type="password">
				</div>
				<div class="form-group">
					<input class="form-control" name="password2" id="password2"
						placeholder="Re-enter password" type="password"><br><br>
						
						<input class="btn btn-primary btn-block pool-right" id="submit-button"
					type="submit" value="Sign Up"> <br>
					<label>already user log in <a href="/">here</a></label> </p1>
				</div>

			</div>
			<div class="form-group col-md-4">
				
			</div>

		</form>
		<div class="col-md-2"></div>

	</div>
	<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-2.1.3.min.js"></script>
	<script
		src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.0/jquery.validate.min.js"></script>
	<script
		src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.0/additional-methods.min.js"></script>
		<script type="text/javascript" src="/resources/js/registerValidate.js"></script>
</body>
</html>
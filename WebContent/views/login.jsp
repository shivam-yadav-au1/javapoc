<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<head>
<title>Center Align</title>

<style>
* {
	margin: 0;
	padding: 0;
}
body{
background-color:  mintcream;
}

.container {
	width: 100%;
	
	height: 100vh;
	display: flex;
	justify-content: center;
	align-items: center;
}

/* these rules will apply on item which belong to class .login-container and descendant of element of class .container*/
.container .login-container {
	width: 50%;
	height: 50%;
	background-color: #34bf49;
	display: flex;
	justify-content: center;
	align-items: center;
	box-shadow: 0px 0px 15px #000;
	/* Shadow */
	border-radius: 50% 0%;
	/* Rounded border */
	-moz-transition: all 1s;
	-webkit-transition: all 1s;
	-o-transition: all 1s;
	cursor: pointer;
}

.container .login-container:hover {
	box-shadow: 0px 0px 15px #000;
	/* Shadow */
	border-radius: 0% 50%;
	/* Rounded border */
	-moz-transition: all 1s;
	-webkit-transition: all 1s;
	-o-transition: all 1s;
	cursor: pointer;
}

.form {
	display: flex;
	flex-direction: column;
	align-items: center;
}

.form .form-container {
	margin-top: 5px;
	width: 225px;
	height:25px;
}

.button {
	background-color: white;
	border: none;
	color: white;
	padding: 5px 15px 5px 15px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	margin-top: 20px;
	margin-right: 5px;
	-webkit-transition-duration: 0.4s;
	transition-duration: 0.4s;
	cursor: pointer;
}

.button1 {
	background-color: white;
	color: black;
	border: 2px solid #555555;
}

.button1:hover {
	background-color: #555555;
	color: white;
}
h3{
	margin-top: 10px;
}
</style>
</head>

<body>
	
	<div class="container">
		<div class="login-container">
			
			<form class="form" action="./loginForm" method="GET">
				<input class="form-container" type="text" name="name"placeholder="User Name"></br>
				<input class="form-container"type="password" name="password" placeholder="Password"></br>
					
				<div class="button-container">
				
						
						<input class="button button1" type="submit" name="action" value="Login">
						<input class="button button1" type="submit" name="action" value="Register">
				</div>
					<h3>${welcomeMessage}</h3>
			</form>
		</div>
	</div>
</body>

</html>

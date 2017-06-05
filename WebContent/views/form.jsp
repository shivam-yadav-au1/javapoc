<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>


<title></title>
<style>
.
* {
	margin: 0;
	padding: 0;
}

body {
	background-color: mintcream;
}

.container {
	width: 100%;
	height: 100vh;
	display: flex;
	justify-content: center;
	align-items: center;
}

.container .registerationform-container {
	width: 50%;
	height: 50%;
	margin: 30px auto;
	background-color: #34bf49;
	display: flex;
	justify-content: center;
	align-items: center;
	border-radius: 0;
	/* This removes the roundness of border (value 0) */
	-moz-transition: all 1s;
	-webkit-transition: all 1s;
	-o-transition: all 1s;
	cursor: pointer;
}

.container .registerationform-container:hover {
	border-radius: 45%/20%;
	/* Rounded border */
	box-shadow: 0px 0px 15px #000;
	/* Shadow */
	padding: 0;
	-moz-transition: all 1s;
	-webkit-transition: all 1s;
	-o-transition: all 1s;
}

.form {
	display: flex;
	flex-direction: column;
	align-items: center;
}

.form .form-item {
	margin-top: 5px;
	width: 225px;
	height: 20px;
}

.button-container {
	display: flex;
	flex-direction: row;
	justify-content: center;
	align-items: center;
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
</style>
</head>

<body>
	<h1>${message}</h1>
	<div class="container">
		<div class="registerationform-container">
			<form class="form" action="./inputForm" method="GET">
				<input class="form-item" type="text" name="name"placeholder="User Name"></br>
				 <input class="form-item"type="text" name="password" placeholder="Password"></br>
				  <input class="form-item" type="text" name="email" placeholder="Email"></br>
				<div class="button-container">

					<input class="button button1" type="submit" name="action"
						value="Register">
				</div>

			</form>
		</div>
	</div>
</body>

</html>
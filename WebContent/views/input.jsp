<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
<style>
.
* margin {
	margin: 0;
	padding: 0;
}

.container {
	width: 100%;
	background-color: mintcream;
	height: 100vh;
	display: flex;
	flex-direction: column;
	justify-content: flex-start;
	align-items: center;
}

.form {
	display: flex;
	flex-direction: row;
	align-items: center;
}

.form-container {
	margin-left: 5%;
	margin-bottom: 10%;
}

.table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
	height: 50px;
}
</style>
</head>

<body>
	<div class="container">
		<a href="${pageContext.request.contextPath}/students/update?rollno=${rollno}&name=${name}
		&address=${address}&course=${course}">Update</a><br>
		<a href= "${pageContext.request.contextPath}/students/new">Add Student</a><br>
		<a href= "${pageContext.request.contextPath}/listofstudents">List Of Students</a>
		
		<h3>${sessionScope["name"]}</h3>
	<!--  	<form action="./studentList" method="GET">
			<input class="form-container" type="text" name="size" placeholder="Enter Size of List">
			<input class="form-container" type="submit" name="action" value="Submit">

		</form> -->



	</div>

</body>

</html>


</html>


</html>
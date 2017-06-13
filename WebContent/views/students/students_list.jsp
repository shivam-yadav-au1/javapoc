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
		<h1>Welcome List Of Students</h1>

		<table>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Address</th>
				<th>Course</th>
			</tr>
			<c:forEach items="${studentList}" var="student">
				<tr>
					<td><a href = "${pageContext.request.contextPath}/students/update?rollno=${student.id}&name=
					${student.name}&address=${student.address}&course=${student.course}">${student.id}</a></td>
					<td>${student.name}</td>
					<td>${student.address}</td>
					<td>${student.course}</td>
				</tr>
			</c:forEach>

		</table>

	</div>

</body>

</html>


</html>


</html>
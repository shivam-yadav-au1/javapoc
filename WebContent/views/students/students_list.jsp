<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
<jsp:include page="/views/css/style.jsp"></jsp:include>
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
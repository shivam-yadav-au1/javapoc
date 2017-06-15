<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>Document</title>

<jsp:include page="/views/css/style.jsp"></jsp:include>
</head>
<body>
	<!--Start of header -->
<jsp:include page="/views/header/header.jsp"></jsp:include>

	<!-- End of header -->

	<!--Start of input fields -->
	<div class="row margin-top">
		<!--      <h3>${pageContext}</h3></br> 
    <h3>${param}</h3></br> 
    <h3>${pageContext.request }</h3> -->
	<!-- <h2>${sessionScope}</h2> -->
		<div class="col_4"></div>
		<div class="col_4">

			<form action="${pageContext.request.contextPath}/students/new" method="get">
				<input class="input" type="text" name="rollno" size="30" placeholder="Roll No">
				<input class="input" type="text" name="name" size="30" placeholder="Name Of Student"> 
				<input class="input" type="text" name="address" size="30" placeholder="Address">
				<input class="input" type="text" name="course" size="30" placeholder="Course">

				<!--Start of Buttons -->
				<div class="row">
					<div class="col_4"></div>
					<div class="col_4 button-container">
						<button class="button button1" type="submit" name="action"
							value="Add">ADD</button>
						<button class="button button2" type="submit" name="action"
							value="Back">BACK</button>

					</div>
					<div class="col_4"></div>
				</div>
				<!--End of buttons block -->



			</form>
		</div>
		<div class="col_4"></div>
	</div>
	<!--End of input fields -->

	<!-- Start of message cotainer -->

	<jsp:include page="/views/students/error.jsp">
	
	
		<jsp:param value="${message}" name="messageType"/>
	
	</jsp:include>


</body>
</html>

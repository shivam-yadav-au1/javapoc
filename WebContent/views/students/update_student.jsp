<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
<head>


<jsp:include page="/views/css/style.jsp"></jsp:include>

<title>Document</title>


</head>
<body>
	<!--Start of header -->

	<jsp:include page="/views/header/header.jsp"></jsp:include>

	<!-- End of header -->

	<!--Start of input fields -->
	<div class="row margin-top">

		<div class="col_4"></div>
		<div class="col_4">

			<form action="./update">
				<input class="input" type="text" name="rollno"
					value="${param.rollno}" size="30" placeholder="Roll No"> <input
					class="input" type="text" name="name" value="${param.name}"
					size="30" placeholder="Name Of Student"> <input
					class="input" type="text" name="address" value="${param.address}"
					size="30" placeholder="Address"> <input class="input"
					type="text" name="course" value="${param.course }" size="30"
					placeholder="Course">

				<!--Start of Buttons -->
				<div class="row">
					<div class="col_4"></div>
					<div class="col_4 button-container">
						<button class="button button1" type="submit" name="action"
							value="Update">UPDATE</button>
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

	<div class="row">
		<div class="col_4"></div>
		<div class="col_4 message-container">

			<c:if test="${message != null }">

				<c:choose>
					<c:when test="${message == false}">
						<h4 style="color: red">Message : Error not updated !</h4>
					</c:when>
					<c:otherwise>
						<h4 style="color: green">Message : Successfully updated !</h4>
					</c:otherwise>
				</c:choose>


			</c:if>





		</div>
		<div class="col_4"></div>
	</div>

	<!-- End of message cotainer -->



</body>
</html>

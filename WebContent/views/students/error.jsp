<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="row">
	<div class="col_4"></div>
	<div class="col_4 message-container">

		
		
			<c:choose>
				
				<c:when test="${param.messageType == 'error'}">
					<h4 style="color: red">Message : Error</h4>
				</c:when>
				<c:when test="${param.messageType == 'success'}">
				
					<h4 style="color: green">Message : Successful</h4>
				</c:when>
			</c:choose>
		</div>
	<div class="col_4"></div>
</div>

<!-- End of message cotainer -->

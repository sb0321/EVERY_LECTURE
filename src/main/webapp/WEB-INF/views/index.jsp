<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% String context = request.getContextPath(); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>당신의 프로그래밍 - EVERY-LECTURE</title>
<script src="<%= context %>/resources/js/jquery-3.4.1.js"></script>
<script src="<%= context %>/resources/js/effect/button.js"></script>
<script src="<%= context %>/resources/js/index/index.js"></script>
<link rel="stylesheet" href="<%= context %>/resources/css/reset.css">
<link rel="stylesheet" href="<%= context %>/resources/css/effect/button.css">
<link rel="stylesheet" href="<%= context %>/resources/css/index/index.css">
</head>
<body>
	<jsp:include page="index/index_top.jsp"></jsp:include>
	<section id="header">
		<div id="head">
			<div id="head_left_wrap">
				<div id="head_left">
					<h2>모두를 위한 강의.<br>
					모두를 위한 프로그래밍.</h2>
					<div id="left_sub">Java부터 데이터베이스까지 전부 무료!</div>
				</div>
			</div>
			<div id="head_right_wrap">
				
			</div>
		</div>
	</section>
	<footer id="footer">
		
	</footer>
	<button id="testBtn" class="eBtn">테스트 페이지 이동</button>
</body>
</html>
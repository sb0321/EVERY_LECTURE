<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
<meta charset="UTF-8">
<title>당신의 프로그래밍 - EVERY-LECTURE</title>
<script src="<%= context %>/resources/js/index/index.js"></script>
<link rel="stylesheet" href="<%= context %>/resources/css/index/index.css">
</head>
<body>
<%-- 	<jsp:include page="./index/index_top.jsp"></jsp:include> --%>
	
	<%@ include file="index/index_top.jsp" %>
	<section id="header">
		<div id="head">
			<div id="head_left_wrap">
				<div id="head_left">
					<div id="intro">
						모두를 위한 강의.<br>모두를 위한 프로그래밍.
					</div>
					<br>
					<br>
					<div id="left_sub">Java부터 데이터베이스까지 전부 무료!</div>
					<br><br>
					<c:if test="${empty sessionScope.uInfo }">
						<button id="joinButton" class="eBtn">회원 가입</button>
					</c:if>
					<c:if test="${not empty sessionScope.uInfo }">
						<button id="lectureButton" class="eBtn">강의 둘러보기</button>
					</c:if>
				</div>
			</div>
			<div id="head_right_wrap">
				<div id="head_right">
					<div id="showTable">
					</div>
				</div>
			</div>
			<div id="background">
			</div>
		</div>
	</section>
	<footer id="footer">
		
	</footer>
	<button id="testBtn" class="eBtn">테스트 페이지 이동</button>
</body>
</html>
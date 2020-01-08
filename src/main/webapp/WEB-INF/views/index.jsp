<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
<meta charset="UTF-8">
<title>당신의 프로그래밍 - EVERY-LECTURE</title>
<script src='<c:url value='/resources/js/index/index.js'/>'></script>
<script src='<c:url value='/resources/js/index/index_middle.js'/>'></script>

<link rel="stylesheet" href='<c:url value='/resources/css/index/index.css'/>'>
</head>
<body>
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
						<a href='<c:url value='/join/joinForm'/>'><button id="joinButton" class="eBtn">회원 가입</button></a>
					</c:if>
					<c:if test="${not empty sessionScope.uInfo }">
						<a href='<c:url value='/lecture/lectureIndex'/>'><button id="lectureButton" class="eBtn">강의 둘러보기</button></a>
					</c:if>
				</div>
			</div>
			<div id="head_right_wrap">
				<div id="head_right">
					<div id="showTable">
						<div>
							<h1>어떤 강의를 찾으시나요?</h1>
						</div>
						<div id="table_intro">
							<label id="search_wrapper">
								<img id="search_icon" alt="" src='<c:url value='/resources/image/search.png' />'>
								<input id="search" class="eBtn" placeholder="무엇을 검색하고 싶나요?"/>
							</label>
						</div>
						<div id="show_context">

							<div>● 컴퓨터에 관심이 있으신 분들을 위해</div>
							<div>● 새로운 것을 배우고 싶으신 분들을 위해</div>
							<div>● 자신의 전공을 다지고 싶으신 분들을 위해</div>
						</div>
					</div>
				</div>
			</div>
			<div id="background">
			</div>
		</div>
	</section>
	<%@ include file="index/index_middle.jsp" %>
	<footer id="footer">
		<div id="joinSession">
			<div>이제 시작할 준비가 되셨나요?</div>
			<button id="joinButtonFooter" class="eBtn">회원 가입 하기</button>
		</div>
		<div id="last">
			<div id="last_left">
				<h2>The flat icon belongs to www.flaticon.com</h2>
				<br>
				<h2>This site is made by Golden Brothers.Inc</h2>
			</div>
			<div id="last_right">
			</div>
		</div>
	</footer>
</body>
</html>
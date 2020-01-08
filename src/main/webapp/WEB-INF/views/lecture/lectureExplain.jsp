<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>lecture explain</title>
	<link rel="stylesheet" href='<c:url value='/resources/css/lecture/lectureExplain.css'/>'>
</head>
<body>
	<%@ include file="../index/index_top.jsp" %>
	<div id="wrapper">
		<div id="head">
			<br><br>
			<h3>Lecture-Introduce</h3>
		</div>
	
		<div id="content">
			<div id="lecture_intro">
				<div id="intro_image"></div>
				<div id="intro_title"></div>
				<div id="intro_exp"></div>
			</div>
			
			<div></div>
		</div>
		
		<div id="footer">
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
		</div>
	</div>
</body>
</html>
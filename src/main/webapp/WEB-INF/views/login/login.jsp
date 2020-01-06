<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<link rel="stylesheet" href='<c:url value='/resources/css/login/login.css'/>'>

<section id="window">
	<div id="context">
		<img id="logoFull" alt="<EVERY-LECTURE>" src='<c:url value='/resources/image/logo-full-clear.png'/>'>
		<br>
		<br>
		<br>
		<c:if test="${empty uInfo}">
			<div id="yesNo">아이디나 비밀번호가 틀린 것 같습니다.</div>
		</c:if>
		<form id="loginForm" method="post" action='<c:url value='/login/userLogin' />'>
			<input id="userID" name="userID" class="eInput" type="text" placeholder="ID">
			<br>
			<br>
			<input id="userPW" name="userPW" class="eInput" type="password" placeholder="Password">
			<br>
			<br>
			<input id="loginSubmit" class="eBtn" type="submit" value="Login">
		</form>
		<br>
		<hr>
		<div id="indicator">
			<a href='<c:url value="/login/joinForm"/>'><div class="index_top">회원 가입</div></a>
			<a href='<c:url value="/"/>'><div class="index_top">홈페이지로 가기</div></a>
		</div>
	</div>
</section>

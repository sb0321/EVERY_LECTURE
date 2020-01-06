<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
	<link rel="stylesheet" type="text/css" href="../resources/css/join/joinForm.css">
</head>
<body>
	<%@ include file="../index/index_top.jsp" %>
	<h3 align="center">회원가입</h3>
	<hr>
	
	<div id="joinLogo">
		<br>
		<img id="logo-Full" alt="<EVERY-LECTURE>" src='<c:url value='/resources/image/logo-full.png'/>'>
		<br>
	</div>
	
	<div id="joinDiv">
		<table class="joinTable">
			<tr><th scope="row">이 름</th><td><input type="text" id="name" name="name"></td></tr>
			<tr><th scope="row">아이디</th><td><input type="text" id="id" name="id"><button class="eBtn">중복체크</button></td></tr>
			<tr><th scope="row">비밀번호</th><td><input type="password"></td></tr>
			<tr><th scope="row">비밀번호 확인</th><td><input type="password"></td></tr>
			<tr><td colspan="2" align="center">
			<button class="eBtn" type="submit">회원가입</button>
			<button class="eBtn" type="reset">취 소</button></td></tr>
		</table>
	</div>
</body>
</html>
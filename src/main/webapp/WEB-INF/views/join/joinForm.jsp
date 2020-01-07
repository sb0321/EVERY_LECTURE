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
	
	<div id="join_container">
		<div id="join_content">
			<div id="join_logo">
				<img id="logo-full" alt="<EVERY-LECTURE>" src='<c:url value='/resources/image/logo-full.png'/>'>
			</div>
			
				<div class="join_box" id="join_another">
					<h3 id="id_title">아이디</h3>
					<input class="eInput" type="text" id="id" name="id" maxlength="20"><button class="eBtn">중 복 체 크</button>
				</div>
				<br>
			<div id="join_wrapper">
				<div class="join_box">
					<h3 class="join_title">비밀번호</h3>
					<input class="eInput" type="password" id="pw" name="pw" maxlength="20">
				</div>
				<br>
				<div class="join_box">
					<h3 class="join_title">비밀번호 확인</h3>
					<input class="eInput" type="password" id="pwc" name="pwc" maxlength="20">
				</div>
				<br>
				<div class="join_box">
					<h3 class="join_title">이 름</h3>
					<input class="eInput" type="text" id="name" name="name" maxlength="20">
				</div>
				<br>	
				<div id="join_button">
					<button class="eBtn" type="submit">가 입</button><button class="eBtn" type="reset">취 소</button>
				</div>
			</div>
		</div>
	</div>
	
</body>
</html>
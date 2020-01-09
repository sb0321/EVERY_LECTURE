<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sign in</title>
	<script src='<c:url value='/resources/js/join/join.js'/>'></script>
	<link rel="stylesheet" type="text/css" href="../resources/css/join/joinForm.css">
</head>
<body>
	<%@ include file="../index/index_top.jsp" %>
	
	<div id="wrapper">
		<div id="head">
			<br><br>
			<h3>Sign-In</h3>
			<br><hr>
		</div>
	
		<div id="join_content">
			
			
				<div class="join_box" id="join_another">
					<h3 id="id_title">아이디</h3>
					<input class="eInput" type="text" id="id" name="id" maxlength="20">
					<button id="checkID" class="eBtn">중 복 체 크</button>
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
					<button id="submit" class="eBtn" type="submit">가 입</button>
					<button class="eBtn" type="reset">취 소</button>
				</div>
			</div>
			<br>
		</div>
		
		<div id="footer">
			
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
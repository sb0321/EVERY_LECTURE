<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${uInfo.userName }님의 마이페이지입니다.</title>
<script src='<c:url value='/resources/js/mypage/mypage.js'/>'></script>
<link rel="stylesheet" href='<c:url value='/resources/css/mypage/mypage.css'/>'>
</head>
<body>
	<%@ include file="../index/index_top.jsp" %>
	<section>
		<div id="left_section">
			<div id="profile_wrapper">
				<div id="profile">
					<img alt="이미지가 없습니다." src='<c:url value='/resources/image/user-icon.png' />'>
					<div>${uInfo.userName }</div>
				</div>
				<div id="profile_indicator">
					<a href='<c:url value='/logout' />'><button class="eBtn" >로그아웃</button></a>
					<a href='<c:url value='/' />'><button class="eBtn">홈페이지로 이동</button></a>
				</div>
			</div>
			<div id="content_bar">
				<div class="content_list">프로필</div>
				<div class="content_list">내가 등록한 강의</div>
			</div>
		</div>
		<div id="right_section">
			<div id="right_wrapper">
				<div id="context">프로필</div>
				<div id="content_wrapper">
					<div class="userForm">
						<div>이름</div>
						<hr>
						<input id="userName" name="userName" type="text" value="${uInfo.userName}">
						<label>
							<button id="nameModify" class="eBtn">수정하기</button>
						</label>
					</div>
					<div class="userForm">
						<div>비밀번호</div>
						<hr>
						<label>현재 비밀번호</label>
						<input name="userPW" type="password" value="${uInfo.userPW}">
						<br><br>
						<label>바꿀 비밀번호</label>
						<input name="newUserPW" type="password" value="${uInfo.userPW}">
						<br><br>
						<button id="PWModify" class="eBtn">수정하기</button>
					</div>
				</div>
			</div>
		</div>
	</section>

</body>
</html>
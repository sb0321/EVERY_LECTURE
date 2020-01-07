<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src='<c:url value='/resources/js/mypage/mypage.js'/>'></script>
<link rel="stylesheet" href='<c:url value='/resources/css/mypage/mypage.css'/>'>
<div id="right_wrapper">
	<div id="context">프로필</div>
	<div id="content_wrapper">
		<div id="mid">
			<div id="userForm" class="userForm">
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
				<input id="userPWNow" name="userPW" type="password">
				<br><br>
				<label>바꿀 비밀번호</label>
				<input id="newUserPW" name="newUserPW" type="password">
				<br><br>
				<button id="PWModify" class="eBtn">수정하기</button>
			</div>
			<hr id="expireBottom">
			<div class="userForm">
				<a id="expireUser" href="#">회원 탈퇴</a>
			</div>
		</div>
	</div>
</div>
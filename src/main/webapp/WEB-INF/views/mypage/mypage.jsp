<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${uInfo.userName }님의 마이페이지입니다.</title>
<script src='<c:url value='/resources/js/mypage/mypage.js'/>'></script>
<script src='<c:url value='/resources/js/mypage/mypage_switch.js'/>'></script>
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
				<div class="content_list"><a id="profileBtn">프로필</a></div>
				<div class="content_list">
					<a id="lectureBtn">내가 등록한 강의</a>
				</div>
			</div>
		</div>
		<div id="right_section">
			<%@ include file="mypage_user.jsp" %>
		</div>
	</section>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String context = request.getContextPath(); %>
<body>
	<div id="navi">
		<div id="top_left">
			<a href="#none">
				<img id="logoImg" alt="이미지를 불러오는 것을 실패했습니다." 
				src="<%= context %>/resources/image/logo-white.png">
				<label id="lecture">EVERY-LECTURE</label>
			</a>
		</div>
		<div id="top_right">
			<div id="login" class="index_top">
				<a href="#none">로그인</a>
			</div>
			<div class="index_top">
				<a href="#none">회원 가입</a>
			</div>
			<div class="index_top">
				<a href="#none">강의 보러가기</a>
			</div>
		</div>
	</div>
</body>
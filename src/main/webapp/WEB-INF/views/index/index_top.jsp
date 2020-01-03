<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<body>
	<div id="navi">
		<div id="top_left">
			<a href="#none">
				<img id="logoImg" alt="이미지를 불러오는 것을 실패했습니다." 
				src="<%= context %>/resources/image/logo-white.png">
				<a id="logoWord">EVERY-LECTURE</a>
			</a>
		</div>
		<div id="top_right">
		<!-- 세션이 없다면 -->
			<c:if test="${empty sessionScope.sid}">
				<div id="login" class="index_top">
					<a href="#none">로그인</a>
				</div>
				<div class="index_top">
					<a href="#none">회원 가입</a>
				</div>
			</c:if>
			<c:if test="${not empty sessionScope.sid}">
				<div>
				
				</div>
			</c:if>
			<div class="index_top">
				<a href="#none">강의 보러가기</a>
			</div>
		</div>
	</div>
</body>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<link rel="stylesheet" href='<c:url value='/resources/css/mypage/mypage.css'/>'>
<div id="right_wrapper">
	<div id="context">강의 목록</div>
	<div id="content_wrapper">
		<div id="lect_mid">
		
			<div id="lect_title">
				<div id="jTitle_check">선택</div>
				<div id="jTitle_image"></div>
				<div id="jTitle_name">강의 제목</div>
				<div id="jTitle_progress">진행도</div>	
				<br><br><hr>	
			</div>
			<div>
				<c:forEach items="" var="prd">
					<div id="lect_check"></div>
					<div id="lect_image"></div>
					<div id="lect_name"></div>
					<div id="lect_progress"></div>
				</c:forEach>
			</div>
		</div>
	</div>
</div>

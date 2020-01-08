<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>강의 관리 페이지</title>
<script src='<c:url value='/resources/js/admin/lecture_index_admin.js'/>'></script>
<link rel="stylesheet" href='<c:url value='/resources/css/admin/lecture_index_admin.css'/>'>
</head>
<body>
	<%@ include file="../index/index_top.jsp" %>
	<div id="lecture_admin_page">
		<div id="title">
			<h3>-강의 관리 페이지 입니다-</h3>
			<br><hr>
		</div>
		
		<section id="wrapper">
			<c:forEach items="${lectureList}" var="lectureList" varStatus="status">
				<div class="lectureTable">
					<div class="lectureLeft">
						<img alt="강의 이미지" class="lectureImg" src="${lectureList.lectureImgPath}">
					</div>
					<div class="lectureRight">
						<div class="right_wrapper">
							<div class="lectureName">
								<div>
									<c:out value="${lectureList.lectureName}"/>
								</div>
							</div>
							<div class="lectureExplain">
								<div>
									<c:out value="${lectureList.lectureExplain }"/>
								</div>
								<div>
									<button class="eBtn" value="${lectureList.lectureID}">강의 삭제하기</button>
								</div>
							</div>
						</div>
					</div>		
				</div>
			</c:forEach>
		</section>
	</div>
</body>
</html>
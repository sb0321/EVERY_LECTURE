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
			<h3>강의 관리 페이지 - 관리자</h3>
			<br><hr>
		</div>
		
		<section id="wrapper">
			<div id="content1">
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
			</div>
		</section>
		
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
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>강의 페이지</title>
<link rel="stylesheet" href='<c:url value='/resources/css/lecture/lecture_index.css'/>'>
</head>
<body>
	<%@ include file="../index/index_top.jsp" %>
	<section id="wrapper">
		<c:forEach items="${lectureList}" var="lectureList">
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
						</div>
					</div>
				</div>		
			</div>
		</c:forEach>
	</section>
</body>
</html>
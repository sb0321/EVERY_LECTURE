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
				<div id="lectureLeft">
					<img alt="강의 이미지" src="${lectureList.lectureImgPath}">
				</div>
				<div id="lectureRight">
					${lectureList.lectureImgPath}
				</div>		
			</div>
		</c:forEach>
	</section>
</body>
</html>
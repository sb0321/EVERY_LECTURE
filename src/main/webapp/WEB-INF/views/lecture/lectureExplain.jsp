<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>lecture explain</title>
	<link rel="stylesheet" href='<c:url value='/resources/css/lecture/lectureExplain.css'/>'>
</head>
<body>
	<%@ include file="../index/index_top.jsp" %>
	<div id="wrapper">
		<div id="head">
			<br><br>
			<h3>Lecture-Introduce</h3>
		</div>
		
		<div id="content1">
		
			<div id="lecture_intro">
				<div id="intro_image">
					<img id="image" alt="강의 이미지" src="">
				</div>
				
				<div id="intro_title">
					<h3>제목제목제목제목제목제목제목제목제목</h3>
				</div>
				
				<div id="intro_exp">
				<br><hr>
					<h2>설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명
						설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명
						설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명
						설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명
						설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명
						설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명
						설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명
						설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명설명
					</h2>
				</div>
			</div>
		</div>
		

		<div id="content2">
			<div id="video_area">
		<%-- 	<c:forEach items="${videoList}" var="videoList"> --%>	
				<div id=video_section>
					<c:out value="${videoList.videoTitle }"/>
				</div>
		<%-- 	</c:forEach> --%>	
			</div>			
		</div>
		
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
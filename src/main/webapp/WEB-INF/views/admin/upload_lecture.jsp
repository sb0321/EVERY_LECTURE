<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>강의 등록 페이지</title>
<script src='<c:url value='/resources/js/admin/upload_lecture.js'/>'></script>
<link rel="stylesheet" href='<c:url value='/resources/css/admin/upload_lecture.css'/>'/>
</head>
<body>
	<div id="wrapper">
		<div id="title">
			<h3>관리자 페이지 - 동엽상 등록</h3>
			<br><hr>
		</div>
	
		<section id="lectureInfo">
			<div>강의 정보</div>
			<div>
				<form id="lectureUploadForm"  method="post" enctype="multipart/form-data">
					<input type="text" id="lectureName" name="lectureName">
					<textarea id="lectureExplain" name="lectureExplain" rows="10" cols="10"></textarea>
					<input type="file" id="lectureImg" name="lectureImg">
					<button id="submit" class="eBtn">제출하기</button>
				</form>
			</div>
		</section>
		<section id="lectureVideo">
			
		</section>
	
	</div>
</body>
</html>
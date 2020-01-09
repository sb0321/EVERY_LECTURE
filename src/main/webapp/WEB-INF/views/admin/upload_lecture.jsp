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
	<%@ include file="../index/index_top.jsp" %>
	<div id="wrapper">
		<div id="title">
			<h3>강의 등록 페이지 - 관리자</h3>
			<br><hr>
		</div>
		
		<section id="lectureInfo">
			<br>
			<div id="info_title">Lecture Information</div>
			<div id="content1">
				<form id="lectureUploadForm"  method="post" enctype="multipart/form-data">
					<table>
						<tr class="upload_table" id="tr1">
							<th>강의 제목</th>
							<th><input type="text" id="lectureName" name="lectureName"></th></tr>
						<tr class="upload_table" id="tr2">
							<th>강의 내용</th>
							<th><textarea id="lectureExplain" name="lectureExplain" rows="10" cols="10"></textarea></th>
						</tr>
						<tr class="upload_table" id="tr3">
							<th colspan="2"><input type="file" id="lectureImg" name="lectureImg"></th>
						</tr>
						<tr class="upload_table" id="tr4">
							<th colspan="2"><button id="submit" class="eBtn">제출하기</button></th>
						</tr>
					</table>
				</form>
				<br>
			</div>
		</section>
		
		<section id="lectureVideo">
			<br><hr>
			
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
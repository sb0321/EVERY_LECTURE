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
			<h3>관리자 페이지 - 동영상 등록</h3>
			<br><hr>
		</div>
	
		<section id="lectureInfo">
			<div id="info_title">-강의 정보 입력-</div>
			<div>
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
			</div>
		</section>
		<section id="lectureVideo">
			<br><hr><br><hr>
			
		</section>
	
		<footer>
			
		</footer>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board_Write</title>
<script src='<c:url value='/resources/js/board/boardWrite.js'/>'></script>
<link rel="stylesheet" href='<c:url value='/resources/css/board/boardWrite.css'/>'>
</head>
<body>
	<%@ include file="../index/index_top.jsp" %>
	<section>
		<div id="board_top">
			<img src="../resources/image/board.PNG" id="board_image">
		</div>
			
		<div id="write_area">
		<hr><br>
		<h3>게시글 작성</h3><br><br>
			<table id="write_table">
				<tr class="write_context" id="tr1">
					<th>작성자</th>
					<th><input type="text" name="bWriter" size="80" readonly="readonly" value="${uInfo.userID }"></th>
				</tr>
				<tr class="write_context" id="tr2">
					<th>제 목</th>
					<th><input type="text" name="bTitle" size="80"></th>
				</tr>
				<tr class="write_context">
					<th>내 용</th><th><textarea rows="15" cols="60" name="bContent"></textarea></th>
				</tr>
				<tr class="write_context">
					<th colspan="2">
						<button id="submit" class="eBtn">작 성</button>
						<button type="reset" class="eBtn" onclick="$('textarea[name=bContent]').val('')">재작성</button>
						<button id="goBoard" type="button" class="eBtn">게시판 보기</button>
					</th>
				</tr>
			</table>
		</div>
	</section>
</body>
</html>
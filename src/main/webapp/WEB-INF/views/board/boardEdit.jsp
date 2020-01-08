<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board edit</title>
	<link rel="stylesheet" href='<c:url value='/resources/css/board/boardEdit.css'/>'>
</head>
<body>
	<%@ include file="../index/index_top.jsp" %>
	<section>
		<div id="board_top">
			<img src="../resources/image/board.PNG" id="board_image">
		</div>
			
		<div id="edit_area">
		<hr><br>
		<h3>게시글 수정</h3><br><br>	
			<form method="post" action="">
				<input type="hidden" name="" value="update No">
				<input type="hidden" name="" value="update ReadCount">
				<input type="hidden" name="" value="update Writer">
				<input type="hidden" name="" value="update Date">
				
				<table id="edit_table">
					<tr class="edit_context" id="tr1">
						<th>번 호</th><th id="bNo"></th>
						<th>조회수</th><th></th>
					</tr>
					<tr class="edit_context" id="tr2">
						<th>작성자</th><th></th>
						<th>작성일</th><th></th>
					</tr>
					<tr class="edit_context" id="tr3">
						<th>제 목</th>
						<th colspan="3"><input type="text" name="bTitle" value="" size="81"></th>
					</tr>
					<tr class="edit_context" id="tr4">
						<th>내 용</th>
						<th colspan="3"><textarea rows="15" cols="61" name="bContent"></textarea></th>
					</tr>
					<tr class="edit_context" id="tr5">
						<th colspan="4" align="center">
							<input type="submit" value="수정 완료">
							<input type="button" onclick="" value="게시판 보기">
						</th>
					</tr>
				</table>
			</form>
		</div>
	</section>
</body>
</html>
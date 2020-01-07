<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board_Write</title>
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
			<form method="post" action="">
				<table id="write_table">
					<tr class="write_context" id="tr1">
						<th>작성자</th>
						<th><input type="text" name="bWriter" size="80"></th>
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
							<input type="submit" value="작 성">
							<input type="reset" value="재작성 ">
							<input type="button" value="게시판 보기 ">
						</th>
					</tr>
				</table>
			</form>
		</div>
	</section>
</body>
</html>
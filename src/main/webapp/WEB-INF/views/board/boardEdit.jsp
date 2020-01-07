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
						<th>작성자</th>
						<th><input type="text" name="bWriter" size="80"></th>
					</tr>
				</table>
			</form>
		</div>
	</section>
</body>
</html>
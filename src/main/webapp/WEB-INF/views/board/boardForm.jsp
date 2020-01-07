<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board_list</title>
	<link rel="stylesheet" href='<c:url value='/resources/css/board/board.css'/>'>
</head>
<body>
	<%@ include file="../index/index_top.jsp" %>
	<section>
		<div id="board_top">
			<img src="../resources/image/board.PNG" id="board_image">
		</div>
		
		<div id="board_list">
			<hr><br>
			<table id="board_table">
				<thead>
					<tr id="context"><th>번 호</th><th>제 목</th><th>작성자</th><th>작성일</th><th>조회수</th></tr>
				<thead>
				<tbody>
					
				</tbody>
			</table>
		</div>
	</section>
</body>
</html>
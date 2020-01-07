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
				<thead id="board_thead">
					<tr id="thead_context"><th>번 호</th><th>제 목</th><th>작 성 자</th><th>작 성 일</th><th>조 회 수</th></tr>
				<thead>
				<tbody id="board_tbody">
					<c:forEach items="">
						<tr id="tbody_context">
							<th></th>
							<th></th>
							<th></th>
							<th></th>
							<th></th>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		
		<div id="board_button">
			<hr><br>
			<button onclick="글쓰기 페이지가 나와야함">게시글 작성</button>
		</div>
	</section>
</body>
</html>
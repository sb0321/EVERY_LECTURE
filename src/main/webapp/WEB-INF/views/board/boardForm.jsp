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
<<<<<<< Upstream, based on origin/join
<<<<<<< Upstream, based on origin/join
				<thead id="board_thead">
<<<<<<< Upstream, based on origin/join
<<<<<<< Upstream, based on origin/join
					<tr id="thead_context"><th>번 호</th><th>제 목</th><th>작 성 자</th><th>작 성 일</th><th>조 회 수</th></tr>
				<thead>
				<tbody id="board_tbody">
<<<<<<< Upstream, based on origin/join
					<tr id="tbody_context"><td></tr>
=======
				<thead>
=======
				<thead id="board_thead">
>>>>>>> 1292af1 12
					<tr id="context"><th>번 호</th><th>제 목</th><th>작성자</th><th>작성일</th><th>조회수</th></tr>
					<tr><td>123123</td></tr>
					<tr><td>sdsdfsdf</td></tr>
=======
					<tr id="context"><th>번 호</th><th>제 목</th><th>작 성 자</th><th>작 성 일</th><th>조 회 수</th></tr>
>>>>>>> 277af2f 22
=======
					<tr id="thead_context"><th>번 호</th><th>제 목</th><th>작 성 자</th><th>작 성 일</th><th>조 회 수</th></tr>
>>>>>>> fcfd77e 1123123
				<thead>
<<<<<<< Upstream, based on origin/join
				<tbody>
<<<<<<< Upstream, based on origin/join
					
>>>>>>> 935b130 1532132
=======
					<tr><td>1234</td></tr>
>>>>>>> 277af2f 22
=======
				<tbody id="board_tbody">
					<tr id="tbody_context"><td></tr>
>>>>>>> fcfd77e 1123123
=======
					<c:forEach items="list" var="">
					<tr id="tbody_context">
						<th></th>
						<th></th>
						<th></th>
						<th></th>
						<th></th>
					</tr>
					</c:forEach>
>>>>>>> d2c60db n
				</tbody>
			</table>
		</div>
	</section>
</body>
</html>
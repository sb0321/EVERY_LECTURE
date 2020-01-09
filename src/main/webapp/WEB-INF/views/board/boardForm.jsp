<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board_list</title>
<script src='<c:url value='/resources/js/board/boardForm.js'/>'></script>
<link rel="stylesheet" href='<c:url value='/resources/css/board/boardForm.css'/>'>
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
					<c:forEach items="${boardList }" var="board">
							<tr class="tbody_context">
								<th>${board.boardID}</th>
								<th><a href='<c:url value='/board/boardView/${board.boardID}' />'>${board.boardName}</a></th>
								<th>${board.userID}</th>
								<th>${board.boardTime}</th>
								<th>${board.showed}</th>
							</tr>
					</c:forEach>
					<tr>
						<c:if test="${curpage eq 1}">
							<td><button class="eBtn">prev</button></td>
						</c:if>
						<!-- pagination -->
						<c:forEach begin="1" end="${(totalBoardCount / 10) + (1 - (totalBoardCount / 10) % 1) % 1}" var="page">
							<td><button class="eBtn" onclick="goPagination(${page})"><c:out value="${page}"/></button></td>
						</c:forEach>
						<c:if test="${curpage eq 1}">
							<td><button class="eBtn">prev</button></td>
						</c:if>
					</tr>
				</tbody>
			</table>
		</div>
		
		<div id="board_button">
			<hr><br>
			<a href='<c:url value='/board/boardWrite' />'><button class="eBtn">게시글 작성</button></a>
		</div>
	</section>
</body>
</html>
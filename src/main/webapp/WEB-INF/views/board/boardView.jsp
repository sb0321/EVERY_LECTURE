<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board view</title>
	<link rel="stylesheet" href='<c:url value='/resources/css/board/boardView.css'/>'>
</head>
<body>
	<%@ include file="../index/index_top.jsp" %>
	<section>
		<div id="board_top">
			<img src='<c:url value='/resources/image/board.PNG' />' id="board_image">
		</div>
		<div id="view_area">
			<hr><br>
			<h3>게시글 보기</h3><br><br>
			<div id="view_content">	
				<table id="view_table">
					<tr class="view_context" id="tr1">
						<th>번 호</th><th>${board.boardID}</th>
					</tr>
					<tr class="view_context" id="tr2">
						<th>조회수</th><th>${board.showed}</th>
					</tr>
					<tr class="view_context" id="tr3">
						<th>작성자</th><th>${board.userID}</th>
					</tr>
					<tr class="view_context" id="tr4">
						<th>제 목</th><th>${board.boardName}</th>
					</tr>
					<tr class="view_context" id="tr5">
						<th>내 용</th>
						<th><textarea rows="15" cols="63" name="" readonly="readonly">${board.boardText}</textarea></th>
					</tr>
					<tr class="view_context" id="tr6">
						<th colspan="2" align="center">
							<button type="button" class="eBtn" value="수 정">수 정</button>
							<button type="button" class="eBtn" value="삭 제">삭 제</button>
							<button type="button" class="eBtn" value="게시판 보기">게시판 보기</button>
						</th>
					</tr>
				</table>
			</div>	
		</div>
		<div id="comment_wrapper">
<%-- 			<c:forEach items="" var="com"> --%>
				<div class="comment_box">
					<div class="com_left">
						<div>
							dssdsdsd
						</div>
					</div>
					<div class="com_right">
						<div>
							dssdsdsd
						</div>
					</div>
				</div>
<%-- 			</c:forEach> --%>
		</div>
	</section>
</body>
</html>
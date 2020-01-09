<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board view</title>
<script src='<c:url value='/resources/js/board/boardView.js'/>'></script>
<link rel="stylesheet" href='<c:url value='/resources/css/board/boardView.css'/>'>
</head>
<body>
	<%@ include file="../index/index_top.jsp" %>
	<div id="wrapper">
		<div id="board_top">
			<img src='<c:url value='/resources/image/board.PNG' />' id="board_image">
		</div>
		<div id="view_area">
		<br>
			<h3>게시글 보기</h3><br><br>
			<input type="hidden" name="boardID" value="${board.boardID}">
			<div id="view_content">	
				<table id="view_table">
					<tr class="view_context" id="tr1">
						<th>번 호</th><th><div id="boardID">${board.boardID}</div></th>
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
						<th><textarea rows="15" cols="63" name="boardText" readonly="readonly">${board.boardText}</textarea></th>
					</tr>
					<tr class="view_context" id="tr6">
						<th colspan="2" align="center">
							<c:if test="${board.userID eq uInfo.userID}">
								<a href='<c:url value='/board/boardRevise/${board.boardID}'/>'><button id="revise" type="button" class="eBtn">수 정</button></a>
								<button id="delete" type="button" class="eBtn">삭 제</button>
							</c:if>
							<a href='<c:url value='/board/boardForm' />'><button id="boardForm" type="button" class="eBtn">게시판 보기</button></a>
						</th>
					</tr>
				</table>
			</div>	
		</div>
		
		<div id="content2">
			<br><br><br>
			<div id="content2-1">
			<c:if test="${not empty uInfo }">
				<div id="com_com">
					<div id="commentWrite">
						<textarea name="commentText" onkeydown="resize(this)" onkeyup="resize(this)" id="commentBox" rows="3" cols="10"></textarea>
						<div id="buttonWrapper">
							<button class="eBtn" id="comSubmit">댓글 달기</button>
						</div>
					</div>
				</div>
			</c:if>
			<c:if test="${empty uInfo }">
				<h2 id="none">댓글을 적으려면 로그인 하세요.</h2>
			</c:if>
			<c:forEach items="${commentList}" var="comm" varStatus="status">
				<div class="comment_box">
					<div class="com_left">
						<div class="left_wrapper">
							<div>
								${comm.userID }
							</div>
							<div>
								${comm.comTime }
							</div>
						</div>
					</div>
					<div class="com_right">
						<h2 class="comText">
							${comm.comText }
						</h2>
						<c:if test="${uInfo.userID eq comm.userID }">
							<div class="deleteBtnWrapper">
								<button id="delBtn" class="eBtn" onclick="delComment(${comm.comID})">삭제</button>
							</div>
						</c:if>
					</div>
				</div>
			</c:forEach>
			</div>
		</div>
	
		<div id="footer">
			
			<div id="last">
				<div id="last_left">
					<h2>The flat icon belongs to www.flaticon.com</h2>
					<br>
					<h2>This site is made by Golden Brothers.Inc</h2>
				</div>
				<div id="last_right">
				</div>
			</div>
		</div>
	
	</div>
</body>
</html>
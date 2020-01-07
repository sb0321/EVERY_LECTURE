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
			<img src="../resources/image/board.PNG" id="board_image">
		</div>
		
<<<<<<< Upstream, based on origin/jm
		<div id="view_area">
			<hr><br>
			<h3>게시글 보기</h3><br><br>
			<div id="view_content">	
				<table id="view_table">
					<tr class="view_context" id="tr1">
						<th>번 호</th><th></th>
					</tr>
					<tr class="view_context" id="tr2">
						<th>조회수</th><th></th>
					</tr>
					<tr class="view_context" id="tr3">
						<th>작성자</th><th></th>
					</tr>
					<tr class="view_context" id="tr4">
						<th>제 목</th><th></th>
					</tr>
					<tr class="view_context" id="tr5">
						<th>내 용</th>
						<th><textarea rows="15" cols="63" name="" readonly="readonly"></textarea></th>
					</tr>
					<tr class="view_context" id="tr6">
						<th colspan="2" align="center">
							<input type="button" value="수정 완료" onclick="">
							<input type="button" value="삭 제" onclick="">
							<input type="button" value="게시판 보기" onclick="">
						</th>
					</tr>
				</table>
			</div>	
		</div>
		

		<div>
			
		</div>

	</section>
</body>
</html>
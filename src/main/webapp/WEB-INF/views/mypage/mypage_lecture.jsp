<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<link rel="stylesheet" href='<c:url value='/resources/css/mypage/mypage.css'/>'>
<div id="right_wrapper">
	<div id="context">강의 목록</div>
	<div id="content_wrapper">
		<div id="lect_mid">
			<div class="lect_title">	
				<div><input type="checkbox"></div>
				<div>이미지</div>
				<div>강의 제목</div>
				<div>진행도</div>		
			</div>
			
			<div>
				<c:forEach items="" var="prd">
					<tr>
						<th><input type="checkbox"></th>
						<th></th>
						<th></th>
						<th></th>
					</tr>
				</c:forEach>
			</div>
		
			<!-- 
			<table class="lect_table">
				<colgroup>
					<col width="30">
					<col width="50">
					<col width="560">
					<col width="90">
				</colgroup>
				
				<thead>
					
					<tr>
						<th scope="col">
							<input type="checkbox">
						</th>
						<th scope="col">image</th>
						<th scope="col">강의 제목</th>
						<th scope="col">진행도</th>
					</tr>
				</thead>
				<tbody id="lect_tbody">
					<c:forEach items="" var="prd">
						<tr>
							<th><input type="checkbox"></th>
							<th></th>
							<th></th>
							<th></th>
						</tr>
					</c:forEach>
				</tbody>
			</table> -->
		</div>
	</div>
</div>

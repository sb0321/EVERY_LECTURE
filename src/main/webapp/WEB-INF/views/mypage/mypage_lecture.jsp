<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<link rel="stylesheet" href='<c:url value='/resources/css/mypage/mypage.css'/>'>
<div id="right_wrapper">
	<div id="context">강의 목록</div>
	<div id="content_wrapper">
		<div id="lect_mid">
			<div id="content1">
				<table id="title_table">
					<tr id="tr"><td>사진</td><td>강의 제목</td><td>강의 보러가기</td></tr>
				</table>
				
				<c:forEach items="${registered}" var="registered">
					<div id="my_lecture">
						<img id="image" alt="강의 이미지" src="${registered.lectureImgPath}">
						<div id="lec_title">${registered.lectureName}</div>
					</div>	
					<div id="div_button">
						<div id="4">
							<button id="but1" class="eBtn">Go</button>
							<button id="but2" class="eBtn" onclick="deleteLecture(${registered.lectureID})">삭 제</button>
						</div>
					</div>	
				</c:forEach>
				
			</div>
		</div>
	</div>
</div>

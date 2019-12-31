<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EVERY-LECTURE</title>
<jsp:include page="index/index_top.jsp"/>
</head>
<body>
	<table>
		<tr>
			<td>ID</td>
			<td>이름</td>
		</tr>
		<tr>
			<td>${list.id }</td>
			<td>${list.name }</td>
		</tr>
	</table>
	
	<a href='<c:url value="/test/test"/>'>테스트 페이지</a>
</body>
</html>
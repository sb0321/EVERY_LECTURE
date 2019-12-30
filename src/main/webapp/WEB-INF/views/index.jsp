<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EVERY-LECTURE</title>
<script src="./resources/js/jquery-3.4.1.js"></script>
</head>
<body>
	EVERY-LECTURE index 페이지
	
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
</body>
</html>
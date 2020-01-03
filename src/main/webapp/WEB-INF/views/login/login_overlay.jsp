<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<body>
	<section id="overlay_window">
		<div id="window_context">
			<form id="loginForm" method="post" action="<%= context %>/login/userLoginCheck">
				<input id="userID" name="userID" class="eInput" type="text" placeholder="ID">
				<br>
				<br>
				<input id="userPW" name="userPW" class="eInput" type="password" placeholder="Password">
				<br>
				<br>
				<input id="loginSubmit" class="eBtn" type="submit" value="Login">
			</form>
		</div>
	</section>
</body>
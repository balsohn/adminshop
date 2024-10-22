<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	section {
		width:400px;
		margin:50px auto;
		
	}
	
	form input {width:100%; height: 30px; margin:5px;}
</style>
</head>
<body>
	<section>
		<form method="post" action="loginOk">
			<div><input type="text" name="userid" placeholder="아이디" oninput="useridChk(this)"></div>
			<div><input type="password" name="pwd" placeholder="비밀번호"></div>
			<div><input type="submit" value="로그인"></div>
		</form>
	</section>
</body>
</html>
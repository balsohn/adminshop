<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="loginOk">
		<div><input type="text" name="userid" placeholder="아이디"></div>
		<div><input type="password" name="pwd" placeholder="비밀번호"></div>
		<div><input type="submit" value="로그인"></div>
		<div style="color:red;">${param.err==1?"정보가 일치하지 않습니다.":""}</div>
	</form>
</body>
</html>
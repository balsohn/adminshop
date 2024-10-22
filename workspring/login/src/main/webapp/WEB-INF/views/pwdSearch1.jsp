<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="pwdchg">
	<input type="hidden" name="userid" value="${userid}">
	<input type="password" name="pwd" placeholder="비밀번호">
	<input type="passwrod" name="pwd2" placeholder="비밀번호 확인">
	<input type="submit" value="변경하기">
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="pwdSear">
		<div> <input type="text" name="userid" placeholder="아이디"> </div>
		<div> <input type="text" name="name" placeholder="이름"></div>
		<div> <input type="text" name="phone" placeholder="핸드폰 번호"> </div>
		<div> <input type="submit" value="비밀번호 찾기"></div>
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>글 작성하기</h2>
	<form method="post" action="WriteOk">
	<div><input type="text" name="title" placeholder="제목"></div>
	<div><input type="text" name="name" placeholder="이름"> <input type="password" name="pwd" placeholder="비밀번호"></div>
	
	<div>내용 <textarea name="content"></textarea></div>
	<div> <input type="submit" value="글 작성"></div>
	</form>
</body>
</html>
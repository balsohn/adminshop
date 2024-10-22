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
	<form method="post" action="writeOk.jsp">
	<div><input type="text" name="title" placeholder="제목"></div>
	<div><input type="text" name="name" placeholder="이름"> <input type="password" name="pwd" placeholder="비밀번호"></div>
	<div>게시판 종류
		<select name="type">
			<option value="0">자유게시판</option>
			<option value="1">질답게시판</option>
			<option value="100">공지사항</option>
		</select>
	</div>
	<div>내용 <textarea name="content"></textarea></div>
	<div> <input type="submit" value="글 작성"></div>
	</form>
</body>
</html>
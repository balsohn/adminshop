<%@page import="practice.Board"%>
<%@page import="practice.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	Board bd=new Board();
	bd.update(request);
%>
<script>
	window.onload=function()
	{
		document.getElementById("type").value=${bdto.type};
	}
</script>
</head>
<body>
	<form method="post" action="updateOk.jsp">
	<input type="hidden" name="id" value="${bdto.id}">
	<div> 제목 <input type="text" name="title" value="${bdto.title }"></div>
	<div> 작성자 <input type="text" name="name" value="${bdto.name }"></div>
	<div>게시판 종류
		<select name="type" id="type">
			<option value="0">자유게시판</option>
			<option value="1">질답게시판</option>
			<option value="2">몰라</option>
			<option value="100">공지사항</option>
		</select>
	</div>
	<div> 내용 <textarea name="content">${bdto.content }</textarea></div>
	<hr>
	<div>
		<input type="submit" value="수정">
		<a href="list.jsp"> 목록 </a>
	</div>
	</form>
</body>
</html>
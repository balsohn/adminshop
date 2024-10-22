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
	<form method="post" action="UpdateOk">
	<input type="hidden" name="id" value="${bdto.id}">
	<div> 제목 <input type="text" name="title" value="${bdto.title }"></div>
	<div> 작성자 <input type="text" name="name" value="${bdto.name }"></div>
	<div> 비밀번호 <input type="password" name="pwd"></div>
	<div> 내용 <textarea name="content">${bdto.content }</textarea></div>
	<hr>
	<div>
		<input type="submit" value="수정">
		<a href="List"> 목록 </a>
	</div>
	<c:if test="${param.err==1}"><div style="color:red;">비밀번호가 일치하지 않습니다.</div></c:if>
	</form>
</body>
</html>
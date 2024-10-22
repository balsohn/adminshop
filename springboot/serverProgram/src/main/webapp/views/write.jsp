<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	section {
		width: 800px;
		margin: auto;
	}
	
	form input {
		width: 100%;
		height: 30px;
		margin: 10px;
	}
	
	form textarea {
		width: 100%;
		height: 400px;
		resize: vertical;
		margin: 10px;
	}
</style>
</head>
<body>
	<section>
		<form method="post" action="writeOk" enctype="multipart/form-data">
			<div><input type="text" name="title" placeholder="제목"></div>
			<div>
				<c:if test="${empty userid}">
				<input type="text" name="name" placeholder="작성자">
				</c:if>
				<c:if test="${!empty userid}">
				<input type="text" name="name" value="${userid}" readonly>
				</c:if>
			</div>
			<div><textarea name="content"></textarea></div>
			<div><input type="file" name="file"></div>
			<div><input type="submit" value="글쓰기"></div>
		</form>
	</section>
</body>
</html>
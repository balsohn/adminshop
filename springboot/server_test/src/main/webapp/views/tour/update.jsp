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
		width:400px;
		margin:auto;
		text-align: center;
	}
	section input {
		width:100%;
		margin-top:20px;
	}
	
	section textarea {
		width:100%;
		resize:vertical;
		height: 300px;
		margin-top:10px;
	}
</style>
</head>
<body>
	<section>
		<form method="post" action="updateOk" enctype="multipart/form-data">
			<input type="hidden" name="id" value="${tdto.id }">
			<div><input type="text" name="title" value="${tdto.title }"></div>
			<div>내용</div>
			<div><textarea name="content">${tdto.content }</textarea></div>
			<c:if test="${!empty tdto.fname }">
			<div>
				<img src="/uploads/${tdto.fname }" width="200" height="200">
				<input type="checkbox" name="chked" value="${tdto.fname }">
			</div>
			</c:if>
			<div><input type="file" name="file"> </div>
			<div>
				<input type="submit" value="수정하기">
			</div>
		</form>
	</section>
</body>
</html>
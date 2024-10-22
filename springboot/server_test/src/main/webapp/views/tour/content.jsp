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
			<div>제목 : ${tdto.title }</div>
			<div>내용</div>
			<div>${tdto.content }</div>
			<c:if test="${!empty tdto.fname }">
			<div><img src="/uploads/${tdto.fname }" width="200" height="200"></div>
			</c:if>
			<div>
				<a href="delete?id=${tdto.id}">삭제</a>
				<a href="update?id=${tdto.id}">수정</a>
			</div>
	</section>
</body>
</html>
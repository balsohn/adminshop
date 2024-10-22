<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	textarea {
		width: 600px;
		height: 500px;
		resize: vertical;
	}
</style>
</head>
<body>
	<form method="post" action="updateOk" enctype="multipart/form-data">
	<input type="hidden" name="id" value="${bdto.id}">
	<table>
		<tr>
			<td>제목</td>
			<td><input type="text" name="title" value="${bdto.title}"></td>
		</tr>
		<tr>
			<td>작성자</td>
			<td>${bdto.name}</td>
		</tr>
		<tr>	
			<td colspan="2">내용</td>
		</tr>
		<tr>
			<td colspan="2">
				<textarea name="content">${bdto.content}</textarea>
			</td>
		</tr>
		<tr>	
			<td colspan="2" align="center">
				<c:if test="${!empty bdto.fname}">
				<img src="/uploads/${bdto.fname}">
				</c:if>
				<input type="file" name="file">
			</td>
		</tr>
		<tr>	
			<td colspan="2" align="center">
				<a href="index">목록</a>
				<input type="submit" value="수정">
			</td>
		</tr>
	</table>
	</form>
</body>
</html>
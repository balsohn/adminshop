<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>제목</td>
			<td>${bdto.title}</td>
			<td>조회수</td>
			<td>${bdto.readnum}</td>
		</tr>
		<tr>
			<td>작성자</td>
			<td colspan="3">${bdto.name}</td>
		</tr>
		<tr>	
			<td colspan="4">내용</td>
		</tr>
		<tr>
			<td colspan="4">${bdto.content}</td>
		</tr>
		<tr>	
			<td colspan="4">
				<a href="delete?id=${bdto.id}">삭제</a>
				<a href="update?id=${bdto.id}">수정</a>
			</td>
		</tr>
		<tr>	
			<td>
				<img src="/uploads/${bdto.fname}">
			</td>
		</tr>
	</table>
</body>
</html>
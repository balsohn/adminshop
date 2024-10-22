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
			<td>${mdto.title}</td>
		</tr>
		<tr>
			<td>작성자</td>
			<td>${mdto.name }</td>
		</tr>
		<tr>
			<td>내용</td>
			<td>${mdto.content }</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
			<a href="delete?id=${mdto.id}"> 삭제 </a>
			<a href="update?id=${mdto.id}">수정</a>
			</td>
		</tr>
	</table>
</body>
</html>
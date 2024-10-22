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
		<form method="post" action="updateOk">
		<input type="hidden" name="id" value="${bdto.id }">
		<h2>${bdto.title}</h2>
		<tr>
			<td>작성자</td>
			<td><input type="text" name="name" value="${bdto.name}"></td>
		</tr>
		<tr>
			<td>내용</td>
			<td><textarea name="content">${bdto.content }</textarea></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="수정">
				<a href="list?id=${bdto.id }">목록</a>
			</td>
		</tr>
		</form>
	</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="updateOk">
	<input type="hidden" name="page" value="${param.page}">
	<input type="hidden" name="pageSize" value="${param.pageSize}">
	<input type="hidden" name="id" value="${bdto.id}">
	
	<table>
		<tr>
			<td>제목</td>
			<td><input type="text" name="title" value="${bdto.title}"></td>
		</tr>
		<tr>
			<td>작성자</td>
			<td><input type="text" name="name" value="${bdto.name}"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="pwd"> </td>
		</tr>
		<tr>
			<td>내용</td>
			<td><input type="text" name="content" value="${bdto.content}"></td>
		</tr>
		<tr>
			<td>
				<input type="submit" value="글 수정">
				<a href="list?page=${page}&pageSize=${pageSize}">목록</a>
			</td>
		</tr>
	</table>
	</form>
</body>
</html>
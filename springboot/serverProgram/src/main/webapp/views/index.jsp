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
	<c:if test="${empty userid}">
	<div><a href="login">로그인</a></div>
	</c:if>
	<c:if test="${!empty userid}">
	<div>어서오세요 ${userid}님</div>
	<div><a href="logout">로그아웃</a></div>
	</c:if>
	
	<table>
		<tr>
			<th>작성자</th>
			<th>제목 </th>
			<th>조회수 </th>
			<th>작성일</th>
		</tr>
		<c:forEach var="list" items="${list}">
		<tr>
			<td>${list.name}</td>
			<td><a href="readnum?id=${list.id}">${list.title}</a></td>
			<td>${list.readnum}</td>
			<td>${list.writeday}</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="4" align="right"><a href="write">글쓰기</a></td>
		</tr>
	</table>
</body>
</html>
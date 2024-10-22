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
	<table>
		<tr>
			<td>글번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>조회수</td>
			<td>작성일</td>
		</tr>
		<c:forEach var="list" items="${list}">
		<tr>
			<td>${list.id}</td>
			<td>${list.title }</td>
			<td>${list.name }</td>
			<td>${list.readnum }</td>
			<td>${list.writeday }</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>
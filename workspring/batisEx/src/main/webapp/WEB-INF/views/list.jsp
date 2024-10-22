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
		<h2>게시물</h2>
		<tr>
			<td>글번호</td>
			<td>제목</td>
			<td>조회수</td>
			<td>작성자</td>
			<td>작성일</td>
		</tr>
		<c:forEach var="list" items="${list}">
			<tr>
				<td>${list.id}</td>
				<td><a href="readnum?id=${list.id}">${list.title }</a></td>
				<td>${list.readnum}</td>
				<td>${list.name }</td>
				<td>${list.writeday }</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="5" align="center">
			<c:if test="${pstart!=1}">
			<a href="list?page=1">처음 </a>
			<a href="list?page=${pstart-1}">이전 </a>
			</c:if>
			<c:forEach var="i" begin="${pstart}" end="${pend}">
			<a href="list?page=${i}">${i}</a>
			</c:forEach>
			<c:if test="${chong!=pend}">
			<a href="list?page=${pend+1}"> 다음</a>
			<a href="list?page=${chong}"> 마지막 </a>
			</c:if>
			</td>
		</tr>
	</table>
</body>
</html>
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
	<c:if test="${not empty userid}"> <div> ${name} <a href="Logout">로그아웃</a></div> </c:if>
	<c:if test="${empty userid}"><div> <a href="Login">로그인</a></div></c:if>
	<h2>게시판</h2>
	<table>
		<tr>
			<td>항목</td>
			<td>제목</td>
			<td>작성자</td>
			<td>조회수</td>
			<td>작성일</td>
		</tr>
		<c:forEach var="list" items="${list}">
		<tr>
			<td><a href="Content?id=${list.id}">${list.title }</a></td>
			<td>${list.name }</td>
			<td>${list.readnum}</td>
			<td>${list.writeday }</td>
		</tr>
		</c:forEach>
		<tr>
			<td> <a href="Write">글쓰기</a> </td>
		</tr>
		<%-- <c:if test="${pstart!=1}"><a href="list.jsp?page=1">처음</a></c:if>
		<c:if test="${pstart!=1}"><a href="list.jsp?page=${pstart-1}">이전</a></c:if>
		<c:forEach var="i" begin="${pstart}" end="${pend}">
			<a href="list.jsp?page=${i}"> ${i}</a>
		</c:forEach>
		<c:if test="${chong!=pend}"><a href="list.jsp?page=${pend+1}">다음</a></c:if>
		<c:if test="${chong!=pend}"><a href="list.jsp?page=${chong}">마지막</a></c:if> --%>
	</table>
</body>
</html>
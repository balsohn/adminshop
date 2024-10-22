<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<section>
		<table>
			<tr>
				<td>글번호</td>
				<td>제목</td>
				<td>작성자</td>
				<td>조회수</td>
				<td>작성일</td>
			</tr>
			<c:forEach var="tlist" items="${tlist}">
			<tr>
				<td>${tlist.id}</td>
				<td><a href="content?id=${tlist.id}">${tlist.title }</a></td>
				<td>${tlist.name }</td>
				<td>${tlist.readnum }</td>
				<td>${tlist.writeday }</td>
			</tr>
			</c:forEach> 
		</table>
	</section>
</body>
</html>
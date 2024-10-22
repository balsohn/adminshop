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
			<td>제목</td>
		</tr>
		<c:forEach var="tdto" items="${tlist }">
		<tr>
			<td><a href="content?id=${tdto.id}">${tdto.title}</a></td>
		</tr>
		</c:forEach>
		<tr>
			<td>
			<c:if test="${pstart!=1 }">
			<a href="list?page=1">처음</a>
			<a href="list?page=${pstart-1}">이전</a>
			</c:if>
			<c:forEach var="i" begin="${pstart }" end="${pend }">
			<a href="list?page=${i }">${i }</a>
			</c:forEach>
			<c:if test="${pend!=chong }">
			<a href="list?page=${pend+1 }">다음</a>
			<a href="list?page=${chong}">마지막</a>
			</c:if>
			</td>
		</tr>
	</table>
</body>
</html>
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
<%
	int num=(int)(Math.random()*100);
	request.setAttribute("num", num);
%>
	<c:if test="${num%2==0}">
		<p> ${num} 짝수입니다 </p>
	</c:if>
	<c:if test="${num%2!=0 }">
	<p> ${num} 홀수입니다 </p>
	</c:if>
	<hr>
	<c:choose>
		<c:when test="${num%2==0}">
		<p> ${num} 짝수입니다 </p>
		</c:when>
		<c:otherwise>
		<p> ${num} 홀수입니다</p>
		</c:otherwise>
	</c:choose>
</body>
</html>
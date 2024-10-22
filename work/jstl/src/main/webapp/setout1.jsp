<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> <!-- setout1.jsp -->
<%
	int a=11;
	request.setAttribute("a", a);
%>
<!-- 
	set: 변수 만들기(request)
	out: 출력하기
 -->
	<c:set var="a" value="5"/>
	${a} ${requestScope.a}
</body>
</html>
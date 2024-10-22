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
	String[] names={"홍길동","배트맨","슈퍼맨","원더우먼","뽀로로","헐크"};
	request.setAttribute("names", names);
%>
	<c:forEach var="i" begin="0" end="5" step="2" varStatus="vs">
		${names[i]} : ${vs.index} : ${vs.count} : ${vs.first} : ${vs.last}
	</c:forEach><p>
	<c:forEach var="name" items="${names }">
		${name}
	</c:forEach>
</body>
</html>
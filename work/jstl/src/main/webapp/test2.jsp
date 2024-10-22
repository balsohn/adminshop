<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> <!-- test2.jsp -->
<%@page import="jstl.Test" %>
<%
	// java코드는 Test.java
	// jsp문서는 뷰 담당 (브라우저에 전달되는 내용)
	
	Test test=new Test();
	test.calc(request);
%>
${avg }
</body>
</html>
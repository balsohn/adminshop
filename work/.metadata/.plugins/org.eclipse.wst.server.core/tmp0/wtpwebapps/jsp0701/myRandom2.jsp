<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@page import="jsp0701.*" %>
<%
	MyRandom mr=new MyRandom();
	
	mr.initRandom();
	String h=mr.getRandom();
	
	out.print(h);
%>
</body>
</html>
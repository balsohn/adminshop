<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="board.MyTest" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body><!-- testJsp.jsp -->
<%
	//jsp 내에 자바코드 + 뷰코드가 존재
	
	MyTest mt=new MyTest();
	mt.getName(request);
	String a=(String)request.getAttribute("a");
	
	mt.getNum(request);
	int b=(int)request.getAttribute("b");
	int c=(int)request.getAttribute("c");
%>
오늘의 선택 : <%=a %>    <%=b %> <%=c %>
</body>
</html>
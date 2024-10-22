<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@page import="board.*" %>
<%
	MyTest mt=new MyTest();
	mt.getMember3(request);
	
	MemberDto member=(MemberDto)request.getAttribute("mdto");
//	MemberDto member=mt.getMember(request);
%>
이름 : <%=member.getName()%>
나이 : <%=member.getAge() %>
키 : <%=member.getHeight() %>
이메일 : <%=member.getEmail() %>
</body>
</html>
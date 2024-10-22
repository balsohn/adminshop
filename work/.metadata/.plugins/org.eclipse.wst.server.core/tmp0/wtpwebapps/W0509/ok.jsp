<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
여기는 ok.jsp 입니다.<p>

<%

	request.setCharacterEncoding("utf-8");

	String userid=request.getParameter("userid");
	String pwd=request.getParameter("pwd");
	String sogae=request.getParameter("sogae");

	out.print(userid+"<p>");
	out.print(pwd+"<p>");
	out.print(sogae+"<p>");

%>
</body>
</html>
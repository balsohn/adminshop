<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	<!-- sungjuk.jsp -->
<%@page import="jsp0701.*" %>
<%
	int kor=99;
	int eng=77;
	int mat=88;
	
	MyTest mt=new MyTest();
	
	mt.input(kor,eng,mat);
	mt.cal();
	
	int hap=mt.getHap();
	int avg=mt.getAvg();
%>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="jsp0701.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> <!-- test.jsp -->
<%
	MyTest mt=new MyTest();

	String kors=request.getParameter("kor");
	String engs=request.getParameter("eng");
	String mats=request.getParameter("eng");
	
	if(kors!=null || engs!=null || mats!=null)
	{
		int kor=Integer.parseInt(kors);
		int eng=Integer.parseInt(engs);
		int mat=Integer.parseInt(mats);
		
		mt.input(kor, eng, mat);
		mt.cal();
	}
	
	
%>
<form method="post" action="test.jsp">
	<div> <input type="text" name="kor"></div>
	<div> <input type="text" name="eng"></div>
	<div> <input type="text" name="mat"></div>
	<input type="submit" value="gggggg">
	
	<div><%=mt.getAvg() %></div>
	<div><%=mt.getHap() %></div>
</form>
</body>
</html>
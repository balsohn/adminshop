<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body><!-- selector.jsp -->
<%
	request.setCharacterEncoding("utf-8"); //한글용
	
	String[] names=new String[4];
	
	names[0]=request.getParameter("name1");
	names[1]=request.getParameter("name2");
	names[2]=request.getParameter("name3");
	names[3]=request.getParameter("name4");

	//0부터 3까지의 임의의 값
	int n=(int)(Math.random()*4);
	
	out.print("오늘의 당첨자는 " + names[n]);
	disis
%>


</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int[] lotto=new int[6];

	for(int i=0;i<lotto.length;i++)
	{
		lotto[i]=(int)(Math.random()*45)+1;
	}
	
	// 6개의 번호를 문자열로 만들기
	String bunho="";
	for(int i=0;i<lotto.length;i++)
	{
		bunho+=lotto[i]+" ";
	}
	
	out.print(bunho);
%>
</body>
</html>
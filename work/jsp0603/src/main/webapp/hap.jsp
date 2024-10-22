<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#aa 
	{
		color:red;
		font-style:italic;
		font-weight:100;
		text-decoration:underline;
	}
	#bb
	{
		color:blue;
		font-style:oblique
		font-weight:lighter;
	}

</style>

</head>
<body><!-- hap.jsp -->

<!-- 
	1부터 100까지의 합을 출력
 -->

 <%
 	int hap=0;
 	for(int i=1; i<=100; i++)
 	{
 		hap=hap+i;	
 	}
 		out.print("<span id='aa' 합계 :>"+hap+"</span>"+"<p>"); 
 %>
 
 <hr>
 <%
 	int ran=(int)(Math.random()*45)+1;
 	out.print("<span id='bb' 합계 :>"+ran+"</span>"+"<p>");
 %>
 <hr>
 <% 
 	int ran2=(int)(Math.random()*45)+1;
 	for(int i=1; i<ran2; i++)
 	{
 		hap=hap+i;
 	}
 		out.print("합계 :"+hap); 
 %>

</body>
</html>
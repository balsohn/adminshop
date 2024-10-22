<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
	자바코드로 실행할때 필요한 값은 웹에서는 무조건 form태그 (form2)
 -->

 	<!-- a부터 b까지의 합을 출력 -->
 	<!-- c에서 d까지의 임의의 값 구하기 -->
 <%
 	//request객체 :클라이언트에서 값을 가져올때 사용하는 객체
 	//String -> 숫자로 변환 
 	
 	int a=Integer.parseInt(request.getParameter("a"));
	int b=Integer.parseInt(request.getParameter("b"));
	int c=Integer.parseInt(request.getParameter("c"));
	int d=Integer.parseInt(request.getParameter("d"));

	int hap=0;
	
	for (int i=a; i<b; i++)
	{
		hap=hap+i;
	}
	out.print("a부터 b까지의 합: "+ hap);
%>
 <hr>
<% 	
	int ran=(int)(Math.random()*(d-c+1)+c);
	out.print(ran);
 %> 
 

   


 

</body>
</html>
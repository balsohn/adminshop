<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> <!-- el2.jsp -->
<%
	request.setAttribute("num1", 99);
	request.setAttribute("num2", 88);
	
%>
첫번째 : ${num1} 두번째 : ${num2} <p>
${num1+num2} <p>
${num1-num2} <p>
${num1*num2} <p>
${num1/num2} <p>
${num1%num2} <p>
<hr>
${num1>num2} <p>
${num1<num2} <p>
${num1==num2} <p>
${num1!=num2} <p>
${num1>=num2} <p>
<hr>
${true and true} <p>
${true && true} <p>
${true or false} <p>
${true || false} <p>
<hr>
<%
	request.setAttribute("num4", "");
%>
${empty num3} <p>
${num3==null} <p>
${empty num4} <p>
${num4==null} 
<hr>
${num1>num2 ? 

</body>
</html>
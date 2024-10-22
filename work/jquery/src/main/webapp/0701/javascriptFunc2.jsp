<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <script>
   window.onload=function()
   {
	   alert();
	   
	   document.getElementById("ex1").onclick=function()
	   {
		   document.getElementById("ex1").style.fontSize="30px";
		   document.getElementById("ex1").style.color="red";
	   };
	   
	   document.getElementById("btn").onclick=function()
	   {
		   document.getElementById("ex2").type="password";
	   };
	   
	   document.getElementById("ex3").onclick=function()
	   {
		   document.getElementById("ex3").src="a3.jpg";
	   };
   }
 </script>
</head>
<body> <!-- javascriptFunc2.jsp -->
  <span id="ex1">안녕하세요</span> <p>
  <input type="text" id="ex2"> <input type="button" id="btn" value="변경"> <p>
  <img src="a1.jpg" width="100" id="ex3">
</body>
</html>







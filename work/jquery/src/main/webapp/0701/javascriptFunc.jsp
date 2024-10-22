<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <script>
    function test()
    {
    	alert("호출");
    }
    
    // 이벤트=함수명; // 이름을 가진 함수, 이름이 없는 함수
    window.onload=function()
    {
    	document.getElementById("btn").onclick=test; // 존재하는 함수를 호출
    	
    	document.getElementById("btn2").onclick=function()
    	{
    		alert("호출2");
    	}; // 익명함수
    }
    
  </script>
</head>
<body> <!-- javascriptFunc.jsp -->
  <!-- 태그내에서 이벤트핸들러=함수명() -->
  <input type="button" value="함수호출1" onclick="test()"> 
  
  <hr>
  
  <input type="button" value="함수호출2" id="btn"> 
  <input type="button" value="함수호출3" id="btn2">
</body>
</html>





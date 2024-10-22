<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <script src="https://code.jquery.com/jquery-latest.js"></script>
  <script>
    $(function()
    {
        // attr()
        $("#pwd").attr("type","password");
        $("#myImg").attr("src","a3.jpg");
        
        $("#btn1").click(function()
        {
        	alert($("#pwd").attr("type"));
        	$("body").css("background","orange");
        });
        
        $("#btn2").click(function()
        {
        	alert($("#myImg").attr("src"));
        });
        
        
    });
  </script>
</head>
<body> <!-- attr1.jsp -->
	<input type="text" id="pwd"> <p>
	<img src="a1.jpg" id="myImg" width="100">
	<hr>
	
	<input type="button" id="btn1" value="input속성보기">
	<input type="button" id="btn2" value="img속성보기">
</body>
</html>
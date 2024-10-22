<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <script src="https://code.jquery.com/jquery-latest.js"></script>
 <script>
 	$(function(){
 		
 		$("#chk").click(function()
 		{
 			if($("#chk").prop("checked"))
 			{
 				$("#aa").css("color","red");
 			}
 			else
 			{
 				$("#aa").css("color","black");
 			}
 		})
 		
 		$("#myImg").click(function()
 		{	
 			if($("#myImg").attr("src")=="a1.jpg")
 			{
 				$("#myImg").attr("src","a3.jpg");
 			}
 			else
 			{
 				$("#myImg").attr("src","a1.jpg");
 			}
 		})
 	})
 </script>
</head>
<body> <!-- checkEx.jsp -->
<!-- 체크박스의 체크유무에 따른 스타일 변경 -->
<input type="checkbox" id="chk"> <span id="aa"> 안녕하세요!! 월요일이 힘드네요 </span>

<hr>
<img src="a1.jpg" width="100" id="myImg">

</body>
</html>
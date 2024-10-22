<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
   .my1 {
     color:white;
     font-size:20px;
     background:purple;
     width:120px;
     height:24px;
     line-height:24px;
     text-align:center;
   }
 </style>
 <script src="https://code.jquery.com/jquery-latest.js"></script>
 <script>
 	$(function()
 	{
 		$("#btn").click(function()
 		{
 			if($("#aa").hasClass("my1"))
 			{
 				$("#aa").removeClass("my1");
 			}
 			else
 			{
 				$("#aa").addClass("my1");
 			}
 		})
 	})
 </script>

</head>
<body>
	<input type="button" id="btn" value="수동toggle">
	<hr>
	<div id="aa" class="my1">안녕하세요</div>
</body>
</html>
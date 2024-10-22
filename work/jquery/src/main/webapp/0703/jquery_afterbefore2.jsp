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
		$("#btn").click(function()
		{
			$("#my").after($("#aa"));
		})
		
		$("#srcBtn").click(function()
		{
			var body=$("body").html();
			$("#src").text(body);
		})
	})
</script>
</head>
<body>
	<input type="button" id="btn" value="클릭">
	<input type="button" id="srcBtn" value="소스보기">
	<hr>
	<span id="aa"> 갈비찜 </span>
	<span id="bb"> 매운탕 </span>
	<hr>
	<span id="my">나는</span>
	
	<hr>
	<div id="src"></div>
</body>
</html>
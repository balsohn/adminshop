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
		$("li").hover(function()
		{
			$(this).css("color","red");
		},
		function()
		{
			$(this).css("color","black");
		})
		
		
		$("#btn").click(function()
		{
			$("li").slideToggle();
		})
	})
</script>
</head>
<body>
	<input type="button" id="btn" value="클릭">
	<hr>
	<ul>
		<li>갈비탕</li>
		<li>매운탕</li>
		<li>감자탕</li>
		<li>추어탕</li>
		<li>몰라탕</li>
	</ul>
</body>
</html>
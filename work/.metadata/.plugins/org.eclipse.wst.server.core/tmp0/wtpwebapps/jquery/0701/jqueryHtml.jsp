<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script>
	// 요소(태그)에 텍스트 or html태그를 포함한 내용=>innerText, innerHTML
	// html() : innerHTML, text() : innerText
	// 텍스트 or 태그를 포함한 내용을 넣어보기
	$(function()
	{
		var str="학교종이 땡땡땡 어서 모이자";
		$("#btn").click(function(){
			$("#aa").text(str);
			$("#bb").html(str);
		})
	})
</script>
</head>
<body>
	<button type="button"id="btn">버튼</button>
	<hr>
	<div id="aa"></div>
	<div id="bb"></div>
</body>
</html>
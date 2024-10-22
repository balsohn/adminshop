<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

	#a1 {
		border:1px solid #aaaaaa;
		width:80px;
		height:30px;
		background:#eeeeee
		border-radius:4px; /*background와 같이 있으면 실행이 안됨..왜 인지는 모름*/
		
	}
	#a2 {
		border:1px solid #aaaaaa;
		width:80px;
		height:20px;
		display:inline-block;
		text-align:center;
		line-height:20px; /* height와 px를 동일한 값으로 설정하면 상하정렬이 된다.*/
		font-size:13px;
		border-radius:4px;
	}
	#a3 {
		border:1px solid #aaaaaa;
		width:80px;
		height:30px;
		display:inline-block;
		text-align:center;
		line-height:30px;
		font-size:13px;
		border-radius:4px; /* 둥근 모서리*/
	}

	#a4 {
	width: 100px;
	height: 100px;
	border:1px solid solid red; 
	border-radius:40px;
	
	}
</style>




</head>
<body><!--  css_borderEx.jsp -->

	<input id="a1" type="button" value="클릭"> <p>
	<span id="a2">클릭 </span>
	<div id="a3">클릭 </div>
	
	<hr>
	<div id="a4"></div>


</body>
</html>
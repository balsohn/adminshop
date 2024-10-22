<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>

b {
	/* inline에서 block으로*/ 
	display:block;
	width:100px;
	height:50px;
	background:yellow;
	}
	
	u{
		display:inline-block; /* 인라인속성을 가지면서 block의 크기를 사용할 수 있다.*/
		width:100px;
		height:50px;
		background:red;
	}
	
	div{
		display:inline;
	}


</style>

</head>
<body> <!--  css_widthheight3 -->

<!-- 
	width, height는 block tag만 가능하다
	단, inline tag도 가능하게 할 수 있다
	1. inline tag => block tag 변형
	2. inline tag => 가로, 세로속성을 사용할 수있는 속성을 부여 
 -->

<span>오늘</span>
<b>내일</b>
<u>모레</u>
<i>졸려</i>


<hr>
<div> 하하하 </div>
<div> 호호호 </div>

</body>
</html>
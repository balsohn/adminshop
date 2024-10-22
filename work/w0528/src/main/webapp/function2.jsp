<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	//body내의 요소의 동적인 변화
	//글자관련 태그 속성 및 스타일 속성의 변경
	//영역관련 태그 속성 및 스타일 속성 
	//폼태그 관련 태그 속성 및 스타일 속성 
	
	//[1]태그속성 변경
	//dom.속성="값";
	//[2]스타일속성 변경
	//dom.style.속성="값";
	
	function ex1()
	{
		
		//자바스크립트에서 body내의 요소를 부르는 것을 DOM객체 
		//태그명, id, class, name (form태그에서 많이쓰임)
		
		//document.getElementsByTagName
		//document.getElementById
		//document.getElementsByClassName
		//document.getElementsByName
		
		//tag명이 div인 요소의 태그속성(align) 변경
		//s가 붙은 getElements 는 모든 태그를 불러온다. 자동 배열로 처리. 0부터 
		document.getElementsByTagName("div")[1].align="right";
	}
	function ex2()
	{
		//input 태그의 속성을 변경
		document.getElementsByTagName("input")[3].type="password";
	}
	function ex3()
	{
		//img 태그의 속성을 변경
		document.getElementsByTagName("img")[0].src="moo6.jpg";
		document.getElementsByTagName("img")[0].width="200";
	}

</script>
</head>
<body><!-- function2.jsp -->

	<input type="button" onclick="ex1()" value="div변경">
	<input type="button" onclick="ex2()" value="input변경">
	<input type="button" onclick="ex3()" value="img변경">
	
	<div align="center"> 무민밸리 </div>
	<hr>
	<input type="text">
	<hr>
	<img src="moo3.jpg" width="100">
	<hr>
	<div align="center"> 스너프킨 </div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
body {
	font-size:32px;  <!-- 16픽셀 기본설정값 -->
}
#a1{
	font-size:1rem; /*100%;*/  <!-- body픽셀기준-->
}
#a2{
	font-size:r2em; /*200%;*/
}
#a3{
	font-size:3rem; /*300%;*/
}
#a4{
	font-size:0.5rem; /*50%;*/
}
#a5{
	font-size: 0.8rem; /*80%;*/
}
#a6{
	font-size:1.2rem; /*120%;*/ 
}

</style>
</head>
<body> <!--  css_fontsize4.jsp -->
<!-- 상대적 크기 : rem -->



<div> 안녕하세요 </div>   
	<div id="a1"> 안녕하세요</div>
	<div id="a2"> 안녕하세요</div>
	<div id="a3"> 안녕하세요</div>
	<div id="a4"> 안녕하세요</div>
	<div id="a5"> 안녕하세요</div> 
	<div id="a6"> 안녕하세요</div> 


</body>
</html>
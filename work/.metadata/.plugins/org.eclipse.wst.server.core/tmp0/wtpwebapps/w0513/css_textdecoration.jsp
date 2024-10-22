<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
	#a1{
	text-decoration:none;  
	color:black; <!-- a태그의 기본 설정.--> 
	}
	#a2{
	text-decoration:underline;
	}
	#a3{
	text-decoration:line-through;
	}
	#a4{
	text-decoration:overline;
	}

</style>


</head>
<body><!-- css_textdecoration.jsp -->

<!--  
	text-decoration : 텍스트의 줄 긋기
	none, underline, line-through, overline
 -->

  	<div id="a1"> 안녕하세요 </div> <p>
  	<div id="a2"> 안녕하세요 </div> <p>
  	<div id="a3"> 안녕하세요 </div> <p>
  	<div id="a4"> 안녕하세요 </div> <p>
  	<a href="http://www.naver.com" id="a1" > 네이버 </a>	
  
</body>
</html>
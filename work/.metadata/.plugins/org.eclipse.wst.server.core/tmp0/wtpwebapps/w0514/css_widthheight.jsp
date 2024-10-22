<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
 
 #a1 {
 	width:200px;
 	height:100px;
 	background:yellow;   // 글자, 테투리 선이나 바탕을 설정하지 않으면 테이블은 투명하게 표시된다. 
 	
 }
 
 
 
 </style>

</head>
<body><!--  css_widthheight.jsp -->
<!-- 
	width : 요소의 가로크기
	height : 요소의 세로크기 
	
	요소의 가로세로크기를 조정할 수 있다
	웹페이지를 만들때 블록 당 크기를 조정할 수 있다. 
	1층(윗칸)부터 계층적 구조로 하단으로 블럭을 쌓는다. 
 -->
 
 <div style="background:yellow;"> 학교종이 땡땡땡 어서모이자 선생님이 우리를 기다리신다. </div>  <!--  &nbsp; 빈칸 스페이스 -->
 <hr>
 <!-- 블록테그는 가로 세로 전체 적용  -->
 <div id="a1">학교종이 땡땡땡 어서모이자 선생님이 우리를 기다리신다. </div>
 <hr>
 <h1 id="a1"></h1>
<!--  inline tag는 적용 안됨  -->
</body>
</html>
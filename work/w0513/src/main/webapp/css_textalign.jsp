<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
#a1 {
	text-align:center;
	background:yellow;
}
#a2 {
	text-align:right;
	background:yellow;
}

</style>


</head>
<body><!--  css_textalign.jsp -->
<!-- 
	text-align : 요소들의 정렬 
	center, left, right, justify(많은 글이 있을 때 구분 가능) 
 -->
 
 <h1 align="center"> 안녕하세요 </h1>
  <div align="right"> 안녕!! </div>
  <hr>
  
  <h1 id="a1"> 안녕하세요 </h1>
  <div id="a2"> 안녕!!</div>
  
  <b id="a1"> 월요일 </b> <p>
  <span id="a2"> 하하하</span>
</body>
</html>
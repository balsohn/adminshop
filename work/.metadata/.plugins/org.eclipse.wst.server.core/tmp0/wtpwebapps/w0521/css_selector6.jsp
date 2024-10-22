<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style>
	 h2 + div { /*h2태그 바로 뒤에 존재하는 div*/
	  color:red;
	 }
	
	 b ~ div { /* b태그 뒤의 모든 div*/
	 	background:yellow;
	 }
	
	
	</style>
</head>
<body><!-- css_selector6.jsp -->

<!-- 
	동위선택자 : 형제선택자
 -->
 
 	<h1> 1.홍길동</h1>
	<h2> 2.배트맨</h2>
	<div>3.슈퍼맨</div>
	<b>	 4.뽀로로</b>
	<div>5.브레드</div>
	<h2> 6.윌키공주</h2>
	<div>7.초 코</div>
</body>
</html>
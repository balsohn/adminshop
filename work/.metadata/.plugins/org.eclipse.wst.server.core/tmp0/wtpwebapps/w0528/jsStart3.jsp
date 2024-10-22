<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body><!-- jsStart.jsp -->
	<!-- 자바스크립트 호출하는 위치 =>대부분 body 
 	body내의 요소(태그)를 사용자가 이벤트를 발생시키면 함수가 호출 
    이벤트 : 클릭, 마우스오버, focus, blur, keypress, keydown, keyup
    	   mousemove, load, unload, 
    -->
    <!-- <tag "on"+ event handler=method> index </tag> -->
    <div onmouseover="test()"> 클릭 </div>
    <hr>
    <span onmouseover="test()"> 클릭해봐</span>
    <hr>
    <a href= "" onmouseover="test()"> 클릭</a>
    <hr>
    <img src="aa.jpg" onmouseover="test()">
    


</body>
</html>
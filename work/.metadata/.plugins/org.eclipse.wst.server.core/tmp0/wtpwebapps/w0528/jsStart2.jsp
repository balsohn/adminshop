<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script>
	//스크립트 내에 function메소드 안에 alert 문서를 읽을때 실행 X
	//function은 호출하여야 동작. 
	//동작을 나중에 실행하려면 function을 활용 
	function test()
	{
		alert();
	}
	</script>
</head>
<body><!-- jsStart2.jsp -->
	<!-- 자바스크립트 호출하는 위치 =>대부분 body 
 	body내의 요소(태그)를 사용자가 이벤트를 발생시키면 함수가 호출 
    이벤트 : 클릭, 마우스오버, focus, blur, keypress, keydown, keyup
    	   mousemove, load, unload, 
    -->
    <!-- <tag "on"+ event handler=method> index </tag> -->
    <div onclick="test()"> 클릭 </div>
    <hr>
    <span onclick="test()"> 클릭해봐 </span>
    <hr>
    <a href="aa.jpg" onclick="test()">
    <hr>
    <img src="aa.jpg" onclick="test()"> 
    
alert();
</body>
</html>
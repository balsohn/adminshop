<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#aa{
		width:50px;
		height:50px;
		background:red;
		margin:20px; /*상하좌우의 다른 요소랑 20px 떨어진 위치*/
	}
	#bb{
		width:50px;
		height:50px;
		background:blue;
		/*margin은 상, 하, 좌, 우를 따로 표기하여 사용할 수 있다*/
		/*		  top, bottom, left, right */
		margin-top:40px;
		margin-left:10px;
	}


</style>


</head>
<body><!--  css_margin.jsp -->

	<!-- 
		margin : 상 하 좌 우에 존재하는 다른 요소(태그)간의 간격 
	 -->
	<div style="width:300px; height:300px;border:1px solid black"> 
	 <div id="aa"> </div>
	 <div id="bb"> </div>
	
	</div>
	
	
</body>
</html>
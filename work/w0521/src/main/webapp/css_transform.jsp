<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	div {
		width:100px;
		height:100px;
		background:red;
		margin-left:200px;
		margin-top:100px;
	}
	
	#aa {
		transform:rotate(45deg);
		background:blue;
	}
	#bb {
		transform:scale(0.5,0.5);  /*X,Y*/
		background:red;
	}
	#cc {
		transform:translate(100px,300px);
		background:green;
	}
	#dd {
		transform:skew(30deg,30deg);
		background:yellow;
	}
</style>
</head>
<body> <!-- css_rotate1.jsp -->

<!-- 
	transform : rotate(회전), scale(크기), translate(이동), skew(기울기)
	rotate를 제외한 나머지는 x,y축을 따로 값을 주는 속성도 있다 => scaleX(), scaleY(), translateX(), translateY()...
	 
 -->
	<div id="aa"> </div>
	<hr>
	<div id="bb"> </div>
	<hr>
	<div id="cc"> </div>
	<hr>
	<div id="dd"> </div>
	<hr>
	
</body>
</html>
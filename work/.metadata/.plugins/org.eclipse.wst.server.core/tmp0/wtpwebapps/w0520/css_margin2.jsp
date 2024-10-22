<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	body {
		margin:0px; /*웹과 블록의 간격을 없앤다. */
	}

	#aa {
		background:purple;
	}
	
	#bb{
		
		width:1100px;
		height:100px;
		border:1px solid red;
		background:red;
		margin:auto; /*현재 블럭의 좌우 정렬 기능*/
	}
	#cc{
		width:1600px;
		height:100px;
		border:1px solid green;
		background:green;
		margin:auto; /*현재 블럭의 좌우 정렬 기능*/
	}
	#dd{
		width:1100px;
		height:100px;
		border:1px solid blue;
		background:blue;
		margin:auto; /*현재 블럭의 좌우 정렬 기능*/
	}

</style>

</head>
<body><!-- css_margin2.jsp -->

	<div id="aa">&nbsp;</div> 
	<div id="bb">&nbsp;</div> 
	<div id="cc">&nbsp;</div> 
	<div id="dd">&nbsp;</div> 

</body>
</html>
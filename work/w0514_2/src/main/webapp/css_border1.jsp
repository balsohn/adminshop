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
 	height:30px;
 	background:yellow;

 }

	#a1 {
		border-color:red;
		border-width:1px;
		border-style:solid;
		
	}
	
	#a2 {
		/*border-color:blue;
		border-width:4px;
		border-style:double;*/
		border: 4px double blue
	}

	#a3 {
	    border-color:purple;
		border-width:1px;
		border-style:double; /*dashed, groove, ridge, inset, hidden*/ 
	}
	
	#a4{
		border: 1px solid pink /* 순서 상관없음. 색,두께,모양 */  /* 간단 표기 방법!!!*/
		
	}
</style>
</head>
<body><!-- css_border1.jsp -->

<!-- 

	border : 외곽선 관련 스타일 
	border-color: 외곽선 색 
	border-width:외곽선 두께
	border-style:외곽선 선의 종류

 -->
	<div> </div><hr>
	<div id="a1"></div> <hr>
	<div id="a2"></div> <hr>
	<div id="a3"></div> <hr>
	<div id="a4"></div> <hr> 

</body>
</html>
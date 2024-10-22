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
	border:2px solid black;
	margin-top:10px;
	}

	#aa{
	background:yellow;
	}
	.aa{
	background:blue;
	}
	/*여러개를 선택*/
	#aa, .aa, #bb {
	border-color:red;
	}

</style>



</head>
<body><!-- css_selector1.jsp -->

<!-- 
 기본선택자 : 태그, id, class
 -->

	<div id="aa"> </div>
	<div id="bb"> </div>
	<div class="aa"> </div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	
	#a1{ 
		width:100px;
		height:100px;
		border:1px solid red;
		outline:1px solid blue;
	}
	
	#a2{
		border:none;  /*텍스트창 외곽선 없음*/
		outline:none; /*텍스트창 마우스 클릭 후 검은색 테투리 생성 없앰*/
	}
	#outer{
		width:300px;
		height:30px;
		border:1px solid purple;
	}

</style>


</head>
<body><!-- css_outline.jsp -->

	<div id="a1"> </div>
	<hr>
	
	<div id="outer"> 
	<input type="text" id="a2">
	<img src="1.jpg" width="20">
	</div>  
	<!--  텍스트창의 범위  -->

</body>
</html>
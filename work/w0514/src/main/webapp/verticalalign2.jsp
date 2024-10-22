<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#a1 {
	 
	 width:200px;
	 height:200px;
	 border:1px solid black;
	 vertical-align:middle;   /* td에서만 가능 */ 

	}
	
	#a2 {
	 width:200px;
	 height:200px;
	 border:1px solid red;
	 vertical-align:middle; 
	 /*테이블의 cell의 형태로 변화*/
	 
	 display: table-cell; /* 테이블 셀로 변환*/ 
	}



</style>



</head>
<body>

<div id="a1"> 안녕 </div>
<hr>
<div id="a2"> 안녕 </div>

</body>
</html>
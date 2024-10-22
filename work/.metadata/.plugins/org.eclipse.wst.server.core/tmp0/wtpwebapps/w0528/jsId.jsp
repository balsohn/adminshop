<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<script>
	 	function ex1()
	 	{
	 		//document.all.aa.align="center";
	 		aa.align="center";
	 	}
	 	function ex2()
	 	{
	 		document.all.bb.align="right"; //현재는 사용하지 않음. 
	 	}
	
	
	</script>
</head>
<body><!-- jsId.jsp -->

<!-- 
	이전에는 자바스크립트에 요소를 접근할때 id를 사용
 -->
	<input type="button" onclick="ex1()" value="클릭1">
	<input type="button" onclick="ex2()" value="클릭2">
	
	<div id="aa"> 안녕하세요! </div>
	<hr>
	<div id="bb"> 감사합니다! </div> 

</body>
</html>
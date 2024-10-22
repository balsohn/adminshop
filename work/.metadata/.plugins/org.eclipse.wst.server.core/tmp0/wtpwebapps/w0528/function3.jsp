<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>

	//dom.style.속성=값;
	function ex1()
	{
		document.getElementById("aa").style.color="purple";
		document.getElementById("aa").style.fontSize="30px";
	}
	function ex2()
	{
		document.getElementById("bb").style.border="5px solid blue";
	}
	function ex3()
	{
		document.getElementById("cc").style.display="none"
	}



</script>

</head>
<body><!-- function3.jsp -->

	<input type="button" onclick="ex1()" value="변경1">
	<input type="button" onclick="ex2()" value="변경2">
	<input type="button" onclick="ex3()" value="변경3">
	<hr>
	<div id="aa">Isn't life exciting!</div>
	
	<hr>
	<span id="bb"> I only want to live </span> <p> in peace, plant potatoes and dream!
	
	<hr>
	<img src="moo6.jpg" width="300" id="cc">
</body>
</html>
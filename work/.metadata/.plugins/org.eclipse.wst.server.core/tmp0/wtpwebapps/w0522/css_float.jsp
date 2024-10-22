<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#a1, #a2, #a3, #a4{
		width:500px;
		height:200px;
		border:1px solid black;
		display:inline-block;
		margin-left:20px;
	}
	#bb, #bb1, #bb2{
		width: 80px;
		height:30px;
		background:yellow;
		border:1px solid blue;
	}
	#a1> #bb{
		float: left;
	}
	#a2 >#bb {
		float: right;
	}
	#a3 >#bb1 {
		float: left;
	}
	#a3 >#bb2 {
		float: right;
	}
	#a4 > #bb {
		/*display:inline-block;*/
	}
</style>
</head>
<body><!-- css_float.jsp -->

	<div id="a1"> 
		<div id="bb"> </div>
		<div id="bb"> </div>
		<div id="bb"> </div>
		<div id="bb"> </div>
	</div>
	<div id="a2"> 
		<div id="bb"> </div>
		<div id="bb"> </div>
		<div id="bb"> </div>
		<div id="bb"> </div>
	</div>
	<div id="a3"> 
		<div id="bb1"> 첫번째 </div>
		<div id="bb2"> 두번째</div>
		<div id="bb1"> 세번째</div>
		<div id="bb2"> 네번째</div>
	</div>
	<div id="a4"> 
		<div id="bb"> </div>
		<div id="bb"> </div>
		<div id="bb"> </div>
		<div id="bb"> </div>
	</div>
</body>
</html>
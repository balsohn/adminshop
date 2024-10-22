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

	#a1 {/*상단*/
		border-top-color:red;
		border-top-width:1px;
		border-top-style:solid;
		border-bottom:1px solid red;
	}
	#a2 {/*하단*/
		border-bottom-color:red;
		border-bottom-width:1px;
		border-bottom-style:solid;
		border-top:1px solid red;
	}
	
	#a3{/*좌*/
	  	border-left-color:blue;
		border-left-width:4px;
		border-left-style:double;
		border-right:4px double blue;
	
	} 
	#a4{/*우*/
	  	/*border-right-color:blue;
		border-right-width:4px;
		border-right-style:double;
		border-left:4px double blue;
	*/
	
		border: 6px solid pink
	} 
	
	</style>
</head>
<body><!-- css_border2.jsp -->

<!--  일부 방향에만 선을 표시  -->

	<div> </div><hr>
	<div id="a1"></div> <hr>
	<div id="a2"></div> <hr>
	<div id="a3"></div> <hr>
	<div id="a4"></div> <hr> 

</body>
</html>
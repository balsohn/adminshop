<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	img[src="a1.jpg"]{
		border:3px solid blue;
	}
	img[src~="a2.jpg"]{
		border:3px solid green;
	}
	img[src|="a3.jpg"]{
		border:3px solid yellow;
	}
	img[src$=gif]{ 					/*해당 글자(gif)로 끝나는 속성*/
		border:3px solid purple;
	}
	img[src^="b"]{					/*b속성 모두 */
		outline:3px solid red;
	}
	
	img[src*="1"]{ 					/*포함이 되어 있는 속성*/
		opacity:0.3;
	}
</style>
</head>
<body><!-- css_selector4 -->
<!-- 
	문자열내의 속성선택자 
 -->
 	<img src="a1.jpg" width="100">
 	<img src="a2.jpg" width="100">
	<img src="a3.jpg" width="100">
 	<img src="a4.gif" width="100">
 	<hr>
	<img src="b1.jpg" width="100">
 	<img src="b2.jpg" width="100">
 	<img src="b3.jpg" width="100">
 	<img src="b4.gif" width="100">
</body>
</html>
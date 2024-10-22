<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	input:disabled{
		border-color:red;
	}
	input:enabled{
		border-color:blue;
	}
	input:checked{
		width:40px;
		height:40px;
	}
	
	input:focus{
		color:red; /*커서가 텍스트를 작업할 때 빨강. 텍스트 박스 밖에선 폰트 검정으로 돌아옴*/
	}
</style>

</head>
<body><!-- css_selector8.jsp -->

<!-- 
	상태선택자 : 요소의 상태에 따라서
	form태그에서
 -->
 
  	<input type="text" disabled><p>
  	<input type="text"><p>
  	<input type="text"><p>
  	<input type="radio" checked><p>
	<input type="radio"><p>
	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>
	var kor=99;
	var eng=88;
	
	var hap=kor+eng;
	alert(hap);
</script>

<script src="my.js"></script>
</head>
<body><!-- javascriptStart.jsp -->
<!-- 
	javascript : 브라우저에서 동적인 처리=> 사용자들이 웹페이지를 사용하는데 있어 편리제공 
	사용방법
	1.웹문서에 <script> </script>태그내에 코드를 넣는다
	2.태그내에 직접 코드를 넣는다
	3.외부파일을 이용하여 사용한다.
	
 -->
	<div onclick="alert('하하하')"> 안녕하세요 </div><p>
	<div onclick="test()"> 클릭</div>
	
</body>
</html>
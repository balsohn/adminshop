<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script>
		function test()
		{
			document.write("웹페이지에 출력") //호출을 해야 실행 됨 
			//이전의 웹페이지 내용은 없어진다. 
		}
	</script>
</head>
<body><!--  jsChul22.jsp -->
	즐거운 월요일
	<input type="button" onclick="test()" value="클릭"> 
	<!-- text()메소드를 button onclick시 실행해라 -->
</body>
</html>
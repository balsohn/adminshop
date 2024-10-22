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
		
		//아래의 폼에 입력된 값을 읽어오기 
		//방법 : 1. DOM을 이용
		//		2. name을 이용 
		//document.name(myform).하위 name. value입력된 값
		//입력된 value를 name 변수에 할당
		var userId=document.myform.userId.value;
		var password=document.myform.password.value;
		var sogae=document.myform.sogae.value;
		
		alert(userId);
		alert(password);
		alert(sogae);
	}



</script>
</head>
<body><!-- jsForm.jsp -->
<!-- 
	1.javascript에서 body내의 요소의 동적인 변화
	2.form태그의 유효성 검사 
 -->
 <!-- 현재 폼의 값을 서버로 보내어서 필요한 작업을 실행한다 -->
 <!-- 폼태그의 name은 자바스크립트에 접근하는 이름 -->
 	<form method="post" action="test.jsp" name="myform">
 		<input type="text" name="userId"> <hr>
 		<input type="password" name="password"> <hr>
 		<textarea name="sogae" cols="30" rows="4"></textarea><hr>
 		<input type="button" onclick="ex1()" value="체크하기">
 	</form>


</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> <!--  form3.jsp -->
<!--     3. 명령을 실행하라는 태그 
	input tag => button, submit, image, reset 
	button tag => button, submit 
-->

<form>
	<input type="button" value="주소찾기"> <p> <!-- 현재문서내의 자바스크립트 함수 호출용 -->
	<input type="submit" value="저장"> <p>    <!-- 서버로 전송(폼에 있는 입력값)을 한다.    -->
	<input type="image" src="1.jpg"> <p>     <!-- 그림을 submit의 용도로 사용한다. -->
	<input type="reset" value="취소"> <p>     <!-- form의 입력값을 초기화 -->
	<button  type="button"><input type="checkbox"> 조회 <u>하하</u></button> <p>
	<button  type="submit"> 저장 </button > <p>
		<button> 클릭</button> <p>            <!--  type 생략시 기본값이 submit -->
	<input type="text"> <input type="radio">
	

	
	


</form>


</body>
</html>
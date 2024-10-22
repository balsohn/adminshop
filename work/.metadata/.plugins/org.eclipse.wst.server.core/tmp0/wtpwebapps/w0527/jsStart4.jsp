<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <script>
   //스크립트태그 내의 명령은 언제 실행되는가?
   //현재 문서를 읽을때 실행 
   
   //문서를 읽은 후에 동작할 자바스크립트는 어떻게 하나?
   //실행을 읽을때가 아닌 소스를 실행 안 시키는 방법 => function 
   //메소드내의 소스는 언제 실행하나? => 요청했을때 
		   
	var kor=100;
 	var eng=89;
 	alert(kor+eng);
 
 	function test(){ //메소드를 이용해서 브라우저가 스킵한다.  
 		alert("함수"); //호출을 하여야 실행이 된다. 
 	}
 	
 	var age;
 	age=11;
 	alert(age);
 	
 	//[1]함수를 실행하는 방법 
 	//1)script 태그 내에서 호출
 	test(); //아래에 존재하는 요소에는 접근 불가 
 	
 	//2)body의 태그 요소 내부에서 실행 => 아무태그나 가능하다 
 
 </script>

</head>
<body><!-- jsStart4.jsp -->
       <!-- 함수를 호출하면 실행  -->

	<input type="button" value="태그에서 함수호출" onclick="test()">
											<!-- 이벤트 발생시에 함수가 실행 -->
	<!-- 이벤트핸들러=함수명 onclick=test() 전체 문서의 요소에 다 접근이 가능-->
	
	//--------------------------이벤트와 이벤트 핸들러---------------------//
	/*
	[1]이벤트 : 어떤 객체가 발생시키는 동작 또는 상황. 
	사용자의 입력, 버튼을 누르거나 이미지 위에 마우스 포인터를 올려 놓는 등의 사건. 
	다른 클래스나 객체에 알리고자 하는 용도
	
	[2]이벤트 핸들러: 이벤트가 발생될 때마다 처리하기 위해 호출되는 메서드 
	외부에서 이벤트를 직접 호출할 수 없고 이벤트를 선언한 클래스 내에서만 이벤트를 발생시킬 수 있다.
	
	
	
	*/

</body>
</html>
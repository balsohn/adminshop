<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script>                                              //익명함수
   // jquery 사용법 => $(요소).메소드();  , $(요소).이벤트(funtion(){});
   $(document).ready(function()
   {
	   // 메소드를 정의하면 문서를 읽을때 실행
	   $("#aa").css("color","red");
	   
	   // 요소.이벤트 => 해당요소가 사용자에 의해 이벤트가 발생했을때 동작
	   $("#aa").click(function()
	   {
		   $("#aa").css("color","blue");
		   //document.getElementById("aa").style.background="yellow";
	   });
	   
	   // 요소.이벤트 => 이름을 가진 메소드도 호출가능
	   $("#bb").click(test);
   });
   function test()
   {
	   document.getElementById("bb").style.color="green";
	   //$("#bb").css("color","green");
   }
</script>
</head>
<body>
  <div id="aa">안녕하세요</div> <p>
  <div id="bb">감사합니다.</div>
</body>
</html>







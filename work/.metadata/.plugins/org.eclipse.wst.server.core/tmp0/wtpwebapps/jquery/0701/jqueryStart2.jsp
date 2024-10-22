<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script>                                              //익명함수
   // jquery 사용법 => jQuery(요소).메소드();  , jQuery(요소).이벤트(funtion(){});
   jQuery(document).ready(function()
   {
	   // 메소드를 정의하면 문서를 읽을때 실행
	   jQuery("#aa").css("color","red");
	   
	   // 요소.이벤트 => 해당요소가 사용자에 의해 이벤트가 발생했을때 동작
	   jQuery("#aa").click(function()
	   {
		   jQuery("#aa").css("color","blue");
	   });
 
   });
    
</script>
</head>
<body> <!-- jqueryStart2.jsp -->
  <div id="aa">안녕하세요</div> <p>
 </body>
</html>







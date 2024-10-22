<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <script src="https://code.jquery.com/jquery-latest.js"></script>
  <script>
    $(function()
    {
        // css속성을 주기
        //$("#aa").css("color","red");
        //$("#aa").css("font-size","30px");
        $("#aa").css("color","red").css("font-size","30px");
        $(".bb").css("color","blue");
        
        // css의 속성을 읽어오기
        $("#btn1").click(function()
        {
        	alert($("#aa").css("color"));
        	alert($("#aa").css("font-size"));
        });
        $("#btn2").click(function()
        {
        	alert($(".bb").css("color"));
        	alert($(".bb").css("font-size"));
        });
    });
   </script>
</head>
<body> <!-- css2.jsp -->
  
  <div id="aa">안녕하세요</div> <p>
  <div class="bb"> 감사합니다. </div>
  <hr>
  <input type="button" id="btn1" value="id='aa'의 속성">
  <input type="button" id="btn2" value="class='bb'의 속성">
  
</body>
</html>









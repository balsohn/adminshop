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
    	// css의 속성을 바꾸는 메소드 css("속성","값");
    	$("#aa").css("color","red");
    	// id는 첫번째 요소만
    	$("#bb").css("fontSize","30px");
    	$("#cc").css("font-size","11px");
    	$("#dd").css("background","blue");
    	$("#ee").css("border","1px solid red");
    });
  </script>
</head>
<body> <!-- css1.jsp -->
   <div id="aa"> 망상해수욕장 </div>
   <div id="bb"> 망상해수욕장 </div>
   <div id="cc"> 망상해수욕장 </div>
   <div id="dd"> 망상해수욕장 </div>
   <div id="ee"> 망상해수욕장 </div>
</body>
</html>




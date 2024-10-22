<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <style>
 
 	#aa {
 		background:green;
 		color:purple;
 	}
 	 /* id="bb"인 요소의 스타일 지정하시오 */
 	 /*가로크기 100px, 세로크기 100px, 배경색 노랑 , 외곽선 1px 실선 빨강 스타일지정 */
 	#bb{
 		width:100px;
 		height:100px;
 		background:yellow;
 		border:1px solid red;
 	}
 	
  
 </style>
 <script>
  
   
  
  
    // 버튼1을 클릭하면 id="aa"인 요소의  
   // 배경색은 노랑, 글자색은 파랑으로 하시오
   	function func1() 
	{
		document.getElementById("aa").style.background="yellow";
		document.getElementById("aa").style.color="blue";
		
	}
    // 버튼2를 클릭하면 id="bb"인 요소의
    // 외곽선 색을 black으로 배경색을 purple로 바꾸시오
 	function func2() 
	{
		document.getElementById("bb").style.borderColor="black";
		document.getElementById("bb").style.background="purple";
		
	}
 	 // 버튼 3을 클릭하면 메뉴중 하나를 숨기시오
 	function func3() 
	{
		document.getElementsByTagName("li")[2].style.display="none";
		//document.getElementById("a1").style.display="none";
	}
 </script>
</head>
<body> <!-- quiz.jsp -->
	<input type="button" value="a" onclick="func1()">
	<input type="button" value="b" onclick="func2()">
	<input type="button" value="우동 숨기기" onclick="func3()">
	

   <hr>
   <div id="aa"> 즐거운 화요일 </div>
   <hr>
	<div id="bb"> </div>
	
 
   <ul>
     <li> 짜장면 </li>
     <li> 짬뽕 </li>
     <li> 우동 </li>
     <!-- <li id="a1"> 우동 </li>-->
     <li> 탕수육 </li>
   </ul>
</body>
</html>
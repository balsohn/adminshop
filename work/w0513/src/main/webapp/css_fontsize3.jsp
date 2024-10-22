<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
body {
	font-size:32px;  <!-- 16픽셀 기본설정값 -->
}
#a1{
	font-size:1em; /*100%;*/  <!-- body픽셀기준-->
}
#a2{
	font-size:2em; /*200%;*/
}
<!--
#a3{
	font-size:3em; /*300%;*/
}
#a4{
	font-size:0.5em; /*50%;*/
}
#a5{
	font-size: 0.8em; /*80%;*/
}
#a6{
	font-size:1.2em; /*120%;*/ 
}
-->
</style>

 <script>
   var ft=16;
   function add()
   {
	   ft++;
	   document.getElementsByTagName("body")[0].style.fontSize=ft+"px";
   }
   function sub()
   {
	   ft--;
	   document.getElementsByTagName("body")[0].style.fontSize=ft+"px";
   }
  </script>

</head>
<body>


 <!-- css_fontsize3.jsp -->

<!-- 
		3.상대적 크기 :  %, em => body태그가 기준
 -->
 <input type="button" onclick="add()" value="크게">
 <input type="button" onclick="sub()" value="작게">
<hr>
 
 <div> 안녕하세요 </div>   
	<div id="a1"> 안녕하세요</div>
	<div id="a2"> 안녕하세요
		<span style="font-size:2rem;"> 안녕하세요</span>
		</div>
	<div id="a3"> 안녕하세요</div>
	<div id="a4"> 안녕하세요</div>
	<div id="a5"> 안녕하세요</div> 
	<div id="a6"> 안녕하세요</div> 

 
 </body>
 </html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.cc{
	display:inline-block;
	width:70px;
	height:30px;
	border:1px solid black;
	text-align:center;
	line-height:30px;
	}
	
	#a1, #b1, #c1 {
		display:none;
	}
</style>
<script>
	function view1()
	{
		document.getElementById("a1").style.display="block";
	}
	function view2()
	{
		document.getElementById("b1").style.display="inline";
	}
	function view3()
	{
		document.getElementById("c1").style.display="inline-block";
	}

</script>

</head>
<body><!-- css_viewhide2.jsp --> 
<!-- 
	display : none => block, inline, inline-block 
	숨겨진 요소의 원래 속성에 맞게 값을 주면 된다.
 -->
	 <input type="button" value="우동 보이기" onclick="view1()"><p>
	 <div> 짜장면</div>
	 <div> 짬뽕</div>
	 <div id="a1"> 우동</div>										
	 <div> 탕수육</div>
	 <hr>
	 
	<input type="button" value="우동 보이기" onclick="view2()"><p>
	<span > 짜장면</span>
 	<span > 짬뽕 </span>
 	<span id="b1"> 우동 </span>
 	<span > 탕수육</span>
 	
 	<hr>
	<input type="button" value="우동 보이기" onclick="view3()"><p>
 	<span class="cc"> 짜장면</span>
 	<span class="cc"> 짬뽕 </span>
 	<span id="c1" class="cc"> 우동 </span>
 	<span class="cc"> 탕수육</span>
 	
 	
</body>
</html>
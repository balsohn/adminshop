<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#a1 {
		display:none; /* 해당 요소가 포함된 공간이 사라짐. 스타일을 통해 display none 속성 */
	}
	#b1 {
		visibility:hidden; /*텍스트만 비우고 공간은 남음*/
	}
</style>
<script> 
	function view1() 
	{
		document.getElementById("a1").style.display="block";
	}
	function view2()
	{
		document.getElementById("b1").style.visibility="visible"; 
	}
	
</script>

</head>
<body> <!-- css_viewhide.jsp -->
<!-- 
	css를 통하여 요소(태그)의 보이기 숨기기를 조절하는 기능
	
	display: none(숨기기)<=> block, inline, inline-block, 
	visibility: hidden(숨기기) <=> visibility(보이기)

	1.숨기기를 실행했을때 두 속성의 차이 
 -->
 
 <input type="button" value="우동 보이기" onclick="view1()"> 	
 <div> 짜장면</div>
 <div> 짬뽕</div>
 <div id="a1"> 우동</div>										
 <div> 탕수육</div>
 <hr>
 <input type="button" value="우동 보이기" onclick="view2()">
 <div> 짜장면</div>
 <div> 짬뽕</div>
 <div id="b1"> 우동</div>
 <div> 탕수육</div>
 
</body>
</html>
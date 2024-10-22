<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#a1, #b1, #c1 {
	display:none;
	}
</style>
<script>
	function view1()
	{
		document.getElementById("a1").style.display="table";
	}
	function view2()
	{
		document.getElementById("b1").style.display="table-row";
	}
	function view3()
	{
		document.getElementById("c1").style.display="table-cell";
	}
</script>

</head>
<body> <!-- css_viewhide3.jsp -->
<!--  table의 요소를 숨겼을때 -->
	<input type="button" value="테이블보이기" onclick="view1()">
	<input type="button" value="행보이기" onclick="view2()">
	<input type="button" value="열보이기" onclick="view3()">
	<hr>
	<table id="a1" width="200" height="100" border="1">
	 <tr>
	 	<td>이름</td>
	 	<td>주소</td>
	 	<td>나이</td>
	</tr>
	 <tr>
	 	<td>홍길동</td>
	 	<td>몰라</td>
	 	<td id="c1">33</td>
	 </tr>
	<tr id="b1">
	 	<td>배트맨</td>
	 	<td>미국</td>
	 	<td>66</td>
	</tr>
	
	</table>


</body>
</html>
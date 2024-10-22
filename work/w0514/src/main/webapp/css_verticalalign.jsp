<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
 #a1 {
 	vertical-align: bottom;
 	text-align: center;
 	background: grey

 }
 #a2 {
 	vertical-align: top;
 }


</style>


</head>
<body> <!--  css_verticalalign.jsp -->

<!-- 

	vertical-align : 요소의 상하 정렬 . 영역을 가진 공간만 적용 가능.테이블의 cell에서만 동작한다. 
	top, middle, bottom 
 -->

<table border="1" width="300" height="200">
	<tr>
		<td align="center"> 이름 </td>
		<td valign="top"> 주소 </td>
	</tr>
	<tr>
		<td id="a1">홍길동</td>
		<td id="a2">고양시</td>
	</tr>
		
</table>

</body>
</html>
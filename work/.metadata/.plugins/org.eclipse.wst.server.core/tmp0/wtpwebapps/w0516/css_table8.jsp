<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
	table {
	border:1px solid black;  /*전체 표의 외곽선 효과*/
	border-collapse:collapse;
	}
	td {
	border:1px solid black; /*각 셀의 외곽선 효과*/
	width:66px; 
	height:33px;
	padding:5px;
	}
</style>

</head>
<body><!-- css_table8.jsp -->

<!-- 
	css에서도 td의 가로세로의 길이를 줄 수 있다 
	cellpadding :하나의 셀 내에 포함된 요소와 외곽선간의 간격 
 -->

<table width="200" height="100"> <!-- cellpadding="10"셀 안의 요소, 글자나 그림과 표 간격간의 거리 stylebox에서는 padding. 원래 영역이 더 크면 공간 넘음.-->
	<tr>
		<td>하하하</td>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td></td>
	</tr>
	
	</table>
	
</body>
</html>
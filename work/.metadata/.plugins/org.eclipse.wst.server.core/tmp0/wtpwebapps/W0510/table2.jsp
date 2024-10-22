<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>  <!-- 셀과 셀을 합쳐서 출력 -->
<body>

<table width="300" height="200" border="1" cellspacing="0">
		<tr>      		<!-- 1행 -->
		  <td> </td>
		  <td> </td>
		  <td rowspan="2"> </td>		<!-- 상하 병합은 rowspan -->
		</tr>
		<tr>			<!-- 2행 -->
		  <td> </td>
		  <td> </td>
		</tr>
		<tr>			<!-- 3행 -->
		  <td colspan="2"> </td>		<!-- 가로 병합은 colspan -->
		  <td> </td>
		</tr>
	</table>

</body>
</html>
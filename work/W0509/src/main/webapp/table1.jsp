<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> <!--  table1. jsp -->
<!--  
	표 만들기 : table(테이블의 시작과 끝), tr(행), td(열), caption(표의 제목)
	
	속성
	align : 좌우정렬 (table, tr, td)
	valign : 상하정렬 (tr, td) 
	-->
	<table border="1" width="300" height="200" cellspacing="0" align="center">
	 
	 <caption> 표의 제목입니다. </caption> <br>
	 
	 <br>
	 <tr align="center" valign="top"> <!--  tr에 포함된 모든 td의 내용이 정렬. -->
	   <td> 이름 </td>
	   <td> 주소 </td> 
	 </tr>
	 <tr>
	   <td align="center">홍길동</td>
	   <td valign="bottom">고양시</td> 
	 </tr>
	</table>
	
	
 
</body>
</html>
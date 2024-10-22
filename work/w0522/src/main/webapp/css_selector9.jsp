<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
	li:first-child{
		color:blue;
	}
	li:last-child{
		color:red;
	}
	li:nth-child(2){
		color:yellow;
	}
	li:nth-child(5){
		color:green;
	}
	li:nth-child(2n){ /*0부터 시작 2,4,6.... */
		background:#eeeeee;
	}
	li:nth-child(2n+1){ /*1부터 시작*/
		background:#33cc66;
	}
	
</style>
</head>
<body> <!-- css_selector9.jsp -->
<!-- 
	구조선택자 : 동일한 선택자내에서의 순서접근 방법 
 -->
 		
 	<ul>
 		<li> 해운대 해수욕장 </li>
 		<li> 광안리 해수욕장 </li>
 		<li> 송 도 해수욕장 </li>
 		<li> 다대포 해수욕장 </li>
 		<li> 송 정 해수욕장 </li>
 		<li> 진 하 해수욕장 </li>
 		<li> 망 상 해수욕장 </li>
 		<li> 속 초 해수욕장 </li>
 	</ul>
 	
</body>
</html>
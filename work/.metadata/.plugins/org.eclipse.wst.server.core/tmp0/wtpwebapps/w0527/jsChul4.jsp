<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body><!-- jsChul4.jsp -->
<!-- 
	4.innerHTML, innerText : 태그내에 값을 전달 (열고 닫는태그가 존재)
	innerHTML : 읽을때(태그를 포함해서 읽기), 표현(태그를 번역)
	innerText : 읽을때(태그를 제외한 텍스트만), 표현(태그를 글자로 표현)
 -->
 
 <div id="aa"> 집에 갑시다 </div>

<input type="button" value="소스보기" onclick="view()">
<div id="src"></div>

 <script> 
 	var imsi="<div id='bb'> <ul><li>하하하</li><li>호호호</li><li>헤헤헤</li></ul></div> ";
 	document.getElementById("aa").innerHTML=imsi;
// 	document.getElementById("aa").innerHTML="<b>공부</b>합시다"; 
 								//<b>태그 번역 후 출력 
 	//document.getElementById("aa").innerText="<b>공부</b>합시다";
 									//그대로 출력 
 </script>

</body>
</html>
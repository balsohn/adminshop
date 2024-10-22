<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

<!--1.html의 head태그내에서 정의 -->
	/* 아래의 b태그에 스타일을 추가 */
	/* 	css의 표기구조
	선택자 {속성1:값1; 속성2:값2;} */
	
	b {color:red;background:yellow;}

</style>

</head>

<body> <!-- css_one.jsp -->
<b> 안녕!!</b>
<hr>

<!-- 2.태그에 직접 정의 -->
<div style="color:blue;"> 안녕하세요 </div>


<link rel="stylesheet" href="my.css">

<!--  3.외부파일에서 가져오기 -->
  /*css적용할 파일은 css파일로 생성.
      변경할 내용만 입력 */
 
 
<u> 즐거운 금요일</u>
<s> 열심히 공부하자 </s>

</body>
</html>
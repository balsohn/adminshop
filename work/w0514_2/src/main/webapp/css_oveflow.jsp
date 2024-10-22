<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
 div{
 	width:150px;
 	height:60px;
 	background:yellow;
 	margin-top:80px;
 }

	#a1 {
	 overflow: auto; /*브라우저가 알아서 하시오*/
	}
	
	#a2 {
	overflow: hidden; /*무조건 숨겨라 */
	/*브라우저에서 여러 화면을 가로방향/세로방향으로 영역을 설정하고 나머지 부분은 hidden. 1->2 ... */
	}
	
	#a3 {
	 overflow: scroll; /* 무조건 가로세로바 scroll bar 생성 */
	}
	
	#a4 {
	 overflow-x:hidden;  /* 가로바 hidden*/
	 overflow-y:scroll;  /*세로바 스크롤.*/
	}
	
</style>

</head>
<body> <!-- css_overflow.jsp -->

<!--
overflow : 영역이 존재하는 곳에서 텍스트, 그림같은 것이 영역을 초과하는 경우
-->

<div> 동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세</div>
<div id="a1"> 동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세 학교종이 땡땡땡 어서모이자</div> 
<div id="a2"> 동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세 학교종이 땡땡땡 어서모이자</div> 
<div id="a3"> 동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세 학교종이 땡땡땡 어서모이자</div>
<div id="a4"> 동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세 학교종이 땡땡땡 어서모이자</div>


</body>
</html>
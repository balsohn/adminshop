<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
    /* style sheet에서 주석입니다.*/
    /* 선택자 : 현재 문서내의 태그의 속성을 추가하기위해서 부르는 이름 */
    /* 선택자 {속성:값1; 속성2:값2;} */
    /* 선택자는 몇가지가 있을까? => 수십가지가 있다. */
    /* 1.태그선택자  2.id선택자  3.class선택자 ... */
    
  	/* 태그선택자 : <>없이 태그명만 표기 */ 
  	b {color:red;} /*현재문서내의 모든 b태그에 적용*/
  	s {color:lightblue;}
  	em {color:pink;}
  	u {color:blue;}
  	i {color:yellow;}
  	... {}
  	
  	/* id선택자: id속성을 가진 태그에 접근 */
  	
  	/* id=# */
  	#a1 {} 
  	#a1 {background:purple;}
  	
  	/* class선택자 : class 속성을 가진 태그에 접근 */
  	/* class= .*/
  	.b1 {background:grey;}
  	 
  	/*id의 이름과 class의 이름이 같다면 서로 다르다 */
  	.a1 {background:yellow;}
	class의 a1은 노란배경(.a1= class a1) id의 a1은 보라배경(#a1) 

</style>


</head>
<body> <!-- css_selector.jsp -->

	<b> 오늘은 </b> <s> 즐거운 </s> <em id="a1"> 금요일입니다. </em> <p>
	<b id="a1"> 내일은 </b> <s> 더 좋은 </s> <i> 토요일입니다. </i> <p>
	<b> 모레는 </b> <s class="b1"> 아쉬운 </s> <u class="a1"> 일요일입니다.</u>




</body>
</html>
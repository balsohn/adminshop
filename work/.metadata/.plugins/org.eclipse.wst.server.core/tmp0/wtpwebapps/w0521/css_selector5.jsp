<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

	.off2{
		color:blue;
	}
	/*id="parent" 요소내의 class="off2"에 속성을 주고 싶을때*/
	#parent > .off1 { /*자손 선택자 : 부모의 바로 아래세대에서 class="off1"*/
		background:yellow;
	}
	#parent .off1{ /*후손 선택자 : 부모의 아래에 존재하는 모든 class="off1"*/
		text-decoration:underline;
	}
	#parent2 .off3  .off1{
		background:red;
	}
</style>
</head>
<body><!-- css_selector5.jsp -->
<!-- 
	자손 후손 선택자
	: 부모관계가 있는 태그들 사이엔 존재하는 관계를 토대로
 -->
 	<div id="parent">				<!-- 부모 1-->
 		<div class="off1">홍길동</div>	<!-- 자식 2-->
 		<div class="off2">서울시</div>	<!-- 자식 2-->
 		<div class="off3">취미			<!-- 자식 2-->
 			<div id="aa">낚시</div>		<!-- 자식의 자식 3-->
 			<div id="bb">골프</div>		<!-- 자식의 자식 3-->
 			<div class="off1"> 여행</div><!-- 자식의 자식 3-->
 		</div>
 	</div>
 	<hr>
 	<div id="parent2">				<!-- 부모 1-->
 		<div class="off1">배트맨</div>	<!-- 자식 2-->
 		<div class="off2">제주도</div>	<!-- 자식 2-->
 		<div class="off3">취미			<!-- 자식 2-->
 			<div id="aa">음주</div>		<!-- 자식의 자식 3-->
 			<div id="bb">노래</div>		<!-- 자식의 자식 3-->
 			<div class="off1">놀기</div>
 		</div>
 	</div>
</body>
</html>
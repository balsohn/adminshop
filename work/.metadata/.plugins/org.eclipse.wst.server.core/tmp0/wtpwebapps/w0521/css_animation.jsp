<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
		#aa 
		{
		width:100px;
		height:100px;
		background:red;
		margin-left:200px;
		margin-top:200px;
		/*필요한 애니메이션 동작을 부른다*/
		animation:pkc1 3s ease-in infinite alternate;
		
		}
		#bb 
		{
		width:100px;
		height:100px;
		background:blue;
		margin-left:200px;
		margin-top:200px;
		animation:pkc2 7s ease-in-out infinite alternate;
	
		
		}
		#cc
		{
		width:100px;
		height:100px;
		background:green;
		margin-left:200px;
		margin-top:200px;
		animation:pkc3 5s ease-out infinite alternate;
		
		}
		
		
		
		/*애니메이션을 지원*/
		/*애니메이션의 동작을 정의*/
		@keyframes pkc1{
		
		/*시작과 끝의 단계를 정의*/
		from {transform:translate(0px,400px);
			  transform:rotate(0deg);
		}
		to{transform:translate(50px,50px);
		   transform:rotate(360deg);			
		}
		}
		
		@keyframes pkc2{
		0% {transform:scale(0,0);}
		100%{transform:scale(1,0.5);}
		}
		
		@keyframes pkc3{
		0% {background:red;}
		25%{background:blue;}
		50% {background:purple;}
		75%{background:green;}
		100%{background:yellow;}
		}

</style>

</head>
<body><!-- css_translate.jsp -->

<div id="aa"> </div>
<div id="bb"> </div>
<div id="cc"> </div>
</body>
</html>
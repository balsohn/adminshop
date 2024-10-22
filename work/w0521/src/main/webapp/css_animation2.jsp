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
		animation-name:pkc1; 
		animation-delay:0.5s;				 /*지연시간*/
		animation-duration:3s;
		animation-iteration-count:infinite; /*반복횟수 3 */
		animation-play-state:paused;
		animation-timing-function:linear; /*ease, linear, ease-in, ease-out, ease-in-out*/
		}
		
		#aa:hover{
		animation-play-state:running; /*running. pause*/
		}
		
		#bb 
		{
		width:100px;
		height:100px;
		background:blue;
		margin-left:200px;
		margin-top:200px;
		animation:pkc2 8s ease-out infinite alternate;
		
		}
		#cc
		{
		width:100px;
		height:100px;
		background:green;
		margin-left:200px;
		margin-top:200px;
		animation:pkc3 10s ease-out;
		animation-direction:alternate; /*normal, reverse, alternate, alternate-reverse 뒤에서 시작 앞으로 */
		animation-fill-mode:forwards; /*none, backwards =>최초값 forwards,both =>애니 종료 후에 요소의 마지막 */
		
		}
		
		img {
		width:300px;
		height:300px;
		background:blue;
		margin-left:200px;
		margin-top:200px;
		animation:pkc4 8s ease-out infinite alternate;
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
		0% {transform:translate(0px,0px);}
		25% {transform:translate(200px,0px);}
		50% {transform:translate(200px,200px);}
		75% {transform:translate(0px,200px);}
		100%{transform:translate(0px,0px);}
		}
		
		@keyframes pkc3{
		0% {background:red;}
		25%{background:blue;}
		50% {background:purple;}
		75%{background:green;}
		100%{background:yellow;}
		}
		
		@keyframes pkc4{
		
		/*시작과 끝의 단계를 정의*/
		from {transform:translate(0px,0px);}
		to{transform:translate(200px,200px);}
		
		
		
</style>
<script>
	function chg()
	{
		document.getElementById("aa").style.animationPlayState="running"; //작동 
	}
	 function chg2()
	   {
		   document.getElementById("aa").style.animationPlayState="paused"; //멈춤 
	   }

</script>

</head>
<body><!-- css_translate.jsp -->

<input type="button" value="시작" onclick="chg()">
 <input type="button" value="정지" onclick="chg2()">
 
 <!--image에 버튼효과를 주려면 id, 효과를 주려면 class. -->
 <img src="moo3.jpg" id="ii"> 
<div id="aa"> </div>
<div id="bb"> </div>
<div id="cc"> </div>
</body>
</html>
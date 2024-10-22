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
		animation-duration:3s;
		
		}
		/*애니메이션을 지원*/
		/*애니메이션의 동작을 정의*/
		@keyframes pkc1{
		
		/*시작과 끝의 단계를 정의*/
		from {transform:scale(1,1);}
		to{transform:scale(2,2);}
		
		}

</style>


</head>
<body><!-- css_scale.jsp -->
<div id="aa"> </div>
</body>
</html>
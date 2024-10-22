<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	
	#aa{ /*id="aa"인 모든 요소*/
		/*color:red;*/
	}
	/*li 태그중에 id="aa"인 요소*/
	li[id=aa]{
		color:black;
	}
	
	li[class="aa"]
	{
	color:green;
	}
	li#aa{
		background:pink;
	}
	li.aa{
		background:grey;
	}
	
</style>


</head>
<body> <!-- css_selector2.jsp -->

<!-- 
 	속성선택자:동일한 요소내의 요소를 접근
 -->

	<ul>
	<li> 짜장면 </li>
	<li id="aa"> 우 동 </li>
	<li> 짬 뽕 </li>
	<li> 울 면 </li>
	<li class="aa"> 기스면 </li>
	<li> 쫄 면 </li>
	</ul>
	<hr>
	<div id="aa">하하하</div>
</body>
</html>
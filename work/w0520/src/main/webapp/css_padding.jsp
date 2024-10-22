<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	
	body{
	 	margin:0px;
	}

	#aa{
		width:500px;
		height:500px;
		background:red;
		border:1px solid black;
		padding:50px; /*패딩을 설정하지 않으면 크기설정이 같으면 덮어진다.*/
					  /*패딩을 설정하면 설정한 id는 패딩만큼 늘어나고 나머지는 설정값으로 나타난다.*/
	}
	#bb{
		width:500px;
		height:500px;
		background:white;
	}
	#cc{
	    border: 1px solid green;
		background:green;
		padding:4px;
		margin-left:20px;
		/* padding => top, bottom, left, right */
	}
	#dd{
		border:1px solid blue;
		background:blue;
		margin:300px;
		padding-bottom:5px;
	}

</style>
</head>
<body><!-- css_padding.jsp -->

<!-- 
	margin은 웹페이지로부터 간격 padding은 대상을 둘러싼 두께  

 -->

	<div id="aa">AAAA		    <!-- 내용을 포함할 공간 태그 -->
		<div id="bb">BBBB <!-- 내용 태그 -->
		 <hr>
		<span id="cc"> CCCC</span>
		<span id="dd"> DDDD</span>
		</div>
	 </div>	
	
	
</body>
</html>
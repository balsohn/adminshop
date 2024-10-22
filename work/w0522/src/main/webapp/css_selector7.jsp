<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	/* 가장 기본적인 형태로 많이 쓰임. 
	a{
		text-decoration:none;
		color:black;
	}
	a:hover{
		text-decoration:underline;
	}
	*/
	a:link{
		color:green; /*링크가 있는 (href)*/
	}
	a:visited{
		color:yellow; /*다녀온 정보가 있는 사이트*/
	}
	a:active{ 		 
		color:pink;
	}



</style>
</head>
<body><!-- css_selector7.jsp -->

<!-- 
	반응선택자 : 특정요소에 동작에 따른 구분
	hover , (link, visited, active) <a> 태그에서 주로 사용
							//active a태그가 눌리고 있는 상태. 링크에 마우스로 클릭하고 있으면 빨강색으로 바뀜.
	 
 -->
 
    <a href="http://www.naver.com">네이버</a><p>
    <a href="http://www.kbs.co.kr">KBS </a><p>
    <a>클릭하세요</a><p>
    <a href="http://google.com">구글</a>
    

</body>
</html>
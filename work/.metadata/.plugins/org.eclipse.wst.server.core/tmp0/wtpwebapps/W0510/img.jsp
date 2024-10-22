<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> <!-- img.jsp -->
  <!--  
  		그림을 나타내기 = img 
  		src : 나타내고자 하는 그림파일의 이름(다른 폴더에 존재한다면 경로도 표기)
  		그림의 크기는 속성을 주지 않으면 원래 크기로 나타난다
  		width : 가로크기
  		height : 세로크기
  		border : 외곽선
  		alt : 그림이 없을시 표시할 글자 (옛날: 마우스를 그림위에 올리면 나타나는 풍선도움말)
  		valign : 그림과 같이 존재하는 텍스트의 그림 기준 상하위치를 정한다 // top middle bottom
  		
   -->
		<img src="5.jpg" width="200" valign="center"> 코알라그림 



<hr>
		<img src="9.jpg" alt="없을수 있어요"> <p>
		<img src="8.jpg" width="300"> <p> <!-- 가로크기는 300 세로크기는 원래그림의 가로세로 비율에 따라 자동으로 처리 -->
		<img src="8.jpg" height="300"> <p> <!-- 세로크기는 300 가로크기는 원래그림의 가로세로 비율에 따라 자동으로 처리 -->
		<img src="8.jpg" width="300" height="300"> <p> <!-- 지정된 가로, 세로크기로 만든다 -->
		 
</body>
</html>
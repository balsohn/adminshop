<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> <!-- form1.jsp -->
   <!-- form태그 : 사용자로부터 값을 입력받을수 있는 영역 -->
   <!--  
    1.키보드를 통해서 값을 입력하는 태그
     input tag => [ type="text" , type="password" ] , textarea태그 
    2.마우스를 통해서 선택하는 형태의 태그
    3.명령을 실행하시오 
    
    
    - 사용되는 속성들
     - 공통 
     name : javascript에서 접근할때, 서버에서 입력된 값을 읽을때 참고되는 이름 
     placeholder : 입력폼에 입력할 내용을 안내 
     disabled(<-> enabled) : 사용불가 <-> 사용가능 
     readonly : 수정불가 
     각각의 속성 
     value : 포함된 값(textarea는 안됨=> 태그사이에 입력) 
     size: 입력하는 폼의 크기를 조절 (text, password만 가능)
     cols,rows : 가로세로 (textarea)
     
     
     -->
     <script>
     {
    	 	document.pkc. userid.disabled=false; 
    	 	//document.pkc.userid.enabled=true; 
     }
     
     </script>
     
	<form name="pkc">

	아이디 : <input type="text" name="userid" disabled > <input type="button" value="사용가능" onclick="check()"> <p> 
	비밀번호 : <input type="password"> <p> 
	자기소개 : <textarea cols="40" rows="5"> </textarea>
	</form> 
		<hr>
	<form method="post" action="ok.jsp">
	  <input type="text" name="name" value="홍길동" readonly size="10"> <p>
	  <input type="text" placeholder="아이디" name="userid" size="30" > <p>
	  <input type="password" placeholder="비밀번호" name="pwd"> <p>
	  <textarea placeholder="자기소개" name="sogae"> 나는 나야</textarea> <p>
	  <input type="submit" value="전송">
	</form>
	<hr>
	<a href="ok.jsp">이동</a>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script>
		function check()
		{
			//서버로 전송되기전 유효성 검사를 한다
			
			//유효성 검사를 할 때 form태그에 onsubmit="return 메소드명()" 
			//return을 붙이면 함수의 return이 false이면 전송x, return이 true이면 전송 
			//return false; //submit 전송 취소 
			// return true; //submit 실행. 문제 없으면 서버로 전송 
			//alert();
		
			var userId=document.myform.userId.value.trim(); //앞뒤 공백 지움(문자열만 전송하기위해)
			//1.아이디값이 존재해야 한다. => 비어있으면 안된다=> 비어있으면 return false
			
			if(userId.length == 0)//(userId=="") //아이디값의 존재여부 / "" <비어있다면. 전송하지 않는다. 
			{
				//alert("아이디를 입력하세요");
				//요즘은 레이어도 있다.
				//관련 입력폼 근처에 출력 
				document.getElementById("aa").innerText="아이디가 비어있습니다."
				document.getElementById("aa").style.color="red";
				document.getElementById("aa").style.fontSize="12px";
						
				return false;//유효성 검사했을때 잘못입력된 경우 
			}
			else
			{
				return true;	
			}	
		}
	</script>	

</head>
<body><!-- jsForm2.jsp -->						<!-- form태그에 onsubmit은 submit버튼이 클릭되었을때 -->
	<form method="post" action="test.jsp" name="myform" onsubmit="return check()">
 		아이디 : <input type="text" name="userId"> 
 			<div id="aa"></div>
 		<hr>
 		비밀번호 : <input type="password" name="password"> <hr>
 		소개 : <textarea name="sogae" cols="30" rows="4"></textarea><hr>
 		<input type="submit" value="전송">
 		<!--  type="submit"은 전송되면 form의 action="test.jsp로 보내진다. -->
 	</form>
</body>
</html>
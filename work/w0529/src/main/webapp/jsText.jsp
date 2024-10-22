<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script>
	//type ="text" =>아이디, 이름, 전화번호, 이메일 한 줄 정도의 데이터
	//유효성 검사 => 꼭 필요한 데이터는 유효성검사를 한다..
	//1.비었느냐
	//2.길이제한 
	//3.숫자, 문자, 특수문자 
	
	function check()
	{
	
		//phone값 읽어오기
		var phone=document.pkc.phone.value.trim();
	
		if(phone.length==0) 	//"", length==0;
		{
		alert("전화번호가 비었습니다.");
		return false;
		}
		else if(phone.length<12)    //12자 이상 
		{
			alert("길이가 12자 이상이어야합니다.");	
			return false;
		}else
			{
				return true; //정상 입력
			}
				
	}
	

	
	</script>
</head>
<body><!-- jsText.jsp -->
	<form name="pkc" method="post" action="ok.jsp" onsubmit="return check()">
	전화번호 <input type="text" name="phone"><p>
	<input type="submit" value="저장">
	
	</form>
	


</body>
</html>
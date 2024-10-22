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
		/*
		//자바스크립트에서는 radio의 checked속성을 불러올수 있다 
		//=> true(checked,체크되었다면), false (체크되지 않았다면)
		
		//자바스크립트에서 radio를 부르기 
		//자바스크립트에서 접근하는 body요소들의 name이 같다면 전부 배열로 접근이 가능 
		alert(document.pkc.mun1[0].checked);
		*/
		
	
		//하나씩 전부 검사
		var chk=0;
		for(i=0; i<4; i++)
		{
			if(document.pkc.mun1[i].checked)
			{
				chk=1;
			}
			
		}
		
		if(chk==0)
		{
			alert("선택하세요");
			return false;
		}
		
		
		/*
		var chk=0;
		if(document.pkc.mun1[0].checked)
		{
			chk=1;
		}
		if(document.pkc.mun1[1].checked)
		{
			chk=1;
		}
		if(document.pkc.mun1[2].checked)
		{
			chk=1;
		}
		if(document.pkc.mun1[3].checked)
		{
			chk=1;
		}
		*/
	
	
		
		/*
		if() //하나도 선택되지 않았다면
		{
		 	alert("답을 선택해 주세요");
			return false;
		}
		else
		{
			return true;
		}
		*/
	
	
	 }
</script>
</head>
<body> <!-- jsRadio.jsp -->
<form name="pkc" method="post" action="ok.jsp" onsubmit="return check()">
	다음중 박기찬이 싫어하는 안주는?<p>
	<input type="radio" name="mun1"> 족발 <br>
	<input type="radio" name="mun1"> 생선회 <br>
	<input type="radio" name="mun1"> 오뎅 <br>
	<input type="radio" name="mun1"> 파전 <br>
	<input type="submit" value="선택완료">
	</form>
	<!--  
	<hr>
	<input type="radio" name="mun2">
	<input type="radio" name="mun2">
	<input type="radio" name="mun2">
	<input type="radio" name="mun2">
	-->

</body>
</html>
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
		var chk=0;
			
		for(i=0; i<8; i++)
		{
			if(document.pkc.mun1[i].checked)
			{
				chk++;
			}
		
		}
		
		if(chk==0)
		{
			alert("선택하세요");
			return false;
		}
		else if(chk<3)
		{
			alert("3개 이상 선택하세요");
			return false;
		}
		else
		{
			alert("선택한 갯수 :"+chk);
			return true;
		}
	}



</script>
</head>
<body>
<form name="pkc" method="post" action="ok.jsp" onsubmit="return check()">
	다음중 박기찬이 좋아하는 안주를 다 고르시오<p>
	<input type="checkbox" name="mun1"> 족발 <br>
	<input type="checkbox" name="mun1"> 생선회 <br>
	<input type="checkbox" name="mun1"> 오뎅 <br>
	<input type="checkbox" name="mun1"> 파전 <br>
	<input type="checkbox" name="mun1"> 떡볶이 <br>
	<input type="checkbox" name="mun1"> 피꼬막회 <br>
	<input type="checkbox" name="mun1"> 쭈꾸미 <br>
	<input type="checkbox" name="mun1"> 해삼 <br>
	<input type="submit" value="선택완료">
	</form>
</body>
</html>
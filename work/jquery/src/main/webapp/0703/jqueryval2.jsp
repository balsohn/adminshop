<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style>
		input[type=text] {
			width:60px;
		}
	</style>
	<script>
		window.onload=function()
		{
			document.getElementById("btn").onclick=function()
			{
				var kor=parseInt(document.pkc.kor.value);
				var eng=parseInt(document.pkc.eng.value);
				var mat=parseInt(document.pkc.mat.value);
				
				var hap=kor+eng+mat;
				var avg=hap/3;
				
				document.pkc.hap.value=hap;
				document.pkc.avg.value=avg;
			}
		}
	</script>
</head>
<body>
	<form name="pkc">
		국어 <input type="text" name="kor" id="kor">
		영어 <input type="text" name="eng" id="eng">
		수학 <input type="text" name="mat" id="mat">
		<hr>
		<input type="button" value="합계+평균" id="btn">
		<hr>
		합계 <input type="text" name="hap"> 
		평균 <input type="text" name="avg">
	</form>
</body>
</html>
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
	<script src="https://code.jquery.com/jquery-latest.js"></script>
	<script>
		$(function()
		{
			$('#btn').click(function()
			{
				var kor=Number($("#kor").val());
				var eng=parseInt($("#eng").val());
				var mat=parseInt($("#mat").val());
				
				var hap=kor+eng+mat;
				var avg=hap/3;
				
				$("#hap").val(hap);
				$("#avg").val(avg);
			})
		})
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
		합계 <input type="text" name="hap" id="hap">
		평균 <input type="text" name="avg" id="avg">
	</form>
</body>
</html>
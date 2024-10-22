<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<head>
	<title>Home</title>
		<style>
		section {
			width:700px;
			margin:auto;
		}
		.infoLayer {
			display: none;
			position: absolute;
			background-color: #f9f9f9;
			border: 1px solid #ccc;
			height:100px;
			width: 200px;
			box-shadow: 2px 2px 5px rgba(0, 0, 0, 0.2);
			z-index:1000;
		}
	</style>
	<script>
	function chk(my, event) {
		var chk = new XMLHttpRequest();
		chk.onload = function() {
			var layer = my.querySelector(".infoLayer");
			layer.innerHTML = chk.responseText;
			layer.style.display = "block";
			layer.style.left = event.offsetX + "px"; // 마우스 위치 기준으로 상대적인 좌표
			layer.style.top = event.offsetY-100 + "px";
		}
		chk.open("get", "getIphak?name="+my.innerText.trim());
		chk.send();
	}
	
	function out(my) {
		var layer=my.querySelector(".infoLayer");
		layer.style.display = "none";
	}
	</script>
</head>
<body>
	<section>
	<table>
		<tr>
			<td>이름</td>
			<td>주소</td>
			<td><a href="home?type=kor">국어</a></td>
			<td><a href="home?type=eng">영어</a></td>
			<td><a href="home?type=mat">수학</a></td>
			<td>총점</td>
			<td>평균</td>
		</tr>
		<c:forEach var="sdto" items="${slist}">
		<tr style="position:relative;">
			<td onmouseover="chk(this, event)" onmouseout="out(this)" style="position:relative;">
				${sdto.name}
				<div class="infoLayer"></div> <!-- td 안에서 레이어 표시 -->
			</td>
			<td>${sdto.juso}</td>
			<td>${sdto.kor}</td>
			<td>${sdto.eng}</td>
			<td>${sdto.mat}</td>
			<td>${sdto.tot}</td>
			<td>${sdto.avg}</td>
		</tr>
		</c:forEach>
	</table>
	</section>
</body>
</html>

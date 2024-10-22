<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Circle Animation</title>
<style>
	#aa {
        height: 50px; 
        width: 50px; 
        background: red;
        position: absolute;
        top: 150px; /* 중앙을 기준으로 시작 */
        left: 150px;
    }
</style>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script>
	$(function() {
		let angle = 0;
		const radius = 100; // 원의 반지름
		const centerX = 200; // 원의 중심 X 좌표
		const centerY = 200; // 원의 중심 Y 좌표
		let interval;

		$('#btn1').click(function() {
			if (interval) {
				clearInterval(interval); // 이미 실행 중이면 정지
			}
			
			interval = setInterval(function() {
				angle += 0.05; // 각도 증가 (속도 조절 가능)
				const x = centerX + radius * Math.cos(angle); // 원형 경로의 X 좌표
				const y = centerY + radius * Math.sin(angle); // 원형 경로의 Y 좌표
				
				$('#aa').css({
					left: x + 'px',
					top: y + 'px'
				});
			}, 20); // 시간 간격 (속도 조절 가능)
		});
	});
</script>
</head>
<body>
	<input type="button" id="btn1" value="움직이기">
	<hr>
	<div id="aa"></div>
</body>
</html>

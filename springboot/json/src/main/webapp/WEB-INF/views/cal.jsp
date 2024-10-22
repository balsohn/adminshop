<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table, td, th {border:1px solid black;}
	td {height: 50px; text-align: left;}
	#ww {cursor: pointer;}
	#ww:hover {background: #ccc;}
	#writeForm {
		position: absolute;
		left: 200px;
		top: 200px;
		width: 200px;
		height: auto;
		border: 1px solid black;
		background: white;
		text-align: center;
		padding: 10px;
		
	}
	
	#writeForm div{
		margin: 5px;
	}
	
	#writeForm #gubun {
		width: 188px;
		height: 31px;
	}
	
	#writeForm #title {
		width: 180px;
		height: 26px;
	}
	
	#writeForm #calday {
		width: 180px;
		height: 26px;
	}
	
	#writeForm #submit {
		width: 180px;
		height: 26px;
	}
	
	.pink {background:pink;}
	.gray {background: gray;}
	.green {background: green;}
</style>
<script>
	function viewSrc() {
		document.getElementById("src").innerText=document.getElementById("pkc").innerHTML;
	}
	function cal(year,month) {
		var year1=document.getElementById("currentYear").value;
		var month1=document.getElementById("currentMonth").value;
		
		var today=new Date();
		var y=year1;
		if(!year1) {
			y=year;
		} else if(!year) {
			y=today.getFullYear();
		}
		
		var m=!month?today.getMonth():month;
		if(!month){
			m=today.getMonth();
		} else {
			if(month==12) {
				y=year+1
				m=0;
			} else if(month==-1) {
				y=year-1
				m=11;
			}
		}
		var xday=new Date(y,m,1);
		var firstday=xday.getDay();
		
		document.getElementById("currentYear").value=y;
		document.getElementById("currentMonth").value=m;
		
		var lengthofmonth=new Date(y,m+1,0).getDate();
		
		var week=(lengthofmonth+firstday)/7;
	    week=Math.ceil(week);

		var data="<table width='600' align='center'>"+
		"<caption>" +
		"<a href='javascript:cal("+y+","+(m-1)+")'> 이전 </a>" +
		"<span id='head'>"+y+"년 "+(m+1)+"월 </span>" +
		"<a href='javascript:cal("+y+","+(m+1)+")'> 다음 </a>" +
		"</caption>" +
		"<tr>" +
			"<td> 일 </td>"+
			"<td> 월 </td>"+
			"<td> 화 </td>"+
			"<td> 수 </td>"+
			"<td> 목 </td>"+
			"<td> 금 </td>"+
			"<td> 토 </td>"+
		"</tr>";
		
		var day=1;
		for (i = 1; i <= week; i++) {
	        data = data + "<tr valign='top'>";

	        for (j = 0; j < 7; j++) {
	            if (i === 1 && j < firstday) {
	                // 첫 주의 빈 칸을 채우는 부분
	                data = data + "<td> &nbsp; </td>";
	            } else if (day <= lengthofmonth) {
	                // 정상적인 날짜를 채우는 부분
	                
	                data = data + "<td class='title' id='ww' onclick='writeCal("+y+","+(m+1)+","+day+")'> " + day + " </td>";
	                day++;
	            } else {
	                // 남은 셀들을 빈칸으로 처리
	                data = data + "<td> &nbsp; </td>";
	            }
	        }
	        data = data + "</tr>";
	    }
		
		document.getElementById("pkc").innerHTML=data;
		
		getCals(y,m);
	}
	function writeCal(y,m,d) {
	    var day = String(d).padStart(2, '0');    // 일을 두 자리로 변환
	    var date = y + "-" + String(m).padStart(2,'0') + "-" + String(day).padStart(2,'0');
	    document.getElementById("writeForm").style.visibility = "visible";
	    document.getElementById("calday").value = date;
	}
	
	function check(my) {
		if(my.value==0) {
			return false;
		} else {
			return true;
		}
	}
	
	function getCals(y,m) {
		
		var ym=y+"-"+String(m+1).padStart(2,'0');
		
		var chk=new XMLHttpRequest();
		chk.onload=function() {
			var cals=JSON.parse(chk.responseText);
			var date=document.getElementsByClassName("title");
			for(cal1 of cals) {
				var n=cal1.calday.substring(8)-1;
				var div=document.createElement("div");
				div.innerText=cal1.title;
				if(cal1.gubun==1){
					div.className="pink";
				} else if(cal1.gubun==2) {
					div.className="gray";
				} else if(cla1.gubun==3){
					div.className="green";
				} else {
					div.className="";
				}
				date[n].appendChild(div);
			}
		}
		chk.open("get","getCals?ym="+ym);
		chk.send();
	}
	
	function getToday() {
		var today=new Date();
		var y=today.getFullYear();
		var m=today.getMonth();
		location.href="cal?y="+y+"&m="+m;w
	}
</script>
</head>
<body onload="cal(${param.y},${param.m})">
<input type="button" onclick="getToday()" value="오늘 날짜">
	<div>
		<form method="post" action="writeCal" id="writeForm" onsubmit="return check(this)">
		<input type="hidden" name="currentYear" id="currentYear" value="${currentYear}">
	<input type="hidden" name="currentMonth" id="currentMonth" value="${currentMonth}">
			<h3>스케줄 등록</h3>
			<div>
				<select name="gubun" id="gubun">
					<option value="0"> 선택 </option>
					<option value="1"> 외식하는날 </option>
					<option value="2"> 회의하는날 </option>
					<option value="3"> 특정스케줄 </option>
				</select>
			</div>
			<div> <input type="text" name="title" id="title"> </div>
			<div> <input type="text" name="calday" id="calday" readonly> </div>
			<div> <input type="submit" value="등록" id="submit"> </div>
		</form>
	</div>
	<input type="button" onclick="viewSrc()" value="소스보기">
	<div id="src"></div><hr>
	<input type="button" onclick="cal()" value="달력생성">
	<hr>
	<div id="pkc"></div>
</body>
</html>
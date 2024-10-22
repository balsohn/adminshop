<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script>
		function oneMember() {
			var userid=document.getElementById("userid").value;
			var chk=new XMLHttpRequest();
				chk.onload=function() {
					var data=JSON.parse(chk.responseText);
					document.getElementById("aa").innerText=data.name;
					document.getElementById("bb").innerText=data.email;
					document.getElementById("cc").innerText=data.phone;
					document.getElementById("dd").innerText=data.writeday;
				}
				chk.open("get","oneMember?userid="+userid);
				chk.send();
		}
		
		
/*		function threeMember() {
			var chk=new XMLHttpRequest();
			chk.onload=function() {
				var members=JSON.parse(chk.responseText);
				var i=0;
				for(member of members){
					document.getElementsByClassName("aa")[i].innerText=member.name;
					document.getElementsByClassName("bb")[i].innerText=member.email;
					document.getElementsByClassName("cc")[i].innerText=member.phone;
					document.getElementsByClassName("dd")[i].innerText=member.writeday;
					i++;
				}
			}
			chk.open("get","threeMember");
			chk.send();
		}  */
		
		function threeMember()
		  {
			  var chk=new XMLHttpRequest();
			  chk.onload=function()
			  {
				//  document.getElementById("src").innerText=chk.responseText;
				  var members=JSON.parse(chk.responseText);
				  var msg="<table width='600' align='center' border='1'>";
				
				  for( mem of members )
				  {
				     msg=msg+"<tr>";
				     
				     msg=msg+" <td>"+mem.userid+"</td>";
				     msg=msg+" <td>"+mem.name+"</td>";
				     msg=msg+" <td>"+mem.email+"</td>";
				     msg=msg+" <td>"+mem.phone+"</td>";
				     
				     msg=msg+"</tr>";
				  }	  
				  
				  msg=msg+"</table>";
				  
				  document.getElementById("src").innerHTML=msg;
				  // for를 통해서 
				  //alert(members.length); 
				  // 접근시 배열로 접근
				  //alert(members[0].userid);
			  }
			  chk.open("get","threeMember");
			  chk.send();
		  }
	</script>
</head>
<body>
	1명의 정보를 member테이블에서 가져오기 <p>
	<input type="text" name="userid" id="userid">
	<input type="button" onclick="oneMember()" value="1명의 정보">
	<hr>
	<div id="aa"></div> <p>
	<div id="bb"></div> <p>
	<div id="cc"></div> <p>
	<div id="dd"></div> <p>
	 <hr>
	 3명의 정보를 가져오기
	 <input type="button" onclick="threeMember()" value="3명의 정보">
	 <div class="aa"></div> <p>
	 <div class="bb"></div> <p>
	 <div class="cc"></div> <p>
	 <div class="dd"></div> <p>
	 <hr>
	 <div class="aa"></div> <p>
	 <div class="bb"></div> <p>
	 <div class="cc"></div> <p>
	 <div class="dd"></div> <p>
	 <hr>
	 <div class="aa"></div> <p>
	 <div class="bb"></div> <p>
	 <div class="cc"></div> <p>
	 <div class="dd"></div> <p>
	 <hr>
	<div id="src"></div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <style>
   #memberForm {
     width:1100px;
     height:600px;
     margin:auto;
     text-align:center;
     margin-top:140px;
   }
   #memberForm > form > div {
     margin-top:10px;
   }
   input[type=text] {
     width:320px;
     height:30px;
     border:1px solid purple;
     outline:none;
   }
   input[type=password] {
     width:320px;
     height:30px;
     border:1px solid purple;
     outline:none;
   }
   input[type=submit] {
     width:328px;
     height:36px;
     background:purple;
     color:white;
     font-weight:900;
     border:1px solid purple;
   }
 </style>
 <script>
    var idNum=0; // 0이면 체크를 안했거나, 사용불가능 아이디
                 // 사용가능아이디 => 다른값 1
   function useridCheck()
   {
	   var userid=document.mform.userid.value;
	   
	   if(userid.length>=4)
	   {
		   // ajax를 통해 useridCheck.jsp에 보낸다
		   var chk=new XMLHttpRequest();
		   chk.onload=function() // 서버에서 동작이 완료된 후 
		   { 
			   // 요청한 문서를 실행후 남은내용 : html,css,javascript
			   //alert(chk.responseText.trim());
		       var num=chk.responseText.trim();
		       if(num==1)
		       {
		    	   //alert("사용불가능 아이디");
		    	   document.getElementById("msg").innerText="사용불가능 아이디";
		    	   document.getElementById("msg").style.color="red";
		    	   idNum=0;
		       }	
		       else
		       {
		    	   //alert("사용가능 아이디");
		    	   document.getElementById("msg").innerText="사용가능 아이디";
		    	   document.getElementById("msg").style.color="blue";
		    	   idNum=1;
		       }	   
		   }
		   chk.open("get","useridCheck.jsp?userid="+userid); // 접근하고자 하는 서버요청(문서)
		   chk.send(); // 보내시오
	   }
	   else
	   {
          idNum=0;	
          document.getElementById("msg").innerText="아이디는 4자 이상";
   	      document.getElementById("msg").style.color="red";
	   }
	   
   }
   
   
   function check()
   {
	   // userid가 사용가능아이디가 아닐 경우에는 전송 X
	   if(idNum==0)
	   {
		   // 사용가능 아이디 확인이 안된 경우
		   alert("아이디 중복체크를 하세요");
		   return false;
	   }
	   else
	   {
		   return true;
	   }	   
   }
 </script>
</head>
<body> <!-- member.jsp -->
  <!-- 사용자아이디, 비밀번호, 이메일, 전화번호 입력폼 -->
  <!-- <form method="post" action="useridCheck.jsp">
    <input type="text" name="userid">
    <input type="submit" value="아이디중복확인">
  </form> -->
  <div id="memberForm">
   <form name="mform" method="post" action="memberOk.jsp" onsubmit="return check()"> 
     <div> <img src="logo.png"> </div>
     <div>
        <input type="text" name="userid" placeholder="아이디" onblur="useridCheck()">
        <!-- <button type="button" onclick="useridCheck()">중복확인</button> -->
        <br><span id="msg" style="font-size:12px;"></span>
     </div>
     <div> <input type="text" name="name" placeholder="이 름"> </div>
     <div> 
        <input type="password" name="pwd" placeholder="비밀번호" maxlength="10">
        <br><span id="pwd1" style="font-size:12px;"></span> 
     </div>
     <div> 
        <input type="password" name="pwd2" placeholder="비밀번호 확인" maxlength="10">
        <br><span id="pwd2" style="font-size:12px;"></span> 
     </div>
     <div> <input type="text" name="email" placeholder="이메일"> </div>
     <div> <input type="text" name="phone" placeholder="전화번호"> </div>
     <div> <input type="submit" value="회원가입"> </div>
   </form>
  </div>
</body>
</html>
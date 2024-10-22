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
   // 회원가입시 유효성검사
   // 1. 회원아이디의 중복여부
   // 2. 비밀번호입력폼의 값이 일치하는지 체크 + 길이 4자 이상
   // 3. 필수입력폼의 입력여부 => 이름, 이메일
   function useridCheck()
   {
	   var userid=document.mform.userid.value.trim();
	   userid=userid.replace(/ /g,"");
	   // alert(userid);
	   // 아이디의 중복체크가 필요 => 서버에서 동작을 해야 된다.. => 자바스크립트에 서버에 요청을 할 수있는 ajax를 이용
	   if(userid.length>=4) // 아이디는 4자 이상
	   {
		   var chk=new XMLHttpRequest();
		   chk.onload=function() // 서버에서 실행후 결과를 받는 영역
		   {
			   //alert(chk.responseText.trim());
			   var result=chk.responseText.trim();
			   if(result==0)
			   {
				   document.getElementById("msg").innerText="사용가능한 아이디";
				   document.getElementById("msg").style.color="blue";
			   }	
			   else
			   {
				   document.getElementById("msg").innerText="존재하는 아이디";
				   document.getElementById("msg").style.color="red";
			   }	    
		   }
		   chk.open("get","useridCheck?userid="+userid);
		   chk.send();
	   }	
	   else
	   {
		   document.getElementById("msg").innerText="아이디는 4자 이상입니다";
		   document.getElementById("msg").style.color="pink";
	   }	   
	   
	   
	   
   }
   function pwdCheck1() // 첫번재 비밀번호 입력칸에 4자 이상 입력여부를 판단
   {
	   // 첫번째 입력된 비밀번호를 가져오기
	   var pwd=document.mform.pwd.value;
	   if(pwd.length < 4) // 4자 미만
	   {
		   document.getElementById("pwd1").innerText="비밀번호의 길이는 4자 이상입니다";
		   document.getElementById("pwd1").style.color="red";
	   }	 
	   else
	   {
		   document.getElementById("pwd1").innerText="비밀번호의 길이는 유효합니다";
		   document.getElementById("pwd1").style.color="blue";
	   }	   
   }
   function pwdEqual()
   {
	   var pwd=document.mform.pwd.value;
	   var pwd2=document.mform.pwd2.value;
	   
	   if(pwd2!="")// 비어있지 않을때  // pwd2==""  , pwd2.length==0
	   {
		   if(pwd==pwd2)
		   {
			   document.getElementById("pwd2").innerText="비밀번호가 일치합니다";
			   document.getElementById("pwd2").style.color="blue";
		   }	
		   else
		   {
			   document.getElementById("pwd2").innerText="비밀번호가 일치하지 않습니다";
			   document.getElementById("pwd2").style.color="red";
		   }	  
	   }	   
	   
	    
		   
			   
   }
 </script>
</head>
<body> <!-- member.jsp -->
  <!-- 사용자아이디, 비밀번호, 이메일, 전화번호 입력폼 -->
  
  <div id="memberForm">
   <form name="mform" method="post" action="memberOk"> 
     <div> <a href="index"><img src="imgs/logo.png"> </a></div>
     <div>
        <input type="text" name="userid" placeholder="아이디" oninput="useridCheck()">
        <br><span id="msg" style="font-size:12px;"></span>
     </div>
     <div> <input type="text" name="name" placeholder="이 름"> </div>
     <div> 
        <input type="password" name="pwd" placeholder="비밀번호" maxlength="10" onkeyup="pwdEqual()" onblur="pwdCheck1()">
        <br><span id="pwd1" style="font-size:12px;"></span> 
     </div>
     <div> 
        <input type="password" name="pwd2" placeholder="비밀번호 확인" maxlength="10" onkeyup="pwdEqual()">
        <br><span id="pwd2" style="font-size:12px;"></span> 
     </div>
     <div> <input type="text" name="email" placeholder="이메일"> </div>
     <div> <input type="text" name="phone" placeholder="전화번호"> </div>
     <div> <input type="submit" value="회원가입"> </div>
   </form>
  </div>
</body>
</html>
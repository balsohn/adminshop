<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <style>
   #section {
     width:500px;
     height:600px;
     margin:auto;
     margin-top:200px;
     text-align:center;
   }
   #section > form > div {
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
</head>
<body> <!-- login.jsp -->
   <div id="section">
     <form method="post" action="loginOk.jsp">
      <div> <img src="logo.png" onclick="location='index.jsp'"> </div>
      <div> <input type="text" name="userid" placeholder="아이디"> </div>
      <div> <input type="password" name="pwd" placeholder="비밀번호"> </div>
      <div> <input type="submit" value="로그인"> </div>
     </form>
   </div>
</body>
</html>
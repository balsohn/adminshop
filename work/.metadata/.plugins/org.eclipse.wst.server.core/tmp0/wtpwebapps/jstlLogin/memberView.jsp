<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <style>
   #memberView {
     width:600px;
     height:400px;
     margin:auto;
     margin-top:200px;
   }
   table td {
     height:40px;
     border:1px solid black;
     text-align:center;
   }
 </style>
</head>
<body> <!-- memberView.jsp -->
<%@page import="login.Login" %>
<%
    Login login=new Login();
    login.memberView(session,request,response);
    
    Login.getName(request,session);
%>
  <!-- 출력부분  -->
  <div id="memberView">
    <table width="400" align="center">
      <caption> <h3> 회원님의 정보 <span style="font-size:11px" onclick="pwdChg()">비밀번호변경</span> </h3></caption>
      <tr>
        <td width="100"> 아이디 </td>
        <td> ${userid} </td>
      </tr>
      <tr>
        <td> 이 름 </td>
        <td> ${name}</td>
      </tr>
      <tr> <!-- 클릭을 해서 수정폼이 나오게 -->
        <td> 이메일 </td>
        <td>
          <!-- 처음에 정보를 보여주는 부분 -->
          <div id="before">
           ${mdto.email} 
           <input type="button" onclick="editView()" value="수정">
          </div>
           
          <!-- 수정을 클릭하면 수정할 수 있는 폼의 형태 --> 
          <div id="after" style="display:none;">
           <form method="post" action="emailOk.jsp">
            <input type="text" name="email" value="${mdto.email} ">
            <input type="submit" value="수정">
           </form>
          </div> 
        </td>
      </tr>
      <tr> <!-- 처음부터 수정폼으로 작업 -->
        <td> 전화번호 </td>
        <td>
         <form method="post" action="phoneOk.jsp">
          <input type="text" name="phone" value="${mdto.phone}">
          <input type="submit" value="수정">
         </form>
         </td>
      </tr>
    </table>
    <div id="pwdChg">
       <div> <h4> 비밀번호 변경하기 </h4></div>
       <form method="post" action="pwdChgOk.jsp">
         <input type="password" name="oldPwd" placeholder="기존 비밀번호"><br>
         <input type="password" name="pwd" placeholder="새 비밀번호"><br>
         <input type="password" name="pwd2" placeholder="새 비밀번호 확인"><br>
         <input type="submit" value="비밀번호 변경">
       </form>
    </div>
  </div>
 <style>
   #pwdChg {
     width:396px;
     height:260px;
     margin:auto;
     text-align:center;
     border:1px solid black;
     margin-top:20px;
     margin-bottom:100px;
     display:none;
   }
   #pwdChg input[type=password] {
     width:200px;
     height:28px;
     margin-top:8px;
   }
   #pwdChg input[type=submit] {
     width:208px;
     height:32px;
     margin-top:8px;
   }
 </style>
 <script>
   function pwdChg()
   {
	   document.getElementById("pwdChg").style.display="block";
   }
   function editView()
   {
	   // 이메일을 수정하고자 한다 수정폼을 보이게 하기
	   document.getElementById("after").style.display="block";
	   // id="before"는 숨겨야 된다.
	   document.getElementById("before").style.display="none";
   }
 </script>
</body>
</html>








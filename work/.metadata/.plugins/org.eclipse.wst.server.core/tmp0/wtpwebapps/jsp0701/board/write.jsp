<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <style>
   #title {
     width:500px;
     height:30px;
     border:1px solid green;
     outline:none;
   }
   #title:focus ,#name:focus, #pwd:focus, #content:focus {
     border-color:red;
   }
   #name {
     width:150px;
     height:30px;
     border:1px solid green;
     outline:none;
   }
   #pwd {
     width:150px;
     height:30px;
     border:1px solid green;
     outline:none;
   }
   #content {
     width:500px;
     height:200px;
     border:1px solid green;
     outline:none;
   }
   #submit {
     width:200px;
     height:35px;
     background:white;
     border:1px solid green;
     outline:none;
     cursor:pointer;
   }
   table {
     border-spacing:0px;
   }
   table td {
     border-bottom:1px solid black;
     padding:5px;
     height:50px;
   }
   table tr:first-child td {
     border-top:2px solid black;
   }
   table tr:last-child td {
     border-bottom:2px solid black;
   }
 </style>
</head>
<body> <!-- write.jsp -->
 <form method="post" action="writeOk.jsp">
  <table width="700" align="center">
    <caption> <h3> 게시판 글쓰기 </h3></caption>
    <tr>
      <td> 제 목 </td>
      <td> <input type="text" name="title" id="title"> </td>
    </tr>
    <tr>
      <td> 작성자 </td>
      <td> <input type="text" name="name" id="name"> </td>
    </tr>
    <tr>
      <td> 비밀번호 </td>
      <td> <input type="password" name="pwd" id="pwd"> </td>
    </tr>
    <tr>
      <td> 내 용 </td>
      <td> <textarea name="content" id="content"></textarea> </td>
    </tr>
    <tr align="center">
      <td colspan="2"> <input type="submit" value="글저장" id="submit"> </td>
    </tr>
  </table>
 </form>
</body>
</html>
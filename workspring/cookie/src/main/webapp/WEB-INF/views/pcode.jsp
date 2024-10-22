<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <script>
  function cookieChuga()
  {
	  var pcode=document.getElementById("chuga").value;
	  
	  var chk=new XMLHttpRequest();
	  chk.onload=function()
	  {
		  
	  }
	  chk.open("get","cookieChuga?pcode="+pcode);
	  chk.send();
  }
  
  function cookieDel() {
	  var delcode=document.getElementById("del").value;
	  var chk=new XMLHttpRequest();
	  chk.onload=function() {
		  
	  }
	  chk.open("get","cookieDel?delcode="+delcode);
	  chk.send();
  }
  
  function pcodeView() {
	  var chk=new XMLHttpRequest();
	  chk.onload=function() {
	  		document.getElementById("aa").innerText=chk.responseText;
	  }
	  chk.open("get","pcodeView");
	  chk.send();
  }
  
  function pcodeDel()
  {
	  var chk=new XMLHttpRequest();
	  chk.onload=function()
	  {
		  
	  }
	  chk.open("get","pcodeDel");
	  chk.send();
  }
 </script>
</head>
<body> <!-- pcode.jsp -->
  상품코드는 문자로 시작되는 6자로 임의로 정한다
  <p>=================================</p>
  <!-- a12345 , a77777-->
  <input type="text" name="chuga" size="5" id="chuga">
  <input type="button" onclick="cookieChuga()" value="쿠키에 추가하기">
  <hr>
  <input type="text" name="del" size="5" id="del">
  <input type="button" onclick="cookieDel()" value="쿠키에서 삭제하기">
  <hr>
  <input type="button" onclick="pcodeView()" value="쿠키 내용 보기">
  <div id="aa"></div>
  <input type="button" onclick="pcodeDel()" value="특정쿠키변수 삭제">
  
</body>
</html>
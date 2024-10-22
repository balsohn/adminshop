<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <Script>
 function textMethod1()
 {
  	var str=document.getElementById('aa').innerText;
  	alert(str);
 }
  function textMethod2()
 {
  	var str=document.getElementById('aa').innerHTML;
  	alert(str);
 }
 
  function textMethod3()
 {
  	var str=document.getElementById('bb').innerText="<b>즐거운</b>월요일<s>하하하</s>";
 }
 
  function textMethod4()
 {
  	var str=document.getElementById('bb').innerHTML="<b>즐거운</b>월요일<s>하하하</s>";
 }
 


</script>
</head>
<body><!-- jsChul44.jsp -->


	<input type="button" value="id='aa'를 innerText" onclick="textMethod1()">
	<input type="button" value="id='aa'를 innerHTML" onclick="textMethod2()">
	<hr>
	
	<input type="button" value="innerText로 값주기" onclick="textMethod3()">
    <input type="button" value="innerHTML로 값주기" onclick="textMethod4()">
    <div id="bb"></div>

	<hr>
	<div id="aa"><b>오늘은</b> <s>힘든 </s>하루다 </div>
	
	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <style>
  section {
      width:1000px;
      height:600px;
      margin:auto;
   }
   section div {
      text-align:center;
      margin-top:10px;
   }
   section input[type=text] {
      width:500px;
      height:28px;
      border:1px solid green;
      outline:none;
   } 
   section input[type=password] {
      width:500px;
      height:28px;
      border:1px solid green;
      outline:none;
   } 
   section  textarea {
      width:500px;
      height:200px;
      border:1px solid green;
      outline:none;
   } 

   section input[type=button] {
      width:250px;
      height:30px;
      background:green;
      color:white;
      border:1px solid green;
   } 
   
   section  input[type=submit] {
      width:506px;
      height:30px;
      background:green;
      color:white;
      border:1px solid green;
   } 
  </style>
  <script>
  		var n=1;
  	function add() {
  		var addDiv=document.createElement("div");
  		var input=document.createElement("input");
  		addDiv.id="fname"+n;
  		input.type="file";
  		input.name="fname"+n;
  		input.className="file";
  		addDiv.appendChild(input);
  		document.getElementById("one").appendChild(addDiv);
  		
  		n++;
  	}
  	
  	function del() {
  		if(n!=1){
  		n--;
  		document.getElementById("fname"+n).remove();
  			
  		}
  	}
  	
  	function check() {
  		var delImg="";
  		var safeImg="";
  		
  		var chk=document.getElementsByClassName("chk");
  		for(i=0;i<chk.length;i++) {
  			if(chk[i].checked) {
  				delImg+=chk[i].value+"/";
  			} else {
  				safeImg+=chk[i].value+"/";
  			}
  		}
  		
  		document.uform.delImg.value=delImg;
  		document.uform.safeImg.value=safeImg;
  		
  		alert(delImg+"\n"+safeImg);
  		
  		return true;
  	}
  </script>
</head>
<body> <!-- write.jsp -->
 <section>
  <form name="uform" method="post" action="updateOk" enctype="multipart/form-data" onsubmit="return check()">
  	<input type="hidden" name="delImg">
  	<input type="hidden" name="safeImg">
  	<input type="hidden" name="id" value="${tdto.id }">
    <h3 align="center"> 여행 후기 등록</h3>
    <div> <input type="text" name="title" placeholder="제 목" value="${tdto.title}"> </div>
    <div> <input type="text" name="name" placeholder="이 름" value="${tdto.name }"> </div>
    <div> <input type="password" name="pwd" placeholder="비밀번호"> </div>
    <div> <textarea name="content">${tdto.content }</textarea> </div>
    <div>	
    	<c:forEach items="${tdto.fnames}" var="fname">
    		<img src="static/file/${fname}" width="100" height="70">
    		<input type="checkbox" class="chk" name="chk" value="${fname }">
    	</c:forEach>
    </div>
    
    <div> <!-- 파일 추가 버튼 -->
      <input type="button" value="추가" onclick="add()">
      <input type="button" value="삭제" onclick="del()">
    </div>
    <div> <!-- 폼태그 -->
      <div class="one" id="one"> <input type="file" name="fname0" class="file"> </div>
    </div>
    <div> <input type="submit" value="후기등록"> </div>
  </form>
 </section>
</body>
</html>











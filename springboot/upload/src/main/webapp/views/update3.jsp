<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
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
      height:34px;
      background:green;
      color:white;
      border:1px solid green;
   } 
  </style>
  <script>
   function srcView()
   {
	   document.getElementById("src").innerText=document.getElementById("outer").innerHTML;
   }

   function add()
   {
	   // name의 fname뒤에 붙는 숫자를 만들기 위해 class="file"의 length를 구하기
	   var len=document.getElementsByClassName("file").length;
	   
	   // 추가할 코드를 복사한다.
	   var inner=document.getElementById("one").cloneNode(true); // 복사본
	   // inner.setAttribute("name","fname"+len); // p태그이므로 불가능  
	   // 복사본을 id="outer"요소의 뒤에 추가
	   document.getElementById("outer").appendChild(inner);
	   
	   // class="file"인 요소에서 방금 추가된 요소의 name을 "fname"+len
       document.getElementsByClassName("file")[len].name="fname"+len;
	   // 추가되는 요소가 첫번째 요소이므로 값이 있을경우에 대비해서 value를 비운다
	   document.getElementsByClassName("file")[len].value="";
   }
   function del()
   {
	   // class="one" 중에서 가장 뒤에 있는 요소를 지운다
	   var len=document.getElementsByClassName("one").length;
	   
	   if(len>1)
	     document.getElementsByClassName("one")[len-1].remove();
   }
   
   function check()
   {
	   var delImg=""; // 삭제할 그림파일명
	   var safeImg=""; // 보존할 그림파일명
	   var safeOimg=""; // 보존할 원본그림파일명
	   
	   // 체크박스를 체크하여 각각의 그림을 두 변수중에 하나에 추가
	   var chk=document.getElementsByClassName("chk");
	   
	   for(i=0;i<chk.length;i++)
	   {
		   if(chk[i].checked)
		   {
			   delImg=delImg+chk[i].value+"/";
		   }
		   else
		   {
			   safeImg=safeImg+chk[i].value+"/";
			   //safeOimg=safeOimg+ofnameArray[i]+"/";
			   safeOimg=safeOimg+document.getElementsByClassName("ori")[i].value+"/";
		   }
	   }	   
	   
	   document.uform.delImg.value=delImg;
	   document.uform.safeImg.value=safeImg;
	   document.uform.safeOimg.value=safeOimg;
	   //alert(delImg+"\n"+safeImg);
	   //alert(safeImg+" : "+safeOimg);
	   return true;
   }
   var ofnameArray=[${ofnameArray}];
  </script>
</head>
<body> <!-- write.jsp -->
 <!-- <input type="button" onclick="srcView()" value="소스보기">
 <div id="src"></div> -->
 <section>
  <form name="uform" method="post" action="updateOk" enctype="multipart/form-data" onsubmit="return check()">
    <input type="hidden" name="delImg">
    <input type="hidden" name="safeImg">
    <input type="hidden" name="safeOimg"> <!-- 보존하는 파일의 원본이름들 -->
    <input type="hidden" name="id" value="${tdto.id}">
    <h3 align="center"> 여행 후기 등록</h3>
    <div> <input type="text" name="title" placeholder="제 목" value="${tdto.title}"> </div>
    <div> <input type="text" name="name" placeholder="이 름" value="${tdto.name}"> </div>
    <div> <input type="password" name="pwd" placeholder="비밀번호"> </div>
    <div> <textarea name="content">${tdto.content}</textarea> </div>
    <div> <!-- 업로드된 그림파일 보이기 -->
      <h4 align="center"> 삭제할 그림을 체크하세요 </h4>
      <c:forEach items="${tdto.fnames}" var="fname" varStatus="sts">
        <img src="static/file/${fname}" width="100" height="70">
        <input type="checkbox" class="chk" name="chk" value="${fname}">
        <input type="hidden" class="ori" value="${tdto.ofnames[sts.index]}">
      </c:forEach>
    </div>
    <div> <!-- 파일 추가 버튼 -->
      <input type="button" value="추가" onclick="add()">
      <input type="button" value="삭제" onclick="del()">
    </div>
    <div id="outer"> <!-- 폼태그 -->
      <p id="one" class="one"> <input type="file" name="fname0" class="file"> </p>
    </div>
    <div> <input type="submit" value="후기수정"> </div>
  </form>
 </section>
</body>
</html>











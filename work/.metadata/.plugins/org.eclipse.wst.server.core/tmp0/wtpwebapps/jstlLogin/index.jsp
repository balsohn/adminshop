<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>         
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <style>
   body {
      margin:0px;
   }
   #outer {
      width:100%;
      height:45px;
      background:#5f007f;
   }
   #first {
      width:1100px;
      height:45px;
      background:#5f007f;
      margin:auto;
   }
   #first #left {
      width:1040px;
      height:45px;
      display:inline-block;
      color:white;
      text-align:center;
      line-height:45px;
   }
   #first #right {
      width:54px;
      height:45px;
      display:inline-block;
      line-height:45px;
      color:#eeeeee;
      font-size:18px;
   }
   #second {
      width:1100px;
      height:45px;
      margin:auto;
      line-height:45px;
      text-align:right;
   }
   #third {
      width:1100px;
      height:70px;
      margin:auto;
   }
   #third #left {
      display:inline-block;
      width:300px;
      height:70px;
      line-height:70px;
      text-align:left;
   }
   #third #left span {
      font-size:19px;
      font-weight:900;
   }
   #third #left #a1 {
      color:#5f007f;
   } 
   #third #left #a2 {
      color:#dddddd;
   }
   #third #left #a3 {
      color:#dddddd;
   }
   #third #left #a3:hover {
      color:#5f007f;
   }
   #third #center {
      display:inline-block;
      width:580px;
      height:70px;
      line-height:70px;
      text-align:center;
   }
   #third #center #search {
      width:400px;
      height:50px;
      border:1px solid #5f007f;
      line-height:50px;
      border-radius:10px;
   }
   #third #center #search #text {
      width:300px;
      border:none;
      outline:none;
   }
   #third #center #search #xbtn {
      visibility:hidden;
   }
   #third #right {
      display:inline-block;
      width:200px;
      height:70px;
      line-height:70px;
      text-align:right;
   }
   
   #fourth {
      width:1100px;
      height:50px;
      margin:auto;
   }
   #fourth #menu { /* ul태그 */
      padding-left:0px;
   }
   #fourth #menu li {
      display:inline-block;
      width:150px;
      height:50px;
      text-align:center;
      line-height:50px;
      /*  border:1px solid black; */
   }
   #fourth #menu li:first-child {
      width:240px;
      text-align:left;
   }
   #fourth #menu li:last-child {
      width:220px;
      text-align:right;
   }
   #fourth #menu li span {
      border:1px solid #cccccc;
      padding:3px;
      padding-left:10px;
      padding-right:10px;
      border-radius:12px;
   }
   #fourth #menu li span b{
      color:#5f007f;
   }
   #fifth {
      width:1707px;
      height:334px;
      margin:auto;
   }
   #sixth {
      width:1100px;
      height:60px;
      margin:auto;
      text-align:center;
      margin-top:100px;
   }
   #sixth #up {
      font-size:26px;
   }
   #sixth #down {
      font-size:15px;
      margin-top:10px;
      color:#bbbbbb;
   }
   #seventh {
      width:1100px;
      margin:auto;
      margin-top:40px;
   }
   #seventh button {
      width:223px; 
      background:white;  
      border:1px solid #cccccc;
   }
   #seventh table #title {
      width:223px;
      color:#555555;
   }
   #seventh table s {
      color:#dddddd;
      font-size:14px;
   }
   #seventh table #per {
      color:red;
      font-weight:900;
   }
   #seventh table #pri {
      font-weight:900;
   }
 </style>
 <script>
   function check(my)
   {
	   if(my.value=="")
	   {
		   document.getElementById("xbtn").style.visibility="hidden";
	   }	
	   else
	   {
		   document.getElementById("xbtn").style.visibility="visible";
	   }	   
   }
   function hide()
   {
	   document.getElementById("text").value="";
	   document.getElementById("xbtn").style.visibility="hidden";
   }
 </script>
</head>
<%@page import="login.Login" %>
<%
    Login.getName(request,session);
%>
<body> <!-- index.jsp : (웹서버 기본문서 : index.html, index.htm , index.jsp -->
   <div id="outer">
     <div id="first">
       <div id="left"> 지금 가입하고, <b>1만원 할인 쿠폰</b> 받아가세요!</div>
       <div id="right"> X </div>
     </div>  
   </div>
   <div id="second">
    <c:if test="${userid==null}">
     <a href="member.jsp"> 회원가입 </a> | <a href="login.jsp"> 로그인 </a>
    </c:if>
    <c:if test="${userid!=null}"> 
     <a href="memberView.jsp"> ${name}님 </a> | <a href="logout.jsp"> 로그아웃 </a>  
    </c:if> 
     | 고객센터▼
   </div>
   
   <div id="third">
     <div id="left"> 
       <img src="logo.png" valign="middle"> <span id="a1">마켓컬리</span> <span id="a2"> | </span> <span id="a3">뷰티컬리</span>
     </div> <!-- 로고 , 글자  -->
     <div id="center"> 
       <div id="search">
          <input type="text" id="text" placeholder="검색어를 입력하세요" onkeyup="check(this)">
          <img src="x.png" valign="middle" id="xbtn" onclick="hide()">
          <img src="search.png" valign="middle">
       </div> 
     </div> <!-- 검색창 -->
     <div id="right"> <img src="icon.png" valign="middle"> </div> <!-- 링크 아이콘 -->
   </div>
   
   <div id="fourth">
     <ul id="menu">
       <li> 카테고리 </li>
       <li> 신상품 </li>
       <li> 베스트 </li>
       <li> 알뜰쇼핑 </li>
       <li> 특가/혜택 </li>
       <li> <span> <b>샛별·하루</b>배송안내 </span> </li>
     </ul>
   </div>
   
   <div id="fifth">
      <img src="slide.png">
   </div>
   <div id="sixth">
     <div id="up"> 🎂9주년, 이것만 사도 성공👇 > </div> 
     <div id="down"> 지금 인기 있는 벌쓰위크 대표특가를 확인해보세요! </div>
   </div>
   <div id="seventh">
      <table width="1100" align="center">
        <tr valign="top">
          <td>
            <div> <img src="p1.png"> </div>
            <button>
              <svg xmlns="http://www.w3.org/2000/svg" height="20px" viewBox="0 -960 960 960" width="20px" fill="#5f6368"><path d="M278.4-144q-35.69 0-61.04-25.43Q192-194.86 192-230v-395l-49-119H48v-72h144l59 144h589q14 0 20.5 11.5t.5 23.5L753-406q48 6 79.5 42.94 31.5 36.93 31.5 87.13 0 54.93-38.5 93.43Q787-144 732.22-144q-55.72 0-93.97-38.69Q600-221.39 600-276.13q0-18.87 5-36.87 5-18 16-34l-151-17-121 182q-11.8 18.1-30.4 28.05Q300-144 278.4-144ZM677-413l88-187H280l45 110q8 18 23.39 30.1Q363.78-447.79 384-446l293 33ZM277-216q2.67 0 12-6l101-150q-41-4-75-24.5T264-454v224.39q0 5.61 4 9.61 4 4 9 4Zm455 0q25 0 42.5-17.5T792-276q0-25-17.5-42.5T731.51-336q-24.51 0-42.01 17.5Q672-301 672-275.51q0 24.51 17.5 42.01Q707-216 732-216Zm-55-197-293-33 293 33Z"/></svg> 담기
            </button>
            <div id="title"> [사미헌]갈비탕</div>  
            <div id="oldprice"> <s>13,000원</s> </div> 
            <div id="price"> <span id="per">10%</span> <span id="pri">11,700원</span> </div>
          </td>
          <td>
            <div> <img src="p2.png"> </div>
            <button>
              <svg xmlns="http://www.w3.org/2000/svg" height="20px" viewBox="0 -960 960 960" width="20px" fill="#5f6368"><path d="M278.4-144q-35.69 0-61.04-25.43Q192-194.86 192-230v-395l-49-119H48v-72h144l59 144h589q14 0 20.5 11.5t.5 23.5L753-406q48 6 79.5 42.94 31.5 36.93 31.5 87.13 0 54.93-38.5 93.43Q787-144 732.22-144q-55.72 0-93.97-38.69Q600-221.39 600-276.13q0-18.87 5-36.87 5-18 16-34l-151-17-121 182q-11.8 18.1-30.4 28.05Q300-144 278.4-144ZM677-413l88-187H280l45 110q8 18 23.39 30.1Q363.78-447.79 384-446l293 33ZM277-216q2.67 0 12-6l101-150q-41-4-75-24.5T264-454v224.39q0 5.61 4 9.61 4 4 9 4Zm455 0q25 0 42.5-17.5T792-276q0-25-17.5-42.5T731.51-336q-24.51 0-42.01 17.5Q672-301 672-275.51q0 24.51 17.5 42.01Q707-216 732-216Zm-55-197-293-33 293 33Z"/></svg> 담기
            </button>
            <div id="title">[하코야]살얼음 동동 냉메밀 소바2인분</div>   
            <div id="oldprice"> <s>9,9000원</s> </div> 
            <div id="price"> <span id="per">19%</span> <span id="pri">7,990원</span> </div>
          </td>
          <td> 
            <div> <img src="p3.png"> </div>  
            <button>
              <svg xmlns="http://www.w3.org/2000/svg" height="20px" viewBox="0 -960 960 960" width="20px" fill="#5f6368"><path d="M278.4-144q-35.69 0-61.04-25.43Q192-194.86 192-230v-395l-49-119H48v-72h144l59 144h589q14 0 20.5 11.5t.5 23.5L753-406q48 6 79.5 42.94 31.5 36.93 31.5 87.13 0 54.93-38.5 93.43Q787-144 732.22-144q-55.72 0-93.97-38.69Q600-221.39 600-276.13q0-18.87 5-36.87 5-18 16-34l-151-17-121 182q-11.8 18.1-30.4 28.05Q300-144 278.4-144ZM677-413l88-187H280l45 110q8 18 23.39 30.1Q363.78-447.79 384-446l293 33ZM277-216q2.67 0 12-6l101-150q-41-4-75-24.5T264-454v224.39q0 5.61 4 9.61 4 4 9 4Zm455 0q25 0 42.5-17.5T792-276q0-25-17.5-42.5T731.51-336q-24.51 0-42.01 17.5Q672-301 672-275.51q0 24.51 17.5 42.01Q707-216 732-216Zm-55-197-293-33 293 33Z"/></svg> 담기
            </button> 
            <div id="title"> [KF365]훈제오리 150g 2pk</div>
            <div id="oldprice"> <s>10,500원</s> </div> 
            <div id="price"> <span id="per">33%</span> <span id="pri">6,990원</span> </div>
          </td>
          <td>
            <div> <img src="p4.png"> </div>  
            <button>
              <svg xmlns="http://www.w3.org/2000/svg" height="20px" viewBox="0 -960 960 960" width="20px" fill="#5f6368"><path d="M278.4-144q-35.69 0-61.04-25.43Q192-194.86 192-230v-395l-49-119H48v-72h144l59 144h589q14 0 20.5 11.5t.5 23.5L753-406q48 6 79.5 42.94 31.5 36.93 31.5 87.13 0 54.93-38.5 93.43Q787-144 732.22-144q-55.72 0-93.97-38.69Q600-221.39 600-276.13q0-18.87 5-36.87 5-18 16-34l-151-17-121 182q-11.8 18.1-30.4 28.05Q300-144 278.4-144ZM677-413l88-187H280l45 110q8 18 23.39 30.1Q363.78-447.79 384-446l293 33ZM277-216q2.67 0 12-6l101-150q-41-4-75-24.5T264-454v224.39q0 5.61 4 9.61 4 4 9 4Zm455 0q25 0 42.5-17.5T792-276q0-25-17.5-42.5T731.51-336q-24.51 0-42.01 17.5Q672-301 672-275.51q0 24.51 17.5 42.01Q707-216 732-216Zm-55-197-293-33 293 33Z"/></svg> 담기
            </button> 
            <div id="title">[우주]프리미엄 손질 생새우살 200g(냉동)(26/30사이즈)</div>
            <div id="oldprice"> <s>8,400원</s> </div> 
            <div id="price"> <span id="per">29%</span> <span id="pri">5,900원</span> </div>
          </td>
      </table>
   </div>
   
   
   
  
</body>
</html>
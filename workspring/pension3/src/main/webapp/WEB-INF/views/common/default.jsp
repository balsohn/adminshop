<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	@font-face {
    font-family: 'GmarketSansMedium';
    src: url('https://fastly.jsdelivr.net/gh/projectnoonnu/noonfonts_2001@1.1/GmarketSansMedium.woff') format('woff');
    font-weight: normal;
    font-style: normal;
	}
   body {
      margin:0px;
   }
   #outer {
      width:100%;
      height:40px;
      background:green;
   }
   #outer #first {
      width:1000px;
      height:40px;
      line-height:40px;
      margin:auto;
      background:green;
      text-align:center;
      color:white;
      font-family: 'GmarketSansMedium';
   }
   #outer #first #left {
      width:960px;
      float:left;
   }
   #outer #first #right {
      width:40px;
      float:right;
   }
   header {
      width:1000px;
      height:60px;
      line-height:60px;
      margin:auto;
      font-family: 'GmarketSansMedium';
      
   }
   header #left {
      width:100px;
      height:60px;
      display:inline-block;
      text-align:center;
      
   }
   header #right {
      width:890px;
      height:60px;
      display:inline-block;
      text-align:right;
   }
   nav {
      width:1000px;
      height:50px;
      line-height:50px;
      margin:auto;
      font-family: 'GmarketSansMedium';
   }
   nav #main {
      padding-left:0px;
      margin-left:30px;
   }
   nav #main > li {
      display:inline-block;
      list-style-type:none;
      width:150px;
      height:50px;
      line-height:50px;
      text-align:center;
      font-weight:900;
      position:relative;
   }
   nav #main > li > .menu {
      padding-left:0px;
      position:absolute;
      left:0px;
      top:48px;
      background:white;
      visibility:hidden;
   }
   nav #main > li > .menu > li {
      list-style-type:none;
      width:150px;
      height:35px;
      line-height:35px;
   }
   footer {
      width:1000px;
      height:120px;
      margin:auto;
      background:black;
      color:white;
   }
 </style>
 <script>
 	function viewMenu(n) {
 		document.getElementsByClassName("menu")[n].style.visibility="visible";
 		
 	}
 	function hideMenu(n) {
 		document.getElementsByClassName("menu")[n].style.visibility="hidden";
 	
 	}
 </script>
	<decorator:head/>
</head>
<body>
	<div id="outer">
		<div id="first"> 
			<div id="left">광고성 글</div>
			<div id="right">X</div> 
		</div>
	</div>
	<header> 
		<div id="left">로고</div>
		<c:if test="${empty userid}">
		<div id="right"> 
			<a href="../member/login">로그인</a> 
			<a href="../member/member">회원가입</a>
			<a href="">문의하기</a>
		</div> 
		</c:if>
		<c:if test="${!empty userid}">
		<div id="right"> 
			<a href="">${userid} 님</a> 
			<a href="../member/logout">로그아웃</a>
			<a href="">문의하기</a>
		</div> 
		</c:if>
	</header>
	<nav>
	<ul id="main">
		<li onmouseover="viewMenu(0)" onmouseout="hideMenu(0)"> 펜션소개
			<ul class="menu">
				<li> 펜션지기 </li>
				<li> 오시는길 </li>
				<li> ?????? </li>
			</ul>
		</li>
		<li onmouseover="viewMenu(1)" onmouseout="hideMenu(1)"> 주변볼거리 
			<ul class="menu">
				<li> 호수공원 </li>
				<li> 킨 텍 스 </li>
				<li> 한류월드 </li>
				<li> 서 오 능 </li>
			</ul>
		</li>
		<li onmouseover="viewMenu(2)" onmouseout="hideMenu(2)"> 주변맛집 
			<ul class="menu">
				<li> 버거킹 </li>
				<li> 서가원 </li>
				<li> 대동관 </li>
				<li> 김밥천국 </li>
			</ul>
		</li>
		<li onmouseover="viewMenu(3)" onmouseout="hideMenu(3)"> 객실현황 
			<ul class="menu">
				<li> 자작나무 </li>
				<li> 느티나무 </li>
				<li> 계수나무 </li>
				<li> 은행나무 </li>
				<li> 유자나무 </li>
				<li> 잣나무 </li>
			</ul>
		</li>
		<li onmouseover="viewMenu(4)" onmouseout="hideMenu(4)"> 예약관련 
			<ul class="menu">
				<li>예약 안내</li>
				<li>실시간 예약</li>
			</ul>
		</li>
		<li onmouseover="viewMenu(5)" onmouseout="hideMenu(5)"> 커뮤니티
			<ul class="menu">
				<li>공지사항</li>
				<li>여행후기</li>
				<li>회원게시판</li>
				<li>문의하기</li>
			</ul>
		</li>
	</ul>
	</nav>
	
	<decorator:body/>
	
	
	
<footer> 펜션 정보 </footer>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }
    .container {width:1000px; margin:auto;}
    .first {height:40px; background:purple; width:100%; justify-content:center;
            display:flex; align-items: center; color: white;}
    .second {display:flex; justify-content: space-between; margin:10px 20px;}
    .third {width:1400px; height:400px;transform:translate(-200px);}
    .fourth {display:flex; justify-content: space-around;}
    .fourth > div {border:1px solid black; border-radius: 3px; height:150px;
                    width: 25%; margin:20px;}
    .fifth {width:100%; height:200px; background:black; margin-top:50px;}
    
    #hidemenu {
        position: relative;
        display: inline-block;
    }
    #myMenu {
        display: none;
        position: absolute;
        background-color: white;
        border: 1px solid black;
        z-index: 1;
        width:150px;
        transform: translate(-50%);
        left:50%;
    }
    #myMenu .submenu {
        padding: 8px 16px;
        cursor: pointer;
    }
    #myMenu .submenu:hover {
        background-color: #ddd;
    }
</style>
<script>
    function view() {
        document.getElementById("myMenu").style.display = "block";
    }
    function hide() {
        document.getElementById("myMenu").style.display = "none";
    }
</script>
</head>
<body>
    <div class="first">이곳은 알림창입니다.</div>
    <div class="container">
        <div class="second">
            <div><img src="resources/aaa2.png" alt="Logo" width="100" height="100"></div>
            <div>
                <a href="member">회원가입</a>
                <a href="login">로그인</a>
                <span id="hidemenu" onmouseover="view()" onmouseout="hide()">고객센터
                    <div id="myMenu">
                        <div class="submenu">자주 묻는질문</div>
                        <div class="submenu">1:1질문</div>
                        <div class="submenu">고객의소리</div>
                    </div>
                </span>
            </div>
        </div>
        <div class="third">
            <div><img src="resources/asdf.png" alt="Main Content Image"></div>
        </div>
        <div class="fourth">
            <div>출석체크</div>
            <div>자유게시판</div>
            <div>자기소개</div>
        </div>
    </div>
    <div class="fifth"></div>
</body>
</html>

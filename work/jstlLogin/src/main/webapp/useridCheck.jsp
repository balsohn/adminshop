<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="login.Login" %>  
 
<%
    // useridCheck.jsp
    
    // 사용자가 값을 입력하면 해당 사용자 아이디가 사용되고 있는지 확인
    // 기존의 회원테이블에 존재하느냐
    
    Login login=new Login();
    login.useridCheck(request);
%>
${cnt}
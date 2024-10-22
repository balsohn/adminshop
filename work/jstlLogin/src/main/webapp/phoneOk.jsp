<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="login.Login" %>    
<%
    // emailOk.jsp
    // 폼에 입력된 이메일로 변경한 후 => memberView.jsp이동
    
    Login login=new Login();
    login.phoneOk(request,session,response);
%>
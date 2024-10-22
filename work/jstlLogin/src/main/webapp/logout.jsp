<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="login.Login" %>    
<%
    // logout.jsp
    Login login=new Login();
    login.logout(session,response);
%>
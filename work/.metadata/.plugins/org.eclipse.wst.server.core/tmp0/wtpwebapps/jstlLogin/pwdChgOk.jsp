<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="login.Login" %>
<%
   // pwdChgOk.jsp
   
   // 기존의 비밀번호를 새 비밀번호로 변경
   Login login=new Login();
   login.pwdChgOk(request,session,response);
  
   
   
%>
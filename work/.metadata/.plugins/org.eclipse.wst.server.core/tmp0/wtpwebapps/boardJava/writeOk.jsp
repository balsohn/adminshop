<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import="board.Board" %>  
<%
    // writeOk.jsp
    // 폼에 입력된 값을 board테이블에 저장
    
    Board board=new Board();
    board.writeOk(request,response);
    
%>





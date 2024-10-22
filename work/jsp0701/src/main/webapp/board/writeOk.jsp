<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="board.*" %>    
<%
    // writeOk.jsp
    // 폼에 입력된 값을 board테이블에 저장
    
    // DB연결
    Board board=new Board();
	board.writeOk(request,response,"board");
%>

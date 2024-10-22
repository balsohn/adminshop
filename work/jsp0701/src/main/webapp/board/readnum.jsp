<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %> 
<%@page import="board.*" %>
<%
    // readnum.jsp 조회수 증가시킨후 content.jsp로 이동
    
    // DB연결
    Board board=new Board();
	board.readnum(request,response);
%>
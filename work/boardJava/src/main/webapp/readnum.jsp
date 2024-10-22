<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="board.Board" %> 
<%
    // readnum.jsp 조회수 증가시킨후 content.jsp로 이동
    Board board=new Board();
    board.readnum(request,response);
    
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>    
<%@page import="board.Board" %>
<%
    // delete.jsp
    
    Board board=new Board();
    board.delete(request,response);
    
%>
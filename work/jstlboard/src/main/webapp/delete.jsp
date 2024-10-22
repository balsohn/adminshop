<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>  
<%@page import="jstlboard.*" %>
<%
    // delete.jsp
    
    // DB연결
    Board board=new Board();
	board.delete(request, response);
    
    
%>
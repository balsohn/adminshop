<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="jstlboard.*"%>
<%
	Board board=new Board();
	board.updateOk(request, response);
%>
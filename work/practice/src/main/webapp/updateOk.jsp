<%@page import="practice.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Board bd=new Board();
	bd.updateOk(request,response);
%>
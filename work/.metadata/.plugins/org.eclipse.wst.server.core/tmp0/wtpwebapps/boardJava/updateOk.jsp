<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="board.Board" %>    
<%
    //updateOk.jsp
    // 폼에 입력한 값으로 update(수정) 후에 content
    
    Board board=new Board();
    board.updateOk(request, response);

    
%>


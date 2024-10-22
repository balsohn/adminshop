<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
String path=request.getRealPath("/file");
out.print(path);
%>
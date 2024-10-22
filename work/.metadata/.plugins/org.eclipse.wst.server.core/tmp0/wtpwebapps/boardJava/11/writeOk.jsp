<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>    
<%
    // writeOk.jsp
    // 폼에 입력된 값을 board테이블에 저장
    
    // DB연결
    Class.forName("com.mysql.jdbc.Driver"); // 라이브러리를 찾아라
    String db="jdbc:mysql://localhost:3306/second";
    Connection conn=DriverManager.getConnection(db,"root","1234");
    
    // 쿼리문에 들어갈 값이 있다면 받아야된다 request
    request.setCharacterEncoding("utf-8");
    String title="페이지 테스트입니다 ";
    String[] names={"홍길동","배트맨","뽀로로","차탄","나그네","강감찬","을지문덕","이순신","슈퍼맨","세종대왕"};
    String pwd="1234";
    String content="그냥 연습이지요";
     
    // 쿼리문생성
    String sql="insert into pageboard(title,name,pwd,content,writeday) values(?,?,?,?,now())";
    
    PreparedStatement pstmt=null;
    for(int i=56;i<2456;i++)
    {
    	int n=(int)(Math.random()*10);
    	
	    // 심부름꾼생성 + setter
	    pstmt=conn.prepareStatement(sql);
	    pstmt.setString(1, title+i);
	    pstmt.setString(2, names[n]);
	    pstmt.setString(3, pwd);
	    pstmt.setString(4, content);
	    
	    // 쿼리문 실행
	    pstmt.executeUpdate();
    }
    // 닫기
    pstmt.close();
    conn.close();
    
    // 이동
    response.sendRedirect("list.jsp");
%>





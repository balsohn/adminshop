<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>    
<%
    // useridCheck.jsp
    
    // 사용자가 값을 입력하면 해당 사용자 아이디가 사용되고 있는지 확인
    // 기존의 회원테이블에 존재하느냐
    
    // DB연결
    Class.forName("com.mysql.jdbc.Driver");  
	String db="jdbc:mysql://localhost:3306/second";
	Connection conn=DriverManager.getConnection(db,"root","1234");
	
    // 아이디를 가져오기
    String userid=request.getParameter("userid");
    
    // 쿼리문 생성
    String sql="select * from member where userid=?";
    
    // 심부름꾼 생성 + setter
    PreparedStatement pstmt=conn.prepareStatement(sql);
    pstmt.setString(1, userid);
    
    out.print(pstmt.toString());
    
    // 쿼리문 실행
    ResultSet rs=pstmt.executeQuery();
    
    // 결과출력
    if(rs.next())
    {
    	out.print("존재하는 아이디");
    }
    else
    {
    	out.print("사용가능 아이디");
    }
    
    // 닫기
    rs.close();
    pstmt.close();
    conn.close();
%>



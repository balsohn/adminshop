package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 게시판에서 실행되던 자바코드를 현재 클래스에 추가
public class Board {
    // 속성과 메소드로 구성
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public void init() throws Exception
	{
		 // DB연결
	    Class.forName("com.mysql.jdbc.Driver"); // 라이브러리를 찾아라
	    String db="jdbc:mysql://localhost:3306/first";
	    conn=DriverManager.getConnection(db,"root","1234");
	}
	public ResultSet list() throws Exception
	{
		  
	    // 쿼리문 생성
	    String sql="select * from board order by id desc";
	    
	    // 심부름꾼 생성 + setter
	    pstmt=conn.prepareStatement(sql);
	    
	    // 쿼리문 실행
	    rs=pstmt.executeQuery();
	    
	    return rs;
	}
	
	public void allClose() throws Exception
	{
		rs.close();
		pstmt.close();
		conn.close();
	}
	
	public void writeOk(HttpServletRequest request,
			HttpServletResponse response) throws Exception
	{
		    
	    // 쿼리문에 들어갈 값이 있다면 받아야된다 request
	    request.setCharacterEncoding("utf-8");
	    String title=request.getParameter("title");
	    String name=request.getParameter("name");
	    String pwd=request.getParameter("pwd");
	    String content=request.getParameter("content");
	    
	    // 쿼리문생성
	    String sql="insert into board(title,name,pwd,content,writeday) values(?,?,?,?,now())";
	    
	    // 심부름꾼생성 + setter
	    pstmt=conn.prepareStatement(sql);
	    pstmt.setString(1, title);
	    pstmt.setString(2, name);
	    pstmt.setString(3, pwd);
	    pstmt.setString(4, content);
	    
	    // 쿼리문 실행
	    pstmt.executeUpdate();
	    
	    // 닫기
	    pstmt.close();
	    conn.close();
	    
	    // 이동
	    response.sendRedirect("list.jsp");
	}
	
	public void readnum(HttpServletRequest request,
			HttpServletResponse response) throws Exception
	{
		
	    // id값 읽어오기
	    String id=request.getParameter("id");
	    
	    // 쿼리문 작성
	    String sql="update board set readnum=readnum+1 where id=?";
	    
	    // 심부름꾼 작성 + setter
	    pstmt=conn.prepareStatement(sql);
	    pstmt.setString(1, id);
	    
	    // 쿼리문 실행
	    pstmt.executeUpdate();
	    
	    // 닫기
	    pstmt.close();
	    conn.close();
	    
	    // 이동 => content
	    response.sendRedirect("content.jsp?id="+id);
	}
	
	public ResultSet content(HttpServletRequest request) throws Exception
	{
		// 쿼리문에 필요한 값 읽어오기
	    String id=request.getParameter("id");
	        
	    // 쿼리문 생성
	    String sql="select * from board where id=?";
	    
	    // 심부름꾼 생성 + setter
	    pstmt=conn.prepareStatement(sql);
	    pstmt.setString(1, id);
	    
	    // 쿼리문 실행
	    rs=pstmt.executeQuery();
	    rs.next();
	    
	    return rs;
	    
	}
	
	public void delete(HttpServletRequest request,
			HttpServletResponse response) throws Exception
	{
		
	    // id값
	    String id=request.getParameter("id");
	    String pwd=request.getParameter("pwd");
	    
	    // 테이블의 비밀번호가 맞는지를 검사하기
	    String sql2="select count(*) as cnt from board where id=? and pwd=?"; 
	    PreparedStatement pstmt2=conn.prepareStatement(sql2);
	    pstmt2.setString(1, id);
	    pstmt2.setString(2, pwd);
	    ResultSet rs=pstmt2.executeQuery();
	    rs.next();
	    int cnt=rs.getInt("cnt");
	    
	    // 비밀번호체크
	    if(cnt==1)
	    {
	    	// 쿼리문 생성
	        String sql="delete from board where id=?";
	        
	        // 심부름꾼 생성 + setter
	        PreparedStatement pstmt=conn.prepareStatement(sql);
	        pstmt.setString(1, id);
	        
	        // 쿼리문 실행
	        pstmt.executeUpdate();
	        
	        // 닫기
	        pstmt.close();
	        conn.close();
	        
	        // 이동
	        response.sendRedirect("list.jsp");
	    }
	    else // 비밀번호가 틀리면
	    {
	    	// 닫기
	    	conn.close();
	    	
	    	// 이동
	    	response.sendRedirect("content.jsp?id="+id);
	    }
	    
	}
	
	public ResultSet update(HttpServletRequest request) throws Exception
	{
			    
	    // 쿼리문에 필요한 값 읽어오기
	    String id=request.getParameter("id");
	 
	    // 쿼리문 생성
	    String sql="select * from board where id=?";
	    
	    // 심부름꾼 생성 + setter
	    pstmt=conn.prepareStatement(sql);
	    pstmt.setString(1, id);
	    
	    // 쿼리문 실행
	    rs=pstmt.executeQuery();
	    rs.next();
	    
	    return rs;
	}
	
	public void updateOk(HttpServletRequest request,
			HttpServletResponse response) throws Exception
	{
		
	    // 수정할 값
	    request.setCharacterEncoding("utf-8");
	    String id=request.getParameter("id");
	    String title=request.getParameter("title");
	    String name=request.getParameter("name");
	    String pwd=request.getParameter("pwd");
	    String content=request.getParameter("content");
	    
	    // 테이블의 비밀번호가 맞는지를 검사하기
	    String sql2="select count(*) as cnt from board where id=? and pwd=?"; 
	    PreparedStatement pstmt2=conn.prepareStatement(sql2);
	    pstmt2.setString(1, id);
	    pstmt2.setString(2, pwd);
	    ResultSet rs=pstmt2.executeQuery();
	    rs.next();
	    int cnt=rs.getInt("cnt");
	    
	    if(cnt==1)
	    {
	    	// 쿼리문 생성
	        String sql="update board set title=?, name=?, content=? where id=?";
	        
	        //  심부름꾼생성 + setter
	        pstmt=conn.prepareStatement(sql);
	        pstmt.setString(1, title);
	        pstmt.setString(2, name);
	        pstmt.setString(3, content);
	        pstmt.setString(4, id);
	        
	        // 쿼리 실행
	        pstmt.executeUpdate();
	        
	        // 닫기
	        pstmt.close();
	        conn.close();
	        
	        // 이동=> content
	        response.sendRedirect("content.jsp?id="+id);
	    }
	    else
	    {
	    	conn.close();
	    	
	    	response.sendRedirect("update.jsp?err=1&id="+id);
	    }
	}
}












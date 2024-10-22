package board;

import java.io.UnsupportedEncodingException;
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
	private static final String DB_URL="jdbc:mysql://localhost:3306/second";
    private static final String DB_USER="root";
    private static final String DB_PASSWORD="1234";
    private static final String tableName="pageboard";
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;
    private String sql="";
    
    public Board() throws Exception
    {
    	Class.forName("com.mysql.jdbc.Driver");
    	conn=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
    }
    
    
    public void closeAll() throws Exception
    {
    	if(rs!=null) rs.close();
    	if(pstmt!=null) pstmt.close();
    	if(conn!=null) conn.close();
    }
    
    public ResultSet list(HttpServletRequest request) throws Exception
    {
    	int page=request.getParameter("page")==null?1:Integer.parseInt(request.getParameter("page"));
    	int pageSize=request.getParameter("pageSize")==null?10:Integer.parseInt(request.getParameter("pageSize"));
    	
    	int index=(page-1)*pageSize;
    	int p=(page-1)/10;
    	int pstart=p*10+1;
    	int pend=pstart+9;
    	
    	// 총페이지 값을 구하기 => 변수명 뒤에 2를 붙이기
    	sql="select ceil(count(*)/"+pageSize+") as cnt from "+tableName;
    	PreparedStatement pstmt2=conn.prepareStatement(sql);
    	ResultSet rs2=pstmt2.executeQuery();
    	rs2.next();
    	int chong=rs2.getInt("cnt");
    	request.setAttribute("chong", chong);
    	if(pend>chong)
    	{
    		pend=chong;
    	}
    	request.setAttribute("pstart", pstart);
    	request.setAttribute("pend", pend);
    	request.setAttribute("page", page);
    	request.setAttribute("pageSize", pageSize);
    	
    	
    	System.out.println(page);
    	String sql="select * from "+tableName+" order by id desc limit ?,"+pageSize;
    	pstmt=conn.prepareStatement(sql);
    	pstmt.setInt(1, index);
    	rs=pstmt.executeQuery();
    	return rs;
    }
    
    
    public void writeOk(HttpServletRequest request,HttpServletResponse response) throws Exception
    {
    	
    	request.setCharacterEncoding("utf-8");
    	String title=request.getParameter("title");
	    String name=request.getParameter("name");
	    String pwd=request.getParameter("pwd");
	    String content=request.getParameter("content");
    	sql="insert into "+tableName+" (title,name,pwd,content,writeday) values (?,?,?,?,now())";
    	pstmt=conn.prepareStatement(sql);
    	pstmt.setString(1, title);
	    pstmt.setString(2, name);
	    pstmt.setString(3, pwd);
	    pstmt.setString(4, content);
	    
	    // 쿼리문 실행
	    pstmt.executeUpdate();

	    // 이동
	    response.sendRedirect("list.jsp");
    }
	
	
	
	
	
	
	public void readnum(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		
	    // id값 읽어오기
	    String id=request.getParameter("id");
	    
	    // 쿼리문 작성
	    sql="update "+tableName+" set readnum=readnum+1 where id=?";
	    
	    // 심부름꾼 작성 + setter
	    pstmt=conn.prepareStatement(sql);
	    pstmt.setString(1, id);
	    
	    // 쿼리문 실행
	    pstmt.executeUpdate();
	  
	    // 이동 => content
	    response.sendRedirect("content.jsp?id="+id);
	}
	
	public ResultSet content(HttpServletRequest request) throws Exception
	{
	    // 쿼리문에 필요한 값 읽어오기
	    String id=request.getParameter("id");
	        
	    // 쿼리문 생성
	    sql="select * from "+tableName+" where id=?";
	    
	    // 심부름꾼 생성 + setter
	    pstmt=conn.prepareStatement(sql);
	    pstmt.setString(1, id);
	    
	    // 쿼리문 실행
	    rs=pstmt.executeQuery();
	    rs.next();
	    
	    return rs;
	}
	
	public int isPwd(String id, String pwd) throws Exception
	{
		
		sql="select count(*) as cnt from "+tableName+" where id=? and pwd=?"; 
	    pstmt=conn.prepareStatement(sql);
	    pstmt.setString(1, id);
	    pstmt.setString(2, pwd);
	    rs=pstmt.executeQuery();
	    rs.next();
	    int cnt=rs.getInt("cnt");
	    
	    return cnt;
	}
	
	public void delete(HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		
	    // id값
	    String id=request.getParameter("id");
	    String pwd=request.getParameter("pwd");
	    
	    // 테이블의 비밀번호가 맞는지를 검사하기
	    int cnt=this.isPwd(id,pwd);
	    
	    // 비밀번호	체크
	    if(cnt==1)
	    {
	    	// 쿼리문 생성
	        String sql="delete from "+tableName+" where id=?";
	        
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
	    String sql="select * from "+tableName+" where id=?";
	    
	    // 심부름꾼 생성 + setter
	    pstmt=conn.prepareStatement(sql);
	    pstmt.setString(1, id);
	    
	    // 쿼리문 실행
	    rs=pstmt.executeQuery();
	    rs.next();
	    
	    return rs;
	}
	
	public void updateOk(HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		
	    // 수정할 값
	    request.setCharacterEncoding("utf-8");
	    String id=request.getParameter("id");
	    String title=request.getParameter("title");
	    String name=request.getParameter("name");
	    String pwd=request.getParameter("pwd");
	    String content=request.getParameter("content");
	    
	    // 테이블의 비밀번호가 맞는지를 검사하기
	    int cnt=this.isPwd(id, pwd);
	    
	    if(cnt==1)
	    {
	    	// 쿼리문 생성
	        sql="update "+tableName+" set title=?, name=?, content=? where id=?";
	        
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

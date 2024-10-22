package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.filters.AddDefaultCharsetFilter;

public class Board {
	
	private static final String DB_URL="jdbc:mysql://localhost:3306/third";
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
    
    public void close() throws Exception
    {
    	if(rs!=null) rs.close();
    	if(conn!=null) conn.close();
    	if(pstmt!=null) pstmt.close();
    }
    
    public void writeOk(HttpServletRequest request,HttpServletResponse response) throws Exception
    {
    	String title=request.getParameter("title");
    	String name=request.getParameter("name");
    	String pwd=request.getParameter("pwd");
    	String type=request.getParameter("type");
    	String content=request.getParameter("content");
    	
    	sql="insert into "+tableName+" (title,name,pwd,type,content,writeday) values (?,?,?,?,?,now())";
    	pstmt=conn.prepareStatement(sql);
    	pstmt.setString(1, title);
    	pstmt.setString(2, name);
    	pstmt.setString(3, pwd);
    	pstmt.setString(4, type);
    	pstmt.setString(5, content);
    	
    	pstmt.executeUpdate();
    	
    	pstmt.close();
    	conn.close();
    	
    	response.sendRedirect("list.jsp");
    }
    
    public void list(HttpServletRequest request) throws Exception
    {
    	int page=(request.getParameter("page")==null)?1:Integer.parseInt(request.getParameter("page"));
    	int index=(page-1)*10;
    	int p=(page-1)/10;
    	int pstart=p*10+1;
    	int pend=pstart+9;
    	
    	sql="select ceil(count(*)/10) as chong from "+tableName;
    	pstmt=conn.prepareStatement(sql);
    	rs=pstmt.executeQuery();
    	rs.next();
    	
    	int chong=rs.getInt("chong");
    	if(chong<pend)
    	{
    		pend=chong;
    	}
    	
    	String order=(request.getParameter("order")==null)?"id":request.getParameter("order");
    	
    	
    	sql="select * from "+tableName+" order by "+order+" desc limit ?,10";
    	pstmt=conn.prepareStatement(sql);
    	pstmt.setInt(1, index);
    	rs=pstmt.executeQuery();
    	
    	ArrayList<BoardDTO> list=new ArrayList<BoardDTO>();
    	while(rs.next())
    	{
    		String type="";
    		switch(rs.getInt("type"))
    		{
    		case 0:type="자유게시판"; break;
    		case 1:type="질답게시판"; break;
    		case 2:type="몰라"; break;
    		case 100:type="공지사항"; break;
    		}
    		
    		BoardDTO bdto=new BoardDTO();
    		bdto.setTitle(rs.getString("title"));
    		bdto.setName(rs.getString("name"));
    		bdto.setPwd(rs.getString("pwd"));
    		bdto.setType(type);
    		bdto.setContent(rs.getString("content"));
    		bdto.setId(rs.getInt("id"));
    		bdto.setReadnum(rs.getInt("readnum"));
    		bdto.setWriteday(rs.getString("writeday"));
    		
    		list.add(bdto);
    	}
    	
    	request.setAttribute("pstart", pstart);
    	request.setAttribute("pend", pend);
    	request.setAttribute("chong", chong);
    	request.setAttribute("list", list);
    	
    	rs.close();
    	conn.close();
    	pstmt.close();
    }
    
    public void content(HttpServletRequest request) throws Exception
    {
    	String id=request.getParameter("id");
    	
    	sql="select * from "+tableName+" where id=?";
    	pstmt=conn.prepareStatement(sql);
    	pstmt.setString(1, id);
    	
    	rs=pstmt.executeQuery();
    	
    	rs.next();
    	String type="";
		switch(rs.getInt("type"))
		{
		case 0:type="자유게시판"; break;
		case 1:type="질답게시판"; break;
		case 2:type="몰라"; break;
		case 100:type="공지사항"; break;
		}
    	BoardDTO bdto=new BoardDTO();
    	bdto.setTitle(rs.getString("title"));
		bdto.setName(rs.getString("name"));
		bdto.setPwd(rs.getString("pwd"));
		bdto.setType(type);
		bdto.setContent(rs.getString("content"));
		bdto.setId(rs.getInt("id"));
		bdto.setReadnum(rs.getInt("readnum"));
		bdto.setWriteday(rs.getString("writeday"));
		
		request.setAttribute("bdto", bdto);
		
    }
    
    public void update(HttpServletRequest request) throws Exception
    {
    	String id=request.getParameter("id");
    	
    	sql="select * from "+tableName+" where id=?";
    	pstmt=conn.prepareStatement(sql);
    	pstmt.setString(1, id);
    	
    	rs=pstmt.executeQuery();
    	rs.next();
    	
    	BoardDTO bdto=new BoardDTO();
    	bdto.setTitle(rs.getString("title"));
		bdto.setName(rs.getString("name"));
		bdto.setPwd(rs.getString("pwd"));
		bdto.setType(rs.getString("type"));
		bdto.setContent(rs.getString("content"));
		bdto.setId(rs.getInt("id"));
		bdto.setReadnum(rs.getInt("readnum"));
		bdto.setWriteday(rs.getString("writeday"));
		
		request.setAttribute("bdto", bdto);
    }
    
    public void updateOk(HttpServletRequest request,HttpServletResponse response) throws Exception
    {
    	String id=request.getParameter("id");
    	String title=request.getParameter("title");
    	String name=request.getParameter("name");
    	String type=request.getParameter("type");
    	String content=request.getParameter("content");
    	
    	sql="update "+tableName+" set title=?, name=?, type=?, content=? where id=?";
    	pstmt=conn.prepareStatement(sql);
    	pstmt.setString(1, title);
    	pstmt.setString(2, name);
    	pstmt.setString(3, type);
    	pstmt.setString(4, content);
    	pstmt.setString(5, id);
    	
    	pstmt.executeUpdate();
    	
    	pstmt.close();
    	conn.close();
    	
    	response.sendRedirect("content.jsp?id="+id);
    }
    
    public void delete(HttpServletRequest request,HttpServletResponse response) throws Exception
    {
    	String id=request.getParameter("id");
    	
    	sql="delete from "+tableName+" where id=?";
    	pstmt=conn.prepareStatement(sql);
    	pstmt.setString(1, id);
    	
    	pstmt.executeUpdate();
    	
    	pstmt.close();
    	conn.close();
    	
    	response.sendRedirect("list.jsp");
    }
}

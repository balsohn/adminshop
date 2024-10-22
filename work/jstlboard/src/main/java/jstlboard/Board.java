package jstlboard;

import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public class Board {

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
    
    public void close() throws Exception
    {
    	if(rs!=null) rs.close();
    	if(conn!=null) conn.close();
    	if(pstmt!=null) pstmt.close();
    }
    public void list(HttpServletRequest request) throws Exception
    {
    	int pageSize=(request.getParameter("pageSize")==null)?10:Integer.parseInt(request.getParameter("pageSize"));
    	int page=(request.getParameter("page")==null)?1:Integer.parseInt(request.getParameter("page"));
    	int index=(page-1)*pageSize;
    	int p=(page-1)/10;
    	int pstart=(p*10)+1;
    	int pend=pstart+9;
    	
    	sql="select ceil(count(*)/"+pageSize+") as chong from "+tableName;
    	pstmt=conn.prepareStatement(sql);
    	rs=pstmt.executeQuery();
    	rs.next();
    	int chong=rs.getInt("chong");
    	if(chong<pend) pend=chong;
    	
    	sql="select * from "+tableName+" order by id desc limit ?,"+pageSize;
    	
    	pstmt=conn.prepareStatement(sql);
    	pstmt.setInt(1, index);
    	rs=pstmt.executeQuery();
    	
    	request.setAttribute("chong", chong);
    	request.setAttribute("pstart", pstart);
    	request.setAttribute("pend", pend);
    	request.setAttribute("page", page);
    	request.setAttribute("pageSize", pageSize);
    	
    	ArrayList<PageboardDTO> list=new ArrayList<>();
    	
    	while(rs.next())
    	{
    	PageboardDTO ldto=new PageboardDTO();
    	ldto.setContent(rs.getString("content"));
    	ldto.setId(rs.getInt("id"));
    	ldto.setName(rs.getString("name"));
    	ldto.setPwd(rs.getString("pwd"));
    	ldto.setTitle(rs.getString("title"));
    	ldto.setReadnum(rs.getString("readnum"));
    	ldto.setWriteday(rs.getString("writeday"));
    	
    	list.add(ldto);
    	}
    	
    	request.setAttribute("list", list);
    	
    }
    
    public void writeOk(HttpServletRequest request, HttpServletResponse response) throws Exception
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
    	pstmt.executeUpdate();
    	
    	response.sendRedirect("list.jsp");
    }
    
    public void content(HttpServletRequest request) throws Exception
    {
    	String page=request.getParameter("page");
    	String id=request.getParameter("id");
    	sql="select * from "+tableName+" where id=?";
    	pstmt=conn.prepareStatement(sql);
    	pstmt.setString(1, id);
    	
    	ResultSet rs=pstmt.executeQuery();
    	rs.next();
    	
/*		PageboardDTO pdto=new PageboardDTO();
		pdto.setContent(rs.getString("content").replace("\r\n", "<br>"));
		pdto.setId(rs.getInt("id")); pdto.setName(rs.getString("name"));
		pdto.setPwd(rs.getString("pwd")); pdto.setReadnum(rs.getString("readnum"));
		pdto.setWriteday(rs.getString("writeday"));
		pdto.setTitle(rs.getString("title"));
		
		request.setAttribute("content",pdto); */
    	
    	request.setAttribute("content", rs.getString("content").replace("\r\b", "<br>"));
    	request.setAttribute("id", rs.getInt("id"));
    	request.setAttribute("pwd", rs.getString("pwd"));
    	request.setAttribute("writeday", rs.getString("writeday"));
    	request.setAttribute("title", rs.getString("title"));
    	request.setAttribute("name", rs.getString("name"));
    	request.setAttribute("readnum", rs.getString("readnum"));
		request.setAttribute("page", page);
    }
    
    public void readnum(HttpServletRequest request,HttpServletResponse response) throws Exception
    {
    	String id=request.getParameter("id");
    	String page=request.getParameter("page");
    	sql="update "+tableName+" set readnum=readnum+1 where id=?";
    	pstmt=conn.prepareStatement(sql);
    	pstmt.setString(1, id);
    	
    	pstmt.executeUpdate();
    	
    	response.sendRedirect("content.jsp?id="+id+"&page="+page);
    }
    
    public void delete(HttpServletRequest request,HttpServletResponse response) throws Exception
    {
    	String id=request.getParameter("id");
    	String pwd=request.getParameter("pwd");
    	String page=request.getParameter("page");
    	
    	sql="select count(*) as chong from "+tableName+" where id=? and pwd=?";
    	pstmt=conn.prepareStatement(sql);
    	pstmt.setString(1, id);
    	pstmt.setString(2, pwd);
    	ResultSet rs=pstmt.executeQuery();
    	rs.next();
    	
    	int chong=rs.getInt("chong");
    	
    	if(chong==1)
    	{
	    	sql="delete from "+tableName+" where id=?";
	    	pstmt=conn.prepareStatement(sql);
	    	pstmt.setString(1, id);
	    	
	    	pstmt.executeUpdate();
	    	
	    	response.sendRedirect("list.jsp");
    	}
    	else
    	{
    		response.sendRedirect("content.jsp?id="+id+"&page="+page);
    	}
    }
    
    public void update(HttpServletRequest request) throws Exception
    {
    	String id=request.getParameter("id");
    	String page=request.getParameter("page");
    	sql="select * from "+tableName+" where id=?";
    	pstmt=conn.prepareStatement(sql);
    	pstmt.setString(1, id);
    	ResultSet rs=pstmt.executeQuery();
    	rs.next();
    	
    	request.setAttribute("content", rs.getString("content").replace("\r\b", "<br>"));
    	request.setAttribute("id", rs.getInt("id"));
    	request.setAttribute("pwd", rs.getString("pwd"));
    	request.setAttribute("writeday", rs.getString("writeday"));
    	request.setAttribute("title", rs.getString("title"));
    	request.setAttribute("name", rs.getString("name"));
    	request.setAttribute("readnum", rs.getString("readnum"));
		request.setAttribute("page", page);
    }
    
    public void updateOk(HttpServletRequest request,HttpServletResponse response) throws Exception
    {	
    	request.setCharacterEncoding("utf-8");
    	String id=request.getParameter("id");
    	String title=request.getParameter("title");
    	String name=request.getParameter("name");
    	String pwd=request.getParameter("pwd");
    	String content=request.getParameter("content");
    	String page=request.getParameter("page");
    	
    	sql="select count(*) as chong from "+tableName+" where id=? and pwd=?";
    	pstmt=conn.prepareStatement(sql);
    	pstmt.setString(1, id);
    	pstmt.setString(2, pwd);
    	ResultSet rs=pstmt.executeQuery();
    	rs.next();
    	
    	int chong=rs.getInt("chong");
    	
    	if(chong==1)
    	{
    	sql="update "+tableName+" set title=?, name=?, content=? where id=?";
    	pstmt=conn.prepareStatement(sql);
    	pstmt.setString(1, title);
    	pstmt.setString(2, name);
    	pstmt.setString(3, content);
    	pstmt.setString(4, id);
    	
    	pstmt.executeUpdate();
    	response.sendRedirect("content.jsp?id="+id+"&page="+page);
    	}
    	else
    	{
    		response.sendRedirect("update.jsp?id="+id+"&page="+page);
    	}
    }
}

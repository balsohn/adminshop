package myServlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateOk")
public class UpdateOk extends HttpServlet{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
	        String db="jdbc:mysql://localhost:3306/second";
	        Connection conn=DriverManager.getConnection(db,"root","1234");
	        
	        request.setCharacterEncoding("utf-8");
	        String id=request.getParameter("id");
	        String title=request.getParameter("title");
	        String pwd=request.getParameter("pwd");
	        String name=request.getParameter("name");
	        String content=request.getParameter("content");
	        
	        if(Util.isPwd(id, pwd)) {
	        	String sql="update pageboard set title=?, name=?, content=? where id=?";
	        	PreparedStatement pstmt=conn.prepareStatement(sql);
	        	pstmt.setString(1, title);
	        	pstmt.setString(2, name);
	        	pstmt.setString(3, content);
	        	pstmt.setString(4, id);
	        	
	        	pstmt.executeUpdate();
	        	
	        	pstmt.close();
	        	conn.close();
	        	
	        	response.sendRedirect("Content?id="+id);
	        	
	        }
	        else {
	        	response.sendRedirect("Update?err=1&id="+id);
	        }
		
		}
		catch(Exception e) {
			
		}
	}
}

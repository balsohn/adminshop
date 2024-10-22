package myServlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/WriteOk")
public class WriteOk extends HttpServlet {
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
		    String db="jdbc:mysql://localhost:3306/second";
		    Connection conn=DriverManager.getConnection(db,"root","1234");
		    
		    String title=request.getParameter("title");
		    String name=request.getParameter("name");
		    String content=request.getParameter("content");
		    
		    String sql="insert into pageboard (title,name,content,writeday) values (?,?,?,now())";
		    
		    PreparedStatement pstmt=conn.prepareStatement(sql);
		    pstmt.setString(1, title);
		    pstmt.setString(2, name);
		    pstmt.setString(3, content);
		    
		    pstmt.executeUpdate();
		    
		    
		    response.sendRedirect("List");
		    
		}
		catch(Exception e) {
			
		}
	}
}

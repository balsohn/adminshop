package myServlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Content")
public class Content extends HttpServlet {
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		// DB연결
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
		    String db="jdbc:mysql://localhost:3306/second";
		    Connection conn=DriverManager.getConnection(db,"root","1234");
		    
		    String id=request.getParameter("id");
		    String sql="select * from member where id=?";
		    
		    PreparedStatement pstmt=conn.prepareStatement(sql);
		    pstmt.setString(1, id);
		    ResultSet rs=pstmt.executeQuery();
		    rs.next();
		    
		    MemberDto mdto=new MemberDto();
		    mdto.setUserid(rs.getString("userid"));
		    mdto.setId(rs.getInt("id"));
		    mdto.setName(rs.getString("name"));
		    mdto.setEmail(rs.getString("email"));
		    mdto.setPhone(rs.getString("phone"));
		    mdto.setWriteday(rs.getString("writeday"));
		    
		    request.setAttribute("mdto", mdto);
		    
		    rs.close();
		    pstmt.close();
		    conn.close();
		}
		catch(Exception e) {
			
		}
		
		RequestDispatcher dis=request.getRequestDispatcher("content.jsp");
		dis.forward(request, response);
	}
}

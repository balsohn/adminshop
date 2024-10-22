package myServlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginOk")
public class LoginOk extends HttpServlet{

	protected void doPost(HttpServletRequest request,HttpServletResponse response) {
		HttpSession session=request.getSession();
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
	        String db="jdbc:mysql://localhost:3306/second";
	        Connection conn=DriverManager.getConnection(db,"root","1234");
	        
	        String userid=request.getParameter("userid");
	        String pwd=request.getParameter("pwd");
	        
	        String sql="select * from member where userid=? and pwd=?";
	        PreparedStatement pstmt=conn.prepareStatement(sql);
	        pstmt.setString(1, userid);
	        pstmt.setString(2, pwd);
	        
	        ResultSet rs=pstmt.executeQuery();

	        if(rs.next())
	        {
	        	session.setAttribute("userid", rs.getString("userid"));
	        	session.setAttribute("name", rs.getString("name"));
	        	response.sendRedirect("List");
	        }
	        else
	        {
	        	response.sendRedirect("Login?err=1");
	        }
	        
	        rs.close();
	        pstmt.close();
	        conn.close();
	        
		}
		catch(Exception e) {
			
		}
	}
}

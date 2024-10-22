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

@WebServlet("/Delete")
public class Delete extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
		Class.forName("com.mysql.jdbc.Driver"); 
        String db="jdbc:mysql://localhost:3306/second";
        Connection conn=DriverManager.getConnection(db,"root","1234");
		
		String id = request.getParameter("id");
		
		String sql="delete from pageboard where id=?";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.executeUpdate();
		
		response.sendRedirect("List");
		
		pstmt.close();
		conn.close();
		
		
		}
		catch(Exception e)
		{
			
		}
		
		
	}
}



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
public class Content extends HttpServlet{

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
		try {
		Class.forName("com.mysql.jdbc.Driver"); 
        String db="jdbc:mysql://localhost:3306/second";
        Connection conn=DriverManager.getConnection(db,"root","1234");
        
        String id=request.getParameter("id");
        
        String sql="select * from pageboard where id=?";
        PreparedStatement pstmt=conn.prepareStatement(sql);
        pstmt.setString(1, id);
        
        ResultSet rs=pstmt.executeQuery();
        
        rs.next();
        
        BoardDTO bdto=new BoardDTO();
        bdto.setContent(rs.getString("content"));
        bdto.setId(rs.getInt("id"));
        bdto.setName(rs.getString("name"));
        bdto.setPwd(rs.getString("pwd"));
        bdto.setReadnum(rs.getInt("readnum"));
        bdto.setTitle(rs.getString("title"));
        bdto.setWriteday(rs.getString("writeday"));
        
        request.setAttribute("bdto", bdto);
        
        rs.close();
        conn.close();
        pstmt.close();
        
		}
		catch(Exception e) {
			
		}
		
		RequestDispatcher dis=request.getRequestDispatcher("content.jsp");
		dis.forward(request, response);
	}
}

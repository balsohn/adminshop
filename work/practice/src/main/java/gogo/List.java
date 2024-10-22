package gogo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/list")
public class List extends HttpServlet {
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) {
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
	        String db="jdbc:mysql://localhost:3306/second";
	        Connection conn=DriverManager.getConnection(db,"root","1234");
	        
	        String sql="select * from pageboard order by id desc limit 0,30";
	        PreparedStatement pstmt=conn.prepareStatement(sql);
	        
	        ResultSet rs=pstmt.executeQuery();
	        
	        ArrayList<BoardDTO> list = new ArrayList<BoardDTO>;
	        
	        while(rs.next())
	        {
	        	BoardDTO bdto=new BoardDTO();
	        	
	        	bdto.setTitle(rs.getString("title"));
	        	bdto.setId(rs.getInt("id"));
	        	bdto.setReadnum(rs.getInt("readnum"));
	        	bdto.setWriteday(rs.getString("writeday"));
	        	
	        	list.add(bdto);
	        }
	        
	        request.setAttribute("list", list);
	        
	        
		}
		catch(Exception e) {
			
		}
		RequestDispatcher dis=request.getRequestDispatcher("list.jsp");
        dis.forward(request, response);
	}
}

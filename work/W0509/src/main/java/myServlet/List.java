package myServlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/List")
public class List extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
		    String db="jdbc:mysql://localhost:3306/second";
		    Connection conn=DriverManager.getConnection(db,"root","1234");
		    
		    String sql="select * from pageboard";
		    PreparedStatement pstmt=conn.prepareStatement(sql);
		    ResultSet rs=pstmt.executeQuery();
		    
		    rs.next();
		    ArrayList<BoardDTO> list=new ArrayList<MemberDto>();
			
			while(rs.next()) {
				MemberDto mdto=new MemberDto();
				mdto.setUserid(rs.getString("userid"));
				mdto.setId(rs.getInt("id"));
				mdto.setName(rs.getString("name"));
				mdto.setEmail(rs.getString("email"));
				mdto.setPhone(rs.getString("phone"));
				mdto.setWriteday(rs.getString("writeday"));
				
				list.add(mdto);
			}
		}
		catch(Exception e) {
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

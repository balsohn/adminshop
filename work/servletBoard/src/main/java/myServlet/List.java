package myServlet;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/List")
public class List extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			// DB연결
			Class.forName("com.mysql.jdbc.Driver"); 
	        String db="jdbc:mysql://localhost:3306/second";
	        Connection conn=DriverManager.getConnection(db,"root","1234");
	        
			// 쿼리문 
			String sql="select * from pageboard order by id desc limit 0,20";
			
			// 심부름꾼 생성
			PreparedStatement pstmt=conn.prepareStatement(sql);
			
			// 쿼리 실행
			ResultSet rs=pstmt.executeQuery();
			
			// 결과를 dto에 담기
			ArrayList<BoardDTO> list=new ArrayList<BoardDTO>();
			
			while(rs.next()) {
				BoardDTO bdto=new BoardDTO();
				bdto.setContent(rs.getString("content"));
				bdto.setId(rs.getInt("id"));
				bdto.setName(rs.getString("name"));
				bdto.setPwd(rs.getString("pwd"));
				bdto.setReadnum(rs.getInt("readnum"));
				bdto.setTitle(rs.getString("title"));
				bdto.setWriteday(rs.getString("writeday"));
				
				list.add(bdto);
			}
			
			
			// 결과를 View(jsp)에 전달  => request
			request.setAttribute("list", list);
			// 닫기
			rs.close();
			conn.close();
			pstmt.close();
		}
		catch(Exception e) {
			
		}
			// 브라우저에 보여줄 jsp정보를 전달
			RequestDispatcher dis=request.getRequestDispatcher("list.jsp");
			dis.forward(request, response);
	}
	
	protected void doPost() {
		
	}
	
	protected void service() {
		
	}
	
	
}


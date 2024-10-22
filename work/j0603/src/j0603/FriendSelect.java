package j0603;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FriendSelect {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver"); //mysql과 연결할 드라이버 클래스를 찾아라 
		String db="jdbc:mysql://localhost:3306/first";
		Connection conn=DriverManager.getConnection(db,"root","1234");
		
		String sql="select * from friend";
		
		PreparedStatement pstmt=conn.prepareStatement(sql);
		
		//실행 
		ResultSet rs=pstmt.executeQuery(); //select는 무조건 executeQuery()
		
		while(rs.next())
		{
			System.out.print(rs.getString("name")+ " ");
			System.out.print(rs.getString("juso")+ " ");
			System.out.println(rs.getString("phone"));
		}
		
		
	
	
	}

}

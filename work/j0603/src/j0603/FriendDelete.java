package j0603;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class FriendDelete {

	public static void main(String[] args) throws Exception  {
		
		Class.forName("com.mysql.jdbc.Driver"); //mysql과 연결할 드라이버 클래스를 찾아라 
		String db="jdbc:mysql://localhost:3306/first";
		Connection conn=DriverManager.getConnection(db,"root","1234");
		
		Scanner sc=new Scanner(System.in);
		String name=sc.next(); //삭제할 이름 입력 
		
		String sql="delete from friend where name=?";
		
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1,name);
		
		pstmt.executeUpdate();
		
		pstmt.close();
		conn.close();
		
	}

}

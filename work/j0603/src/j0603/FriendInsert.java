package j0603;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class FriendInsert {
	public static void main(String[] args) throws Exception {
		
		//DB연결 
		Class.forName("com.mysql.jdbc.Driver"); //mysql과 연결할 드라이버 클래스를 찾아라 
		String db="jdbc:mysql://localhost:3306/first";
		Connection conn=DriverManager.getConnection(db,"root","1234");
		
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		String juso=sc.next();
		String phone=sc.next();
		
		//입력하기 => insert 
		//String sql="insert into friend(name,juso,phone) values('차니','고양시','010-1111-2222')";
		//Statement로 하는 경우
		//String sql="insert into friend(name,juso,phone) values('"+name+"','"+juso+"','+phone+')";
		//Statement stmt=conn.createStatement();
		//stmt.executeUpdate(sql);
		
		String sql="insert into friend(name,juso,phone) values(?,?,?)";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		
		pstmt.setString(1, name);
		pstmt.setString(2, juso);
		pstmt.setString(3, phone);
		
		pstmt.executeUpdate();
		
		pstmt.close();
		conn.close();
		
	}
}

package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectFriend2 {

		public static void main(String[] args) throws Exception {
				
				
		Class.forName("com.mysql.jdbc.Driver"); //mysql과 연결할 드라이버 클래스를 찾아라 
		String db="jdbc:mysql://localhost:3306/first";
		Connection conn=DriverManager.getConnection(db,"root","1234");
		
		//실행할 쿼리문 생성
		String sql="select * from friend";
		
		//sql 실행할 객체 
		PreparedStatement pstmt=conn.prepareStatement(sql);
		
		//쿼리문 실행 executeUpdate(), executeQuery()=> select (결과값을 보여준다)
		ResultSet rs=pstmt.executeQuery();
		//rs.next(); //레코드 이동, 처음으로 실행하면 첫번째 레코드로 이동
		
		//rs.next()리턴값은 boolean으로  
		//다음레코드 이동후 레코드가 존재하면 true or false
		while(rs.next())
		{
		System.out.print(rs.getString("name") + " ");
		System.out.print(rs.getString("juso") + " ");
		System.out.print(rs.getString("phone"));
		System.out.println();
		}
				

	}
}

	



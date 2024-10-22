package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectFriend {

	public static void main(String[] args) throws Exception {
		
		//friend테이블에 내용을 읽어와서 콘솔창에 출력
		
		//DB연결 
		//자바프로그램과 데이터베이스 연동
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
		
	
		//레코드의 갯수를 알수 있다면 
		rs.last(); //끝으로 이동 
		int n=rs.getRow(); //레코드 개수 
		rs.beforeFirst();
		
		for(int i=1; i<=n; i++)
		{
		rs.next(); 
		System.out.println(" ");
		System.out.print(rs.getString("name") + " ");
		System.out.print(rs.getString("juso") + " ");
		System.out.print(rs.getString("phone"));
		}
	
		
		
		

}
}

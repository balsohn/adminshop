package j0531;

//import java.sql.*; //*은 모든 sql접근

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class DBConn {

	public static void main(String[] args) throws Exception {
		//자바프로그램과 데이터베이스 연동
		Class.forName("com.mysql.jdbc.Driver"); //mysql과 연결할 드라이버 클래스를 찾아라 
		String db="jdbc:mysql://localhost:3306/first";
		Connection conn=DriverManager.getConnection(db,"root","1234");
		
		//콘솔창으로 입력된 값을 저장하기 
		//3개의 값을 변수에 입력 
		Scanner sc=new Scanner(System.in);
		System.out.print("이름 : ");
		String name=sc.next();
		System.out.print("주소 : ");
		String juso=sc.next();
		System.out.print("전화 : ");
		String phone=sc.next();
		
		
		//쿼리문은 자바프로그램내에서는 문자열
		//Statement stmt에 대한 쿼리문
		//String sql="insert into friend(name,juso,phone) values('"+name+"','"+juso+"','"+phone+"')";
		//System.out.println(sql);
		
		String sql="insert into friend (name,juso,phone) values(?,?,?)";
		//현재 자바프로그램내의 쿼리문을 실행할 심부름꾼 
		//Statement stmt=conn.createStatement(); //Statement sql에서 실행하는 객체 생성자 import sql.statement
		
		//업그레이드된 심부름꾼 : PreparedStatement 
		PreparedStatement pstmt=conn.prepareStatement(sql);
		//객체 생성후 값을 추가한다.  => values에 표시된 ?에 들어갈 값을 선택해준다.
		pstmt.setString(1, name);
		pstmt.setString(2,juso);
		pstmt.setString(3, phone);
		
		//mysql에서 실행하라는 명령문
		//stmt.executeUpdate(sql);
		pstmt.executeUpdate();
		
		
		//stmt.close();
		pstmt.close();
		conn.close();//자바에서는 무조건 해야 된다. 스프링에서는 자동으로 실행종료. 
		
		
		
		
	}

}

package db;

import java.sql.*;
import java.util.Scanner;

public class StudentDB {

	public static void main(String[] args) throws Exception {

	Class.forName("com.mysql.jdbc.Driver");
	String db="jdbc:mysql://localhost:3306/academy";
	Connection conn=DriverManager.getConnection(db,"root","1234");
	
	Scanner sc=new Scanner(System.in);
	System.out.println("이름 :");
	String name=sc.next();
	System.out.println("학번 : ");
	String hakbun=sc.next();
	System.out.println("생일 : ");
	String birth=sc.next();
	System.out.println("키 : ");
	int height=sc.nextInt();
	System.out.println("몸무게 : ");
	int weight=sc.nextInt();
	
	String sql="insert into student (name,hakbun,birth,height,weight) values(?,?,?,?,?)";
	
	PreparedStatement pstmt=conn.prepareStatement(sql);
	
	pstmt.setString(1,name);
	pstmt.setString(2, hakbun);
	pstmt.setString(3,birth);
	pstmt.setInt(4, height);
	pstmt.setInt(5,weight);
	
	pstmt.executeUpdate();
	
	pstmt.close();
	conn.close();
	
	
		
		
		
	}

}

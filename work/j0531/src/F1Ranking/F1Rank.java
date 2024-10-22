package F1Ranking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class F1Rank {

	public static void main(String[] args) throws Exception {

		
		Class.forName("com.mysql.jdbc.Driver");
		String db="jdbc:mysql://localhost:3306/F1";
		Connection conn=DriverManager.getConnection(db,"root","1234");
		
			Scanner sc=new Scanner(System.in);
			System.out.print("이름 : ");
			String name=sc.next();
			System.out.print("국가 : ");
			String country=sc.next();
			System.out.print("2023 랭킹순위 : ");
			String RankNum=sc.next();
			System.out.print("키 : ");
			int height=sc.nextInt();
			System.out.print("개인 최고기록 : ");
			int PB=sc.nextInt();
			
			String sql="insert into F1Rank (name,country,RankNum,height,PB) values(?,?,?,?,?)";
				
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2,country);
			pstmt.setString(3, RankNum);
			pstmt.setInt(4, height);
			pstmt.setInt(5,PB);
			
			pstmt.executeUpdate();
			
			pstmt.close();
			conn.close();

	}

}

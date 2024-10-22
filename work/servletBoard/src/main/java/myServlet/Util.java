package myServlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Util {

	public static boolean isPwd(String id,String pwd) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver"); 
	    String db="jdbc:mysql://localhost:3306/second";
	    Connection conn=DriverManager.getConnection(db,"root","1234");
	    
	    String sql="select count(*) as cnt from pageboard where id=? and pwd=?";
	    PreparedStatement pstmt=conn.prepareStatement(sql);
	    
	    pstmt.setString(1,id);
	    pstmt.setString(2, pwd);
	    
	    ResultSet rs=pstmt.executeQuery();
	    rs.next();
	    
	    return rs.getBoolean("cnt");
	}
}

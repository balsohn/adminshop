package javaChuga;

import java.sql.*;

public class MyDb {
	public void test() 
    {
   	   Connection conn=null;
   	   try
   	   {
   		  Class.forName("com.mysql.jdbc.Driver"); // 라이브러리를 찾아라
   		  String db="jdbc:mysql://localhost:3306/second";
   		  conn=DriverManager.getConnection(db,"root","1234");
   		  
   		  
   		  conn.close();
   	   }
   	   catch(Exception e)
   	   {
   		  System.out.println("오류발생");
   	   }
   	   finally
   	   {
   		   try
   		   {
   			   if(!conn.isClosed())
   			   {
   				   conn.close();
   				   System.out.println("닫기완료");
   			   }
   		     
   		   }
   		   catch(SQLException e)
   		   {
   			   
   		   }
   	   }
   	 
   	  
   	   System.out.println("계속되는 프로그램"); 
		
    }
}

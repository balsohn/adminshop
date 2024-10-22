package login;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login {
    Connection conn;
    PreparedStatement pstmt;
    ResultSet rs;
	public Login() throws Exception
	{
		// DB연결
	    Class.forName("com.mysql.jdbc.Driver");  
		String db="jdbc:mysql://localhost:3306/second";
		conn=DriverManager.getConnection(db,"root","1234");
	}
	public void useridCheck(HttpServletRequest request) throws Exception
	{
		
	    // 아이디를 가져오기
	    String userid=request.getParameter("userid");
	    
	    // 쿼리문 생성 => 필드의 값을 사용하지 않는다.
	    String sql="select count(*) as cnt from member where userid=?";
	    
	    // 심부름꾼 생성 + setter
	    pstmt=conn.prepareStatement(sql);
	    pstmt.setString(1, userid);
	    
	    //out.print(pstmt.toString());
	    
	    // 쿼리문 실행
	    rs=pstmt.executeQuery();
	    rs.next();
	    
	    // 결과출력
	    if(rs.getBoolean("cnt")) //if(rs.getInt("cnt")==1)
	    {
	    	//out.print("1");
	    	request.setAttribute("cnt", "1");
	    }
	    else
	    {
	    	//out.print("0");
	    	request.setAttribute("cnt", "0");
	    }
	    
	    // 닫기
	    rs.close();
	    pstmt.close();
	    conn.close();
	}
	
	public void memberOk(HttpServletRequest request,
			HttpServletResponse response) throws Exception
	{
 
	    // 폼의 값 읽어오기
	    request.setCharacterEncoding("utf-8");
	    String userid=request.getParameter("userid");
	    String name=request.getParameter("name");
	    String pwd=request.getParameter("pwd");
	    String email=request.getParameter("email");
	    String phone=request.getParameter("phone");
	    
	    // 쿼리 생성
	    String sql="insert into member(userid,name,pwd,email,phone,writeday) values(?,?,?,?,?,now())";
	    
	    // 심부름꾼 생성 + setter
	    pstmt=conn.prepareStatement(sql);
	    pstmt.setString(1, userid);
	    pstmt.setString(2, name);
	    pstmt.setString(3, pwd);
	    pstmt.setString(4, email);
	    pstmt.setString(5, phone);
	    
	    // 쿼리 실행
	    pstmt.executeUpdate();
	    
	    // 닫기
	    pstmt.close();
	    conn.close();
	    
	    // 이동 => 로그인 페이지
	    response.sendRedirect("login.jsp");
	}
	
	public void loginOk(HttpServletRequest request,
			HttpSession session,
			HttpServletResponse response) throws Exception
	{
	    // 아이디,비번을 가져오기
	    String userid=request.getParameter("userid");
	    String pwd=request.getParameter("pwd");
	    
	    // 쿼리 생성
	    String sql="select name from member where userid=? and pwd=?";
	    
	    // 심부름꾼 생성 +setter
	    pstmt=conn.prepareStatement(sql);
	    pstmt.setString(1, userid);
	    pstmt.setString(2, pwd);
	    
	    // 쿼리 실행
	    
	   
	    // 결과에 따른 동작
	    if(this.isPwd(userid, pwd)) 
	    {
	    	// true => 아이디,비번이 일치한다
	    	// 세션변수를 할당 => userid, name
	    	session.setAttribute("userid",userid);
	    	//session.setAttribute("name", rs.getString("name"));
	    	// 이동
	    	response.sendRedirect("index.jsp");
	    }
	    else
	    {
	    	// 이동
	    	response.sendRedirect("login.jsp?err=1");
	    }
	    // 닫기
	    pstmt.close();
	    conn.close();
	    
	}
	
	public void logout(HttpSession session,
			HttpServletResponse response) throws Exception
	{
		session.invalidate();
		
		response.sendRedirect("index.jsp");
	}
	
    public void memberView(HttpSession session,
    		HttpServletRequest request,
    		HttpServletResponse response) throws Exception
    {
    	// 현재memberView는 회원만 보는 문서
    	if(session.getAttribute("userid")==null)
    	{
    		// 로그인을 하지 않았다면 login.jsp로 이동
    		response.sendRedirect("login.jsp");
    	}
    	else
    	{
    		// 사용자 아이디를 가져오기
        	String userid=session.getAttribute("userid").toString();
        	
            // 쿼리 생성
            String sql="select * from member where userid=?";
            
            // 심부름꾼 생성 + setter
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1, userid);
            
            // 쿼리 실행
            ResultSet rs=pstmt.executeQuery();
            rs.next();	
            // 결과값 => dto
            MemberDto mdto=new MemberDto();
            mdto.setId(rs.getInt("id"));
            mdto.setName(rs.getString("name"));
            mdto.setEmail(rs.getString("email"));
            mdto.setPhone(rs.getString("phone"));
            
            request.setAttribute("mdto", mdto);
            
        	// 닫기
            rs.close();
            pstmt.close();
            conn.close();
    	}
    	
    	
    }
    
    public void emailOk(HttpServletRequest request,
    		HttpSession session,
    		HttpServletResponse response) throws Exception
    {
    	if(session.getAttribute("userid")==null)
    	{
    		// 로그인을 하지 않았다면 login.jsp로 이동
    		response.sendRedirect("login.jsp");
    	}
    	else
    	{
    		// 폼값 가져오기
            String email=request.getParameter("email");
            String userid=session.getAttribute("userid").toString();
            
            // 쿼리문 생성
            String sql="update member set email=? where userid=?";
            
            // 심부름꾼 생성 + setter
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1, email);
            pstmt.setString(2, userid);
            
            // 쿼리 실행
            pstmt.executeUpdate();
            
            // 닫기
            pstmt.close();
            conn.close();
            
            // 이동
            response.sendRedirect("memberView.jsp");
    	}
    	
        
    }
    
    public void phoneOk(HttpServletRequest request,
    		HttpSession session,
    		HttpServletResponse response) throws Exception
    {
    	if(session.getAttribute("userid")==null)
    	{
    		// 로그인을 하지 않았다면 login.jsp로 이동
    		response.sendRedirect("login.jsp");
    	}
    	else
    	{
    		// 폼값 가져오기
            String phone=request.getParameter("phone");
            String userid=session.getAttribute("userid").toString();
            
            // 쿼리문 생성
            String sql="update member set phone=? where userid=?";
            
            // 심부름꾼 생성 + setter
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1, phone);
            pstmt.setString(2, userid);
            
            // 쿼리 실행
            pstmt.executeUpdate();
            
            // 닫기
            pstmt.close();
            conn.close();
            
            // 이동
            response.sendRedirect("memberView.jsp");
    	}
        
    }
    
    public void pwdChgOk(HttpServletRequest request,
    		HttpSession session,
    		HttpServletResponse response) throws Exception
    {
        // 값 읽어오기
        String oldPwd=request.getParameter("oldPwd");
    	String pwd=request.getParameter("pwd");
    	String userid=session.getAttribute("userid").toString();
    	
    	// 쿼리 생성
	    String sql="select name from member where userid=? and pwd=?";
	    
	    // 심부름꾼 생성 +setter
	    pstmt=conn.prepareStatement(sql);
	    pstmt.setString(1, userid);
	    pstmt.setString(2, oldPwd);
	    //System.out.println(pstmt.toString());
	    
	    // 쿼리 실행
    	
        if(this.isPwd(userid, oldPwd))
        {
        	// 일치한다면
        	// 쿼리문 생성
            sql="update member set pwd=? where userid=?";
            
            // 심부름꾼 생성 + setter
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1, pwd);
            pstmt.setString(2, userid);
            
        	// 쿼리문 실행
            pstmt.executeUpdate();
            
        	// 닫기
            
            pstmt.close();
            conn.close();
            
        	// 이동 => memberView
            response.sendRedirect("memberView.jsp");
        }
        else
        {
        	// 닫기
            rs.close();
        	pstmt.close();
        	conn.close();
        	
        	// 이동 => memberView
            response.sendRedirect("memberView.jsp?err=1");

        }
    }
    
    public boolean isPwd(String userid, String oldPwd) throws Exception
    {
    	// 쿼리 생성
	    String sql="select name from member where userid=? and pwd=?";
	    
	    // 심부름꾼 생성 +setter
	    pstmt=conn.prepareStatement(sql);
	    pstmt.setString(1, userid);
	    pstmt.setString(2, oldPwd);
	    //System.out.println(pstmt.toString());
	    
	    // 쿼리 실행
	    ResultSet rs=pstmt.executeQuery();
	    
	    if(rs.next())
	    {
	    	return true;
	    }
	    else
	    {
	    	return false;
	    }
    }
    
    public static void getName(HttpServletRequest request,
    		HttpSession session) throws Exception
    {
    	
    	if(session.getAttribute("userid")!=null)
    	{
    		Class.forName("com.mysql.jdbc.Driver");  
    		String db="jdbc:mysql://localhost:3306/second";
    		Connection conn=DriverManager.getConnection(db,"root","1234");
    		
    		String userid=session.getAttribute("userid").toString();
    		
    		String sql="select name from member where userid=?";
    		PreparedStatement pstmt=conn.prepareStatement(sql);
    		pstmt.setString(1, userid);
    		
        	request.setAttribute("name", "하하하");
    	}
    	
    }
}













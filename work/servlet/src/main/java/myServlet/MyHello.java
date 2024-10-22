package myServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyHello
 */
@WebServlet("/MyHello")
public class MyHello extends HttpServlet {
	
	public MyHello() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		
		request.setAttribute("asdf", "ggggggg");
		RequestDispatcher dis=request.getRequestDispatcher("myhello.jsp");
		dis.forward(request, response);
	}
	
	protected void doPost() {
		
	}
       
   

}

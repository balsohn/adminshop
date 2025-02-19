/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.1
 * Generated at: 2024-07-03 02:01:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import board.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("board");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.sql.ResultSet");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("      \r\n");

    // board테이블에 있는 레코드를 가져와서 출력
    Board board=new Board();
    ResultSet rs=board.list(request);
    
    int pstart=(int)request.getAttribute("pstart");
    int pend=(int)request.getAttribute("pend");
    int chong=(int)request.getAttribute("chong");
    int pageSize=(int)request.getAttribute("pageSize");
    
    out.print(pstart+" "+pend+" "+chong+" "+pageSize);

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("  <style>\r\n");
      out.write("   table {\r\n");
      out.write("     border-spacing:0px; /* 셀과 셀 간격 == cellspacing */\r\n");
      out.write("   }\r\n");
      out.write("   table td {\r\n");
      out.write("     border-bottom:1px solid black;\r\n");
      out.write("     padding:5px;\r\n");
      out.write("     height:35px;\r\n");
      out.write("   }\r\n");
      out.write("   table tr:first-child td {\r\n");
      out.write("     border-top:2px solid black;\r\n");
      out.write("     border-bottom:2px solid black;\r\n");
      out.write("   }\r\n");
      out.write("   table tr:last-child td {\r\n");
      out.write("     border-bottom:2px solid black;\r\n");
      out.write("   }\r\n");
      out.write("   a {\r\n");
      out.write("      text-decoration:none;\r\n");
      out.write("      color:black;\r\n");
      out.write("   }\r\n");
      out.write("   a:hover {\r\n");
      out.write("      text-decoration:underline;\r\n");
      out.write("      color:green;\r\n");
      out.write("   }\r\n");
      out.write("   #btn {\r\n");
      out.write("      color:black;\r\n");
      out.write("      text-decoration:none;\r\n");
      out.write("      border:1px solid green;\r\n");
      out.write("      /*\r\n");
      out.write("      display:inline-block;\r\n");
      out.write("      width:130px;\r\n");
      out.write("      height:30px;\r\n");
      out.write("      text-align:center;\r\n");
      out.write("      line-height:30px;\r\n");
      out.write("      */\r\n");
      out.write("      /*\r\n");
      out.write("      padding-left:20px;\r\n");
      out.write("      padding-right:20px;\r\n");
      out.write("      padding-top:4px;\r\n");
      out.write("      padding-bottom:4px;\r\n");
      out.write("      */\r\n");
      out.write("      padding:4px 20px; /* 상하 좌우 */\r\n");
      out.write("      \r\n");
      out.write("   }\r\n");
      out.write(" \r\n");
      out.write("   </style>\r\n");
      out.write("   <script>\r\n");
      out.write("\t\tfunction change(pageSize)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tlocation=\"list.jsp?pageSize=\"+pageSize;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\twindow.onload=function()\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdocument.getElementById(\"pageSize\").value=");
      out.print(pageSize);
      out.write(";\r\n");
      out.write("\t\t}\r\n");
      out.write("   </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body> <!-- list.jsp -->\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\t<select name=\"pageSize\" id=\"pageSize\" onchange=\"change(this.value)\">\r\n");
      out.write("\t\t\t<option> -- </option>\r\n");
      out.write("\t\t\t<option value=\"5\">5</option>\r\n");
      out.write("\t\t\t<option value=\"10\">10</option>\r\n");
      out.write("\t\t\t<option value=\"20\">20</option>\r\n");
      out.write("\t\t\t<option value=\"50\">50</option>\r\n");
      out.write("\t\t</select>\r\n");
      out.write("\t\r\n");
      out.write("    <table width=\"800\" align=\"center\">\r\n");
      out.write("      <caption> <h3> 게시판 </h3></caption>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td> 작성자 </td>\r\n");
      out.write("        <td> 제 목 </td>\r\n");
      out.write("        <td> 조회수 </td>\r\n");
      out.write("        <td> 작성일 </td>\r\n");
      out.write("      </tr>\r\n");
    
    // 출력
    while(rs.next())
    {

      out.write("    \r\n");
      out.write("      <tr>\r\n");
      out.write("        <td> ");
      out.print(rs.getString("name"));
      out.write(" </td>\r\n");
      out.write("        <td> <a href=\"readnum.jsp?id=");
      out.print(rs.getInt("id"));
      out.write('"');
      out.write('>');
      out.write(' ');
      out.print(rs.getString("title"));
      out.write(" </a> </td>\r\n");
      out.write("        <td> ");
      out.print(rs.getString("readnum"));
      out.write(" </td>\r\n");
      out.write("        <td> ");
      out.print(rs.getString("writeday"));
      out.write(" </td>\r\n");
      out.write("      </tr>\r\n");

    }

      out.write("\r\n");
      out.write("     <tr>\r\n");
      out.write("       <td colspan=\"4\" align=\"right\">\r\n");
      out.write("          <a href=\"write.jsp\" id=\"btn\"> 글쓰기 </a>\r\n");
      out.write("       </td>\r\n");
      out.write("     </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("        \t<td>\r\n");
      out.write("    <!-- 현재페이지에서 다음그룹으로 -->\r\n");
      out.write("    \r\n");
      out.write("\t<!-- 현재페이지에서 맨 끝으로 -->\r\n");

if(pstart>1)
{

      out.write("\r\n");
      out.write("\t<a href=\"list.jsp?page=1&pageSize=");
      out.print(pageSize);
      out.write("\"> 처음으로 </a>\r\n");

}

if(pstart>1)
{

      out.write("\r\n");
      out.write("\t<a href=\"list.jsp?page=");
      out.print(pstart-1 );
      out.write("&pageSize=");
      out.print(pageSize);
      out.write("\">이전</a>\r\n");
	
}

	for(int i=pstart;i<=pend;i++)
	{
		String imsi="";
		if((int)request.getAttribute("page")==i)
		{
			imsi="style='color:red'";
		}

      out.write("   \r\n");
      out.write("\r\n");
      out.write("\t<a href=\"list.jsp?page=");
      out.print(i );
      out.write('"');
      out.write(' ');
      out.print(imsi );
      out.write('>');
      out.print(i );
      out.write("</a>\r\n");
      out.write("\r\n");

	}
	if(pend<chong)
	{		

      out.write("\r\n");
      out.write("\t\t<a href=\"list.jsp?page=");
      out.print(pend+1 );
      out.write("&pageSize=");
      out.print(pageSize);
      out.write("\"> 다음 </a>\r\n");

	}
	if(pend<chong)
	{

      out.write("\r\n");
      out.write("\t\t<a href=\"list.jsp?page=");
      out.print(chong );
      out.write("&pageSize=");
      out.print(pageSize);
      out.write("\"> 마지막 </a>\r\n");
				
	}

      out.write("\t\t\r\n");
      out.write("\t<!-- 현재페이지에서 다음그룹으로 -->\r\n");
      out.write("\t<!-- 현재페이지에서 맨 끝으로 -->\r\n");
      out.write("\t</td>\r\n");
      out.write("   </tr>\r\n");
      out.write("   </table>\r\n");
      out.write("\r\n");

    // 닫기
    board.closeAll();

      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.84
 * Generated at: 2024-02-15 14:03:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.AdminLTE.loginAndregister;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import crud.User;
import crud.UserDAO;
import pagecreate.pageUser;
import pagecreate.pageUserDAO;
import java.util.List;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("crud.User");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("crud.UserDAO");
    _jspx_imports_classes.add("pagecreate.pageUserDAO");
    _jspx_imports_classes.add("pagecreate.pageUser");
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

int userId = Integer.parseInt(request.getParameter("id"));
pageUser pageuser=new pageUserDAO().getUserById(userId);;
List<User> aa = new UserDAO().getAllUsers();
	for(User a: aa){
		if(userId == Integer.parseInt(a.getLink())){
			userId = a.getId();
		}
	}
	User user = new UserDAO().getUserById(userId);

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("      <!-- Latest compiled and minified CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<!-- Optional theme -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css\" integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("    .container{\r\n");
      out.write("          margin-top: 30px;\r\n");
      out.write("          width: 400px;\r\n");
      out.write("          padding : 20px;\r\n");
      out.write("    }\r\n");
      out.write("    form div{\r\n");
      out.write("        margin : 10px;\r\n");
      out.write("    }\r\n");
      out.write("    input[type=\"text\"]:not(#Mark) {\r\n");
      out.write("        background-color: #f0f0f0;\r\n");
      out.write("        border: none;\r\n");
      out.write("        border-bottom: 1px solid #ccc;\r\n");
      out.write("        cursor: default; /* Disable cursor for other input fields */\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/UpdateUser\" method=\"post\" accept-charset=\"UTF-8\" class=\"border p-4 rounded bg-light\">\r\n");
      out.write("  <h2 class=\"text-center mb-4\">Create Mark Blog</h2><br>\r\n");
      out.write("	<input type=\"hidden\" name=\"id\" value=\"");
      out.print( user.getId());
      out.write("\"/>\r\n");
      out.write("  <div class=\"mb-3\">\r\n");
      out.write("    <label for=\"name\" class=\"form-label\">University Name</label>\r\n");
      out.write("  ");
 if(pageuser != null && !pageuser.getUniname().isEmpty()) { 
      out.write("\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"name\"  name=\"uniname\" readonly placeholder=\"Enter Your Name\" value=\"");
      out.print( pageuser.getUniname() );
      out.write("\" required>\r\n");
      out.write("                ");
 } else { 
      out.write("\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"name\"  name=\"uniname\" readonly placeholder=\"Enter Your Name\" value=\"");
      out.print( user.getUniname() );
      out.write("\" required>\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"mb-3\">\r\n");
      out.write("    <label for=\"location\" class=\"form-label\">Location</label>\r\n");
      out.write("    ");
 if(pageuser != null && !pageuser.getUniname().isEmpty()) { 
      out.write("\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"location\" name=\"location\" readonly value=\"");
      out.print( pageuser.getLocation() );
      out.write("\" placeholder=\"Enter Your location\" required>\r\n");
      out.write("                ");
 } else { 
      out.write("\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"location\" name=\"location\" readonly value=\"");
      out.print( user.getLocation() );
      out.write("\" placeholder=\"Enter Your location\" required>\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"mb-3\">\r\n");
      out.write("    <label for=\"mark\" class=\"form-label\">Mark</label>\r\n");
      out.write("    <input type=\"text\" class=\"form-control\" id=\"Mark\" value=\"");
      out.print( user.getMark() );
      out.write("\" name=\"mark\" placeholder=\"Enter Your mark\" required>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("    <div class=\"mb-3\">\r\n");
      out.write("    <label for=\"link\" class=\"form-label\">Link</label>\r\n");
      out.write("    <input type=\"text\" class=\"form-control\" id=\"link\" readonly  value=\"");
      out.print( user.getLink() );
      out.write("\" name=\"link\" placeholder=\"Enter Your link\" required>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"mb-3\">\r\n");
      out.write("    <button type=\"submit\" class=\"btn btn-primary btn-block\">Update</button>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

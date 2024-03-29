/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.84
 * Generated at: 2024-02-06 03:59:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.AdminLTE.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import crud.User;
import crud.UserDAO;
import pagecreate.pageUserDAO;
import pagecreate.pageUser;
import java.util.ArrayList;

public final class simple_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("java.util.ArrayList");
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("\r\n");

List<String> distinctUniNames = new pageUserDAO().getDistinctUniNames();


      out.write("\r\n");
      out.write("\r\n");

    String searchQuery = request.getParameter("search");

    List<User> userList;
    if (searchQuery != null && !searchQuery.isEmpty()) {
    	searchQuery = searchQuery.trim();
        userList = new UserDAO().searchUsers(searchQuery);
    } else {
        userList = new UserDAO().getAllUsers();
    }

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <title>AdminLTE 3 | Widgets</title>\r\n");
      out.write("\r\n");
      out.write("  <!-- Google Font: Source Sans Pro -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback\">\r\n");
      out.write("  <!-- Font Awesome -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"../plugins/fontawesome-free/css/all.min.css\">\r\n");
      out.write("  <!-- Ionicons -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css\">\r\n");
      out.write("  <!-- Theme style -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"../dist/css/adminlte.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"hold-transition sidebar-mini\">\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("  <!-- Navbar -->\r\n");
      out.write("  <nav class=\"main-header navbar navbar-expand navbar-white navbar-light\">\r\n");
      out.write("    <!-- Left navbar links -->\r\n");
      out.write("    <ul class=\"navbar-nav\">\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" data-widget=\"pushmenu\" href=\"#\" role=\"button\"><i class=\"fas fa-bars\"></i></a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item d-none d-sm-inline-block\">\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/AdminLTE/User/userHome.jsp\" class=\"nav-link\">Home</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item d-none d-sm-inline-block\">\r\n");
      out.write("        <a href=\"#\" class=\"nav-link\">Contact</a>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    \r\n");
      out.write("  </nav>\r\n");
      out.write("  <!-- /.navbar -->\r\n");
      out.write("	\r\n");
      out.write("  <!-- Main Sidebar Container -->\r\n");
      out.write("  <aside class=\"main-sidebar sidebar-dark-primary elevation-4\">\r\n");
      out.write("    <!-- Brand Logo -->\r\n");
      out.write("    <a href=\"../index3.html\" class=\"brand-link\">\r\n");
      out.write("      <img src=\"../dist/img/AdminLTELogo.png\" alt=\"AdminLTE Logo\" class=\"brand-image img-circle elevation-3\" style=\"opacity: .8\">\r\n");
      out.write("      <span class=\"brand-text font-weight-light\">AdminLTE 3</span>\r\n");
      out.write("    </a>\r\n");
      out.write("\r\n");
      out.write("    <!-- Sidebar -->\r\n");
      out.write("    <div class=\"sidebar\">\r\n");
      out.write("      <!-- Sidebar user panel (optional) -->\r\n");
      out.write("      <div class=\"user-panel mt-3 pb-3 mb-3 d-flex\">\r\n");
      out.write("        <div class=\"image\">\r\n");
      out.write("          <img src=\"../dist/img/user2-160x160.jpg\" class=\"img-circle elevation-2\" alt=\"User Image\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"info\">\r\n");
      out.write("          <a href=\"#\" class=\"d-block\">Alexander Pierce</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- Sidebar Menu -->\r\n");
      out.write("      <nav class=\"mt-2\">\r\n");
      out.write("        <ul class=\"nav nav-pills nav-sidebar flex-column\" data-widget=\"treeview\" role=\"menu\" data-accordion=\"false\">\r\n");
      out.write("         ");
 for(String a : distinctUniNames){ 
      out.write("\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a href=\"#\" class=\"nav-link\">\r\n");
      out.write("              <i class=\"nav-icon fas fa-tachometer-alt\"></i>\r\n");
      out.write("              <p>\r\n");
      out.write("                ");
      out.print( a );
      out.write("\r\n");
      out.write("                <i class=\"right fas fa-angle-left\"></i>\r\n");
      out.write("              </p>\r\n");
      out.write("            </a>\r\n");
      out.write("            <ul class=\"nav nav-treeview\">\r\n");
      out.write("            ");

				List<pageUser> userdata = new pageUserDAO().getUserByName(a);
		
      out.write("\r\n");
      out.write("            ");
 for(pageUser user : userdata) {
      out.write("\r\n");
      out.write("              <li class=\"nav-item\">\r\n");
      out.write("                <a href=\"example.jsp?id=");
      out.print( user.getId());
      out.write("\" class=\"nav-link\">\r\n");
      out.write("                  <i class=\"far fa-circle nav-icon\"></i>\r\n");
      out.write("                  <p>");
      out.print( user.getLocation() );
      out.write("</p>\r\n");
      out.write("                </a>\r\n");
      out.write("              </li>\r\n");
      out.write("              ");
} 
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("          ");
} 
      out.write("\r\n");
      out.write("                   <li class=\"nav-item\">\r\n");
      out.write("            <a href=\"#\" class=\"nav-link\">\r\n");
      out.write("              <i class=\"nav-icon fas fa-search\"></i>\r\n");
      out.write("              <p>\r\n");
      out.write("                Search\r\n");
      out.write("                <i class=\"fas fa-angle-left right\"></i>\r\n");
      out.write("              </p>\r\n");
      out.write("            </a>\r\n");
      out.write("            <ul class=\"nav nav-treeview\">\r\n");
      out.write("              <li class=\"nav-item\">\r\n");
      out.write("                <a href=\"simple.jsp\" class=\"nav-link\">\r\n");
      out.write("                  <i class=\"far fa-circle nav-icon\"></i>\r\n");
      out.write("                  <p>UniName</p>\r\n");
      out.write("                </a>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"nav-item\">\r\n");
      out.write("                <a href=\"location.jsp\" class=\"nav-link\">\r\n");
      out.write("                  <i class=\"far fa-circle nav-icon\"></i>\r\n");
      out.write("                  <p>Mark</p>\r\n");
      out.write("                </a>\r\n");
      out.write("              </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("      </nav>\r\n");
      out.write("      <!-- /.sidebar-menu -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.sidebar -->\r\n");
      out.write("  </aside>\r\n");
      out.write("  <!-- Content Wrapper. Contains page content -->\r\n");
      out.write("   <div class=\"content-wrapper\">\r\n");
      out.write("    <!-- Main content -->\r\n");
      out.write("    <section class=\"content\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <h2 class=\"text-center display-4\">Location or UniName Search</h2>\r\n");
      out.write("            <form action=\"\" method=\"get\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-10 offset-md-1\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-6\">\r\n");
      out.write("                                \r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-3\">\r\n");
      out.write("                                \r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-3\">\r\n");
      out.write("                                \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <div class=\"input-group input-group-lg\">\r\n");
      out.write("                                <input type=\"search\" class=\"form-control form-control-lg\" name=\"search\" placeholder=\"Enter UniName or Location\" value=\"\">\r\n");
      out.write("                                <div class=\"input-group-append\">\r\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-lg btn-default\">\r\n");
      out.write("                                        <i class=\"fa fa-search\"></i>\r\n");
      out.write("                                    </button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("            <div class=\"content\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-12\">\r\n");
      out.write("          <div class=\"card\">\r\n");
      out.write("            <div class=\"card-header\">\r\n");
      out.write("              <h3 class=\"card-title\">Bordered Table</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("         \r\n");
      out.write("            <div class=\"card-body\">\r\n");
      out.write("              <table class=\"table table-bordered\">\r\n");
      out.write("                <thead>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <th style=\"width: 10px\">id</th>\r\n");
      out.write("                    <th>University Name</th>\r\n");
      out.write("                    <th>Location</th>\r\n");
      out.write("                    <th>Mark</th>\r\n");
      out.write("                    <th>Link</th>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("                  \r\n");
      out.write("                   ");
 for (User user : userList) { 
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>");
      out.print( user.getId() );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( user.getUniname() );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( user.getLocation() );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( user.getMark() );
      out.write("\r\n");
      out.write("                <td>\r\n");
      out.write("                <a href=\"example.jsp?id=");
      out.print( user.getLink() );
      out.write("\">Go to page</a>\r\n");
      out.write("                </td>\r\n");
      out.write("                \r\n");
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("                </tbody>\r\n");
      out.write("              </table>\r\n");
      out.write("              <br>\r\n");
      out.write("           \r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.card-body -->\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    </section>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- /.content-wrapper -->\r\n");
      out.write("\r\n");
      out.write("  <footer class=\"main-footer\">\r\n");
      out.write("    <div class=\"float-right d-none d-sm-block\">\r\n");
      out.write("      <b>Version</b> 3.2.0\r\n");
      out.write("    </div>\r\n");
      out.write("    <strong>Copyright &copy; 2014-2021 <a href=\"https://adminlte.io\">AdminLTE.io</a>.</strong> All rights reserved.\r\n");
      out.write("  </footer>\r\n");
      out.write("\r\n");
      out.write("  <!-- Control Sidebar -->\r\n");
      out.write("  <aside class=\"control-sidebar control-sidebar-dark\">\r\n");
      out.write("    <!-- Control sidebar content goes here -->\r\n");
      out.write("  </aside>\r\n");
      out.write("  <!-- /.control-sidebar -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ./wrapper -->\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery -->\r\n");
      out.write("<script src=\"../plugins/jquery/jquery.min.js\"></script>\r\n");
      out.write("<!-- Bootstrap 4 -->\r\n");
      out.write("<script src=\"../plugins/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<!-- AdminLTE App -->\r\n");
      out.write("<script src=\"../dist/js/adminlte.min.js\"></script>\r\n");
      out.write("<!-- AdminLTE for demo purposes -->\r\n");
      out.write("<script src=\"../dist/js/demo.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

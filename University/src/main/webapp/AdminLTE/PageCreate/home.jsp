<%@ page language="java" contentType="text/html;  charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.List" %>
<%@ page import="pagecreate.pageUser" %>
<%@ page import="pagecreate.pageUserDAO" %>
<%@ page import="crud.User" %>
<%@ page import="crud.UserDAO" %>
<%@ page import="java.util.ArrayList" %>

<%
    String searchQuery = request.getParameter("search");
	
    List<pageUser> userList;
    if (searchQuery != null && !searchQuery.isEmpty()) {
    	userList = new pageUserDAO().searchUsers(searchQuery);
    } else {
        userList = new pageUserDAO().getAllUsers();
    }


%>
<%
	
    List<User> check = new UserDAO().getAllUsers();
    
    // Initialize linkData array with the size of check list
    String[] linkData = new String[check.size()];
    
    // Loop through each user and add their link to linkData array
    int i = 0;
    for (User a : check) {
        linkData[i] = a.getLink();
        i++;
    }
%>


<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Blog/App</title>
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
  <!-- Font Awesome Icons -->
  <link rel="stylesheet" href="../plugins/fontawesome-free/css/all.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="../dist/css/adminlte.min.css">
</head>
<body class="hold-transition sidebar-mini">
<div class="wrapper">
  <nav class="main-header navbar navbar-expand navbar-white navbar-light">
    <!-- Left navbar links -->
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" data-widget="pushmenu" href="#" role="button"><i class="fas fa-bars"></i></a>
      </li>
    </ul>
     <ul class="navbar-nav ml-auto">
     <li class="nav-item">
        <a class="nav-link" data-widget="navbar-search" href="#" role="button">
          <i class="fas fa-search"></i>
        </a>
        <div class="navbar-search-block">
          <form class="form-inline" method="get" action="">

            <div class="input-group input-group-sm">
              <input class="form-control form-control-navbar" name= "search" type="search" placeholder="Search" aria-label="Search">
              <div class="input-group-append">
                <button class="btn btn-navbar" type="submit">
                  <i class="fas fa-search"></i>
                </button>
                <button class="btn btn-navbar" type="button" data-widget="navbar-search">
                  <i class="fas fa-times"></i>
                </button>
              </div>
            </div>
          </form>
          
        </div>
      </li>
    </ul>
  </nav>
  <aside class="main-sidebar sidebar-dark-primary elevation-4">
    <a href="index3.html" class="brand-link">
      <img src="../dist/img/AdminLTELogo.png" alt="AdminLTE Logo" class="brand-image img-circle elevation-3" style="opacity: .8">
      <span class="brand-text font-weight-light">
        Blog
      </span>
    </a>
    <div class="sidebar">
      <div class="user-panel mt-3 pb-3 mb-3 d-flex">
        <div class="image">
          <img src="../dist/img/user2-160x160.jpg" class="img-circle elevation-2" alt="User Image">
        </div>
        <div class="info">
          <a href="#" class="d-block">
            Name
          </a>
        </div>
      </div>
      <nav class="mt-2">
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-tachometer-alt"></i>
              <p>
                Pages
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="${pageContext.request.contextPath}/AdminLTE/loginAndregister/home.jsp" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>University</p>
                </a>
              </li>

            </ul>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="${pageContext.request.contextPath}/AdminLTE/User/userHome.jsp" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>User</p>
                </a>
              </li>

            </ul>
          </li>
                   
            </ul>
      </nav>
      <!-- /.sidebar-menu -->
    </div>
  </aside>
  <div class="content-wrapper">
    <div class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1 class="m-0">Starter Page</h1>
          </div>
          <br>
        </div>
      </div>
      <div>
      	
           <a href="${pageContext.request.contextPath}/AdminLTE/PageCreate/add.jsp" class="btn btn-warning">
              Create Page 
          </a>


          <div class="float-right d-none d-sm-inline">
      <a href="${pageContext.request.contextPath}/DeleteAll" type="button" class="btn btn-danger">
        DeleteAll
      </a>
    </div>
          
      </div>
    </div>
    <div class="content">
      <div class="row">
        <div class="col-md-12">
          <div class="card">
            <div class="card-header">
              <h3 class="card-title">Bordered Table</h3>
            </div>


         
            <div class="card-body">
              <table class="table table-bordered">
                <thead>
                  <tr>
                    <th style="width: 10px">id</th>
                    <th>University Name</th>
                    <th>Location</th>
                    <th>Description</th>
                    <th>logo</th>
                    <th>image</th>
                    <th>Add Mark</th>
                    <th style="width: 40px">Action</th>
                  </tr>
                </thead>
                <tbody>
                  
                   <% 
                   int j=0;
                   
                   for (pageUser user : userList) {
                	  String desc = user.getDesc().substring(0,50);
                	   %>
            <tr>
                <td><%= user.getId() %></td>
                <td><%= user.getUniname() %></td>
                <td><%= user.getLocation() %></td>
                <td><%= desc %>...</td>
                <td><%= user.getLogo() %></td>
                <td><%= user.getImage() %></td>
              <%
    // Ensure j is properly initialized and within bounds
    
    // Iterate through linkData
    if(j < linkData.length) {
            if (Integer.toString(user.getId()).equals(linkData[j])) {
%>
                <td><a href="">Finished</a></td>
<%
            
        } else {
%>
            <td><a href="../loginAndregister/add.jsp?id=<%= user.getId() %>">Add</a></td>
<%
        
        
    }
    }else{
             
%>
<td><a href="../loginAndregister/add.jsp?id=<%= user.getId() %>">Add</a></td>
<%} %>
              
               
                <td><a href="edit.jsp?id=<%= user.getId()%>">Edit</a>
                <a href="${pageContext.request.contextPath}/pageDeleteUser?id=<%= user.getId() %>">Delete</a>
                
	</td>
            </tr>
        <% j++;} %>
                </tbody>
              </table>
              <br>
            </div>
          </div>
        </div>
      </div>

    </div>
  </div>
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
    <div class="p-3">
      <h5>Title</h5>
      <p>Sidebar content</p>
    </div>
  </aside>
  <!-- /.control-sidebar -->

  <!-- Main Footer -->
  <footer class="main-footer">
    <!-- To the right -->
    <div class="float-right d-none d-sm-inline">
      <a href="../loginAndregister/logout.jsp" type="button" class="btn btn-danger">
        Logout
      </a>
    </div>
    <!-- Default to the left -->
    <strong>Copyright &copy; 2023-2024 <a href="#">Blog App</a>.</strong> 
      
  </footer>
</div>
<script src="..//plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="../plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="../dist/js/adminlte.min.js"></script>
</body>
</html>
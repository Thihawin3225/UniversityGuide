<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="pagecreate.pageUser" %>
<%@ page import="pagecreate.pageUserDAO" %>
<%@ page import="crud.User" %>
<%@ page import="crud.UserDAO" %>
<%@ page import="java.util.List" %>
<%
    int userId = Integer.parseInt(request.getParameter("id"));
    pageUser user = new pageUserDAO().getUserById(userId);
    List<User> aa = new UserDAO().getAllUsers();
    for(User a: aa){
    	if(a.getLink().equals(request.getParameter("id"))){
    		response.sendRedirect("../PageCreate/home.jsp");
    	}
    }
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
      <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

</head>
<style>
    .container{
          margin-top: 30px;
          width: 400px;
          padding : 20px;
    }
    form div{
        margin : 10px;
    }
</style>
<body>

<div class="container">
<form action="${pageContext.request.contextPath}/Insert" method="post" accept-charset="UTF-8" class="border p-4 rounded bg-light">

  <h2 class="text-center mb-4">Create Your Blog</h2><br>

  <div class="mb-3">
    <label for="name" class="form-label">University Name</label>
    <input type="text" class="form-control" id="name" name="uniname"  value="<%= user.getUniname() %>" readonly  placeholder="Enter Your Name" required>
  </div>

  <div class="mb-3">
    <label for="location" class="form-label">Location</label>
    <input type="text" class="form-control" id="location" name="location" readonly value="<%=user.getLocation() %>" placeholder="Enter Your location" required>
  </div>
  
  <div class="mb-3">
    <label for="mark" class="form-label">Mark</label>
    <input type="text" class="form-control" id="Mark" name="mark" placeholder="Enter Your mark" required>
  </div>
  
    <div class="mb-3">
    <label for="link" class="form-label">Link</label>
    <input type="text" class="form-control" id="link" name="link" readonly value="<%= userId %>" placeholder="Enter Your link" required>
  </div>
  
  <div class="mb-3">
    <button type="submit" class="btn btn-primary btn-block">Add</button>
  </div>


  
</form>
  </div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

</body>
</html>

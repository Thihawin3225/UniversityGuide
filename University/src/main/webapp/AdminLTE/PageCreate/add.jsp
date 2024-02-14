<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="crud.User" %>
<%@ page import="crud.UserDAO" %>
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
	<form action="${pageContext.request.contextPath}/pageInsert" method="post" accept-charset="UTF-8" enctype="multipart/form-data" class="border p-4 rounded bg-light">
    <h2 class="text-center mb-4">Create Your Blog</h2><br>
  <div class="mb-3">
    <label for="name" class="form-label">University Name</label>
    <input type="text" class="form-control" id="name" name="uniname" placeholder="Enter Your Name" required>
  </div>

  <div class="mb-3">
    <label for="location" class="form-label">Location</label>
    <input type="text" class="form-control" id="location" name="location" placeholder="Enter Your location" required>
  </div>
  
  <div class="mb-3">
    <label for="mark" class="form-label">Description</label>
    <textarea class="form-control" id="Mark" name="desc" placeholder="Enter Your desc" required></textarea>
  </div>

    <div class="mb-3">
        <label for="image" class="form-label">Image</label>
        <input type="file" class="form-control" id="image" name="image" required>
    </div>

    <div class="mb-3">
        <label for="logo" class="form-label">Logo</label>
        <input type="file" class="form-control" id="logo" name="logo" required>
    </div>

    <!-- Other form fields... -->

    <div class="mb-3">
        <button type="submit" class="btn btn-primary btn-block">Add</button>
    </div>
      <div class="mb-3 text-center">
    <a href="home.jsp" class="btn btn-danger btn-block">Back</a>
  </div>
</form>
	


  </div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

</body>
</html>

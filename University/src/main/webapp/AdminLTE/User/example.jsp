<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="pagecreate.pageUser" %>
<%@ page import="pagecreate.pageUserDAO" %>
<%@ page import="java.util.ArrayList" %>

<%
int userId = Integer.parseInt(request.getParameter("id"));
pageUser user = new pageUserDAO().getUserById(userId);

%>
    
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>University Home Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }

        header {
            background-color: #333;
            color: #fff;
            padding: 10px;
            text-align: center;
        }

        nav {
            background-color: #555;
            padding: 10px;
            text-align: center;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        nav a {
            color: #fff;
            text-decoration: none;
            margin: 0 15px;
        }

        nav img {
            max-height: 50px;
            margin-right: 15px;
        }

        section {
            padding: 20px;
            text-align: center;
        }

        section img {
            max-width: 100%;
            height: auto;
            border-radius: 10px;
            margin: 20px 0;
        }

        footer {
            background-color: #333;
            color: #fff;
            padding: 10px;
            text-align: center;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
    </style>
</head>

<body>
    <header>
        <h1><%= user.getUniname() %> &nbsp; (<%= user.getLocation() %>)</h1>
        <p>Empowering Minds, Transforming Lives</p>
    </header>

    <nav>
        <img src="<%= user.getImage() %>" alt="University Logo">


        <div>
            <a href="#">Home</a>
            <a href="#">Admissions</a>
            <a href="#">Departments</a>
            <a href="#">Courses</a>
            <a href="#">About Us</a>
            <a href="#">Contact</a>
        </div>
    </nav>

    <section>
        <h2>Welcome to Our University!</h2>
        <img src="C:/Users/Acer/Desktop/UniversityGuide/University/img/<%= user.getImage() %>" alt="University Logo">

        <p><%= user.getDesc() %></p>
    </section>

    <footer>
        <p>&copy; 2024 University Name. All rights reserved.</p>
    </footer>
</body>

</html>




<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="pagecreate.pageUser" %>
<%@ page import="pagecreate.pageUserDAO" %>
<%@ page import="java.util.ArrayList" %>

<%
int userId = Integer.parseInt(request.getParameter("id"));
pageUser user = new pageUserDAO().getUserById(userId);
String[] paragraphArray = user.getDesc().split("\\n");
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        body {
            font-family: 'Roboto', sans-serif;
            background: #FEFCF3;
            margin: 0;
            padding: 0;
        }
        nav {
            display: flex;
            flex-direction: row;
            justify-content: space-around;
            align-items: center;
            height: 90px;
            background-color: #568A54; /* Change this to the desired color */
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }
        .color-ful {
            display: flex;
            flex-direction: column;
            justify-content: start;
            align-items: start;
            max-width: 900px;
            margin: 50px auto;
            padding: 20px;
            background-color: #FFFFFF; /* Change this to the desired color */
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }
        .name{
        color:#FFFFFF;
        }
        h1 {
            font-size: 24px;
            margin-bottom: 20px;
        }
        p {
            text-align: justify;
            line-height: 1.6;
            margin-bottom: 20px;
        }
        .my-img {
            width: 100%;
            height: 450px;
            object-fit: cover;
            border-radius: 10px;
        }
        .logo {
            width: 65px;
            height: 65px;
            border-radius: 50%;
            line-height: 45px;
        }
        .container{
        background-color:#36384E;
        padding:15px;
        color:white;
        }
        .container p {
            text-align: center;
        }
    </style>
</head>
<body>
    <nav>

        <div>
        <img class="logo" src="../../img/<%= user.getLogo() %>" alt="">
</div>
        <div class="name"><%= user.getUniname() %>(<%= user.getLocation() %>)</div>
    </nav>
    <div class="color-ful">
        <img class="my-img" src="../../img/<%= user.getImage() %>" alt="">
        <h1><%= user.getLocation() %><%= user.getUniname() %></h1>
        <% 
    for (String paragraph : paragraphArray) {
%>
    <p><%= paragraph %></p>
<%
}
%>
        
    </div>
    <footer>
    <div class="container">
        <p>&copy; 2022 Your Website. All rights reserved.</p>
    </div>
</footer>
</body>
</html>
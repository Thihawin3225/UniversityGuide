package crud;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Insert")
public class InsertUser extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve user data from the form
    	request.setCharacterEncoding("UTF-8");
    	PrintWriter out = response.getWriter();
        String uniname = request.getParameter("uniname");
        String location = request.getParameter("location");
        String mark = request.getParameter("mark");
        String link = request.getParameter("link");
        // Create a new User object
        User user = new User(uniname, location, mark, link);
        UserDAO userDAO = new UserDAO();
        userDAO.insertUser(user);
        
        response.sendRedirect("AdminLTE/loginAndregister/home.jsp");
    }
}

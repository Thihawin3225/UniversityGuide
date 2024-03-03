package crud;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteUser
 */
@WebServlet("/deleteMark")
public class DeleteUser extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve user ID from the request parameter
        int userId = Integer.parseInt(request.getParameter("id"));

        // Delete the user from the database
        UserDAO userDAO = new UserDAO();
        userDAO.deleteUser(userId);

        // Redirect to the user list page or any other page you desire
        response.sendRedirect("AdminLTE/loginAndregister/home.jsp");
    }
}


package pagecreate;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class pageDeleteUser
 */
@WebServlet("/pageDeleteUser")
public class pageDeleteUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve user ID from the request parameter
        int userId = Integer.parseInt(request.getParameter("id"));
        // Delete the user from the database
        pageUserDAO userDAO = new pageUserDAO();
        userDAO.deleteUser(userId);

        // Redirect to the user list page or any other page you desire
        response.sendRedirect("deleteMark?id="+userId);
    }
}

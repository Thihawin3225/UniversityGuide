package pagecreate;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import crud.UserDAO;

/**
 * Servlet implementation class DeleteAll
 */
@WebServlet("/DeleteAll")
public class DeleteAll extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        pageUserDAO userDAO = new pageUserDAO();
        userDAO.getDeleteAll();
        UserDAO user = new UserDAO();
        user.getDeleteAll();
        response.sendRedirect("AdminLTE/loginAndregister/home.jsp");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        pageUserDAO userDAO = new pageUserDAO();
        userDAO.getDeleteAll();
        UserDAO user = new UserDAO();
        user.getDeleteAll();
        response.sendRedirect("AdminLTE/loginAndregister/home.jsp");
    }
}

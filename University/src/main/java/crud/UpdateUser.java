package crud;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class UpdateUser extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve user data from the form
    	 PrintWriter out = response.getWriter();
    	 request.setCharacterEncoding("UTF-8");
    	
        int id = Integer.parseInt(request.getParameter("id"));
        String uniname = request.getParameter("uniname");
        String location = request.getParameter("location");
        String mark = request.getParameter("mark");
        String link = request.getParameter("link");
       
//        out.println(id + uniname + location + mark + link);
        User user = new User(id, uniname, location, mark, link);

        // Update the user in the database
        UserDAO userDAO = new UserDAO();
        userDAO.updateUser(user);

        // Redirect to the user list page or any other page you desire
        response.sendRedirect("AdminLTE/loginAndregister/home.jsp");
    }
}

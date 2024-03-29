package LoginAndRegister;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class seregister
 */
@WebServlet("/seregister")
public class seregister extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("name");
        String upassword = request.getParameter("password");
        String uemail = request.getParameter("email");
        PrintWriter out = response.getWriter();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/universityguide", "root", "");

            // Consider using password hashing here before storing it in the database
            // Example: String hashedPassword = BCrypt.hashpw(upassword, BCrypt.gensalt());

            PreparedStatement pst = con.prepareStatement("INSERT INTO register(name, email, password) VALUES (?, ?, ?)");
            pst.setString(1, uname);
            pst.setString(2, uemail);
            pst.setString(3, upassword);

            int row = pst.executeUpdate();

            if (row > 0) {
                request.setAttribute("status", "success");
                response.sendRedirect("AdminLTE/loginAndregister/login.jsp");
            } else {
                request.setAttribute("status", "fail");
                request.getRequestDispatcher("AdminLTE/loginAndregister/login.jsp").forward(request, response);
            }
            
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
    }
	}


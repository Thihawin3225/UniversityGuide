package pagecreate;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class pageUpdateUser
 */
@WebServlet("/pageupdate")
@MultipartConfig(
	    fileSizeThreshold = 1024 * 1024 * 2,  // 2MB
	    maxFileSize = 1024 * 1024 * 10,        // 10MB
	    maxRequestSize = 1024 * 1024 * 50      // 50MB
	)
public class pageUpdateUser extends HttpServlet {
	 private static final long serialVersionUID = 1L;

	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        String imageFileName = "";
	        String logoFileName = "";
	        PrintWriter out = response.getWriter();
	        try {
	            Part file = request.getPart("image");
	            Part logofile = request.getPart("logo");
	            imageFileName = file.getSubmittedFileName();
	            logoFileName = logofile.getSubmittedFileName();
	            String uploadDirectory = "C:" + File.separator + "Users" + File.separator + "Acer" + File.separator + 
	            		"Desktop" + File.separator + "UniversityGuide" + File.separator + "University" + File.separator + 
	            		"src" + File.separator + "main" + File.separator + "webapp" + File.separator + "img"+ File.separator + imageFileName;


	            String uploadlogoDirectory = "C:" + File.separator + "Users" + File.separator + "Acer" + File.separator + 
	            		"Desktop" + File.separator + "UniversityGuide" + File.separator + "University" + File.separator + 
	            		"src" + File.separator + "main" + File.separator + "webapp" + File.separator + "img"+ File.separator + logoFileName;


	            // Check if the file already exists, and if yes, consider renaming or handling accordingly
	            File existingFile = new File(uploadDirectory);
	            File existinglogoFile = new File(uploadlogoDirectory);
	            if (existingFile.exists() || existinglogoFile.exists()) {
	                // Handle the case where the file already exists
	            }

	            try (FileOutputStream fos = new FileOutputStream(uploadDirectory);
	                 InputStream is = file.getInputStream()) {

	                byte[] data = new byte[is.available()];
	                is.read(data);
	                fos.write(data);
	            }

	            try (FileOutputStream foslogo = new FileOutputStream(uploadlogoDirectory);
	                 InputStream is = logofile.getInputStream()) {

	                byte[] data = new byte[is.available()];
	                is.read(data);
	                foslogo.write(data);
	            }
	        } catch (IOException | ServletException e) {
	            e.printStackTrace();
	            // Handle the exception (e.g., forward to an error page)
	            out.println(e.getMessage());
	            return; // Return to avoid executing the rest of the code after an error
	        }

	       String uniname = request.getParameter("uniname");
	       String location = request.getParameter("location");
	       String description = request.getParameter("desc");
	       int id = Integer.parseInt(request.getParameter("id"));

	        // Create a new User object
	     pageUser user = new pageUser(id,uniname, location, description, logoFileName, imageFileName);
	        // Insert the user into the database
	    
	     pageUserDAO userDAO = new pageUserDAO();
	      userDAO.updateUser(user);
	      
	        response.sendRedirect("AdminLTE/loginAndregister/edit.jsp?id="+id);
	    }
}

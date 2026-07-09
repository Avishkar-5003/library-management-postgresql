

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 * Servlet implementation class Profile
 */
@WebServlet("/Profile")
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;
           @Override
        	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        		
        	   PrintWriter out = resp.getWriter();
       		
       		Database db = new Database();
       		String result = db.Connectdb();
       		out.println(result);
           	
       	     
       		String full_Name = req.getParameter("full_Name");
       		String email  = req.getParameter("email"); 
       		String mobile  = req.getParameter("mobile");
       		String photo = req.getParameter("photo");
       		String event  = req.getParameter("submit"); 
       		
       		
       		out.println(full_Name);
       	    out.println(email); 
       	    out.println(mobile); 
       	    out.println(event);
       	
       	 if(event.equals("Submit"))
       	 {
       		 if(full_Name.equals("") || email.equals("") || mobile.equals("") || photo.equals(""))
       		 {
       			 resp.setContentType("text/html");
       			 out.println("<script type=\"text/javascript\"> alert('Some value is empty'); location='Profile_page.jsp'; </script>");
       		 }
       		else
			{
				try
				{
					String sql = "insert into Profile ( full_Name, email, mob_no , photo) values ('"+full_Name+"' , '"+email+"' , '"+mobile+"','"+photo+"' ) ";
					String insert = db.Insert(sql);
					out.println(insert);
					resp.setContentType("text/html");
		    		 out.println(" <script type=\"text/javascript\">  alert('Data inserted Sucessfullyy'); location='User_login.jsp';  </script> ");
				}
				catch (Exception e) 
				{ 
					out.println(e.toString());
				}
			}
		}
		
		
		
		
		
		
	}

}
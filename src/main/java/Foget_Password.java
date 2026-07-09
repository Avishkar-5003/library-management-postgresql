

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;

/**
 * Servlet implementation class Foget_Password
 */
@WebServlet("/Forget_Password")
public class Foget_Password extends HttpServlet {
	 Connection cn = null;
	  
	  Statement st = null;
	
	
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
       PrintWriter out = resp.getWriter();
		
		Database db = new Database();
		String result = db.Connectdb();
		
	   out.println(result);
	   
	   
	   String Mail = req.getParameter("Mail"); 
       String Set_password = req.getParameter("Set_password");
       String Confirm_password  =  req.getParameter("Confirm_password");
       String event = req.getParameter("submit");
	
	     out.println(Mail); 
	     out.println(Set_password);
	     out.println(Confirm_password);
	     out.println(event);
   	
	     if(event.equals("Submit"))
	     {
	    	 if(Mail.equals("")  || Set_password.equals("") || Confirm_password.equals("") )
	    	 {
	    		 resp.setContentType("text/html");
       			 out.println("<script type=\"text/javascript\"> alert('Some value is empty'); location='Forget_Password.jsp'; </script>");
	    	 }
	    	 else
	    	 {
	    		 try
					{
						String sql = " update user_signup set create_pass = '"+Set_password+"' , confirm_pass = '"+Confirm_password+"' where email = '"+Mail+"' ";
						String update = db.update(sql);
						out.println(update);
						resp.setContentType("text/html");
			    		 out.println(" <script type=\"text/javascript\">  alert('Password Updated Sucessfully'); location='User_login.jsp';  </script> ");
					}
					catch (Exception e) 
					{ 
						out.println(e.toString());
					}
	    	 }
	     }
	}
}
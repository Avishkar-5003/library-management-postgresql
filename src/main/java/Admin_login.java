

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
 * Servlet implementation class Admin_login
 */
public class Admin_login extends HttpServlet {
	 Connection cn = null;
	  
	  Statement st = null;
	
	
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
       PrintWriter out = resp.getWriter();
		
		Database db = new Database();
		String result = db.Connectdb();
		out.println(result);
   
		   String username = req.getParameter("username");
	       String password  = req.getParameter("password");
	       String event  = req.getParameter("submit");
		
		     out.println(username);
		     out.println(password);
		     out.println(event);
	      
		     if(event.equals("submit"))
		     {
		    	 if(username.equals("tambeavishkar1@gmail.com") || password.equals("1234"))
		    	 {
		    		 resp.setContentType("text/html");
		  			 out.println(" <script type=\"text/javascript\">  alert('login sucess'); location='Admin_Dashboard.jsp';  </script> ");
		    	 }
		    	 else
		    	 {
		    		 resp.setContentType("text/html");
		  			 out.println(" <script type=\"text/javascript\">  alert('login failed'); location='Admin_login.jsp';  </script> ");
		    	 	    		 
		    	 }
		     }
	
	}
}
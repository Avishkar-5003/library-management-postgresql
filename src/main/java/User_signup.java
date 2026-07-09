

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 * Servlet implementation class User_signup
 */
public class User_signup extends HttpServlet {
	
	Connection cn = null;
	Statement st = null;
	
	
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			
		PrintWriter out = resp.getWriter();
		
		Database db = new Database();
		String result = db.Connectdb();
		out.println(result);
		
		String First_name = req.getParameter("First_name");
		String Last_name = req.getParameter("Last_name");
		String Email = req.getParameter("Email");
		String Create_Password = req.getParameter("Create_Password");
		String Confirm_Password = req.getParameter("Confirm_Password"); 
		String event = req.getParameter("submit");
		
		 
		out.println(First_name);
		out.println(Last_name);
		out.println(Email);
		out.println(Create_Password);
		out.println(Confirm_Password); 
		out.println(event);
		
		
		if(event.equals("Signup"))
		{
			if(First_name.equals("") || Last_name.equals("") || Email.equals("") || Create_Password.equals("") || Confirm_Password.equals(""))
			{
				resp.setContentType("text/html");
  				out.println(" <script type=\"text/javascript\">  alert('Some Value is Empty'); location='User_signup.jsp';  </script> ");

			}
			else
			{
				try
				{
					String sql = "insert into user_signup ( first_name, last_name, email, create_pass, confirm_pass ) values ('"+First_name+"' , '"+Last_name+"' , '"+Email+"' , '"+Create_Password+"' , '"+Confirm_Password+"') ";
					String insert = db.Insert(sql);
					out.println(insert);
					resp.setContentType("text/html");
		    		 out.println(" <script type=\"text/javascript\">  alert('You has been signup Sucessfully'); location='User_login.jsp';  </script> ");
				}
				catch (Exception e) 
				{ 
					out.println(e.toString());
				}
			}
		}
		
		
		
		
		
		
	}

}


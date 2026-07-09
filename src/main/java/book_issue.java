

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
 * Servlet implementation class book_issue
 */
@WebServlet("/book_issue")
public class book_issue extends HttpServlet {
	 Connection cn = null;
	  
	  Statement st = null;
	
	
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
       PrintWriter out = resp.getWriter();
		
		Database db = new Database();
		String result = db.Connectdb();
		out.println(result);
   	
		   String Receiver_Name = req.getParameter("Receiver_Name");
	       String Book_name  = req.getParameter("Book_name");
	       String Date = req.getParameter("Date");
	       String date  =  req.getParameter("date");
	       String event = req.getParameter("Submit");
		
		     out.println(Receiver_Name);
		     out.println(Book_name);
		     out.println(Date);
		     out.println(date);
		     out.println(event);
		     
		     if(event.equals("Submit"))
		     {
		    	 if(Receiver_Name.equals("") || Book_name.equals("") || Date.equals("") || date.equals(""))
		    	 { 
		    		 resp.setContentType("text/html");
		    		 out.println(" <script type=\"text/javascript\">  alert('Some Value is Empty'); location='book_issue.jsp';  </script> ");
		    	 }
		    	 else
		    	 {
		    		 try 
		    		 {
		    			 String sql = "insert into issue_book (receiver_name , book_name ,book_taken_date , book_receive_date) values ('"+Receiver_Name+"' , '"+Book_name+"' , '"+Date+"' , '"+date+"')";
		    			 String insert = db.Insert(sql);
		    			 out.println(insert);
		    			 resp.setContentType("text/html");
			    		 out.println(" <script type=\"text/javascript\">  alert('Book Has Been Issued'); location='book_issue.jsp';  </script> ");
		    			 
		    		 }
		    		 catch(Exception e)
		    		 {
		    			 out.println(e.toString());
		    		 }
		    	 }
		     }
	
	}
}
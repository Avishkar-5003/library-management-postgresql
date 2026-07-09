

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
 * Servlet implementation class Return_Book
 */
public class Return_Book extends HttpServlet {
	 Connection cn = null;
	  
	  Statement st = null;
	
	
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
       PrintWriter out = resp.getWriter();
		
		Database db = new Database();
		String result = db.Connectdb();
		out.println(result);
		
		String Receiver_name = req.getParameter("Receiver_name");
		String Book_name  =  req.getParameter("Book_name");
		String Date  =  req.getParameter("Date");
		String date  =  req.getParameter("date");
		String fine = req.getParameter("fine");
		String event = req.getParameter("Submit");
		
		
		out.println(Receiver_name);
		out.println(Book_name);
		out.println(Date);
		out.println(date);
		out.println(fine);
		out.println(event);
   	
	  if(event.equals("Submit"))
	  {
		  if(Receiver_name.equals("") || Book_name.equals("") || Date.equals("") || fine.equals("") )
		  {
			  resp.setContentType("text/html");
	    		 out.println(" <script type=\"text/javascript\">  alert('Some Value is Empty'); location='book_issue.jsp';  </script> ");		  }
		  else
		  {
			  try
				 {
					 String sql = "insert into Return_Book (receiver_name, book_name, book_taken_date, book_receive_date, fine ) values ('"+Receiver_name+"' , '"+Book_name+"' ,  '"+Date+"' , '"+date+"' , '"+fine+"')";
					   String insert = db.Insert(sql);
					   out.println(insert);
					   resp.setContentType("text/html");
			    		 out.println(" <script type=\"text/javascript\">  alert('Book return sucessfully'); location='book_issue.jsp';  </script> ");
				}
				  catch(Exception e)
				  {
					  out.println(e.toString());
				  }
		  }
	  }
	  
	  if(event.equals("Pay"))
	  {
		  if(Receiver_name.equals("") || Book_name.equals("") || Date.equals("") || date.equals("") || fine.equals("") )
		  {
			  out.println("some value is empty");
		  }
		  else
		  {
			  
			  try
			 {
				 String sql = "insert into Return_Book (receiver_name, book_name, book_taken_date, book_receive_date, fine ) values ('"+Receiver_name+"' , '"+Book_name+"' ,  '"+Date+"' , '"+date+"' , '"+fine+"')";
				   String insert = db.Insert(sql);
				   out.println(insert);
			}
			  catch(Exception e)
			  {
				  out.println(e.toString());
			  }
		  }
	  }
	  
	  }
	  
	}


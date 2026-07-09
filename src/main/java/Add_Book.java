

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
 * Servlet implementation class Add_Book
 */
@WebServlet("/Add_Book")
public class Add_Book extends HttpServlet {
	 Connection cn = null;
	  
	  Statement st = null;
	
	
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
       PrintWriter out = resp.getWriter();
		
		Database db = new Database();
		String result = db.Connectdb();
		out.println(result);
   	
		   String Book_Name = req.getParameter("Book_Name");
	       String Author_Name  = req.getParameter("Author_Name");
	       String Book_Price = req.getParameter("Book_Price");
	       String pages = req.getParameter("pages");
	       String Book_type = req.getParameter("Book_Name");
	       String Add_book = req.getParameter("Add_book");
	       String event  = req.getParameter("submit");
		
		     out.println(Book_Name);
		     out.println(Author_Name);
		     out.println(Book_Price);
		     out.println(pages);
		     out.println(Book_Name);
		     out.println(Add_book);
		     out.println(event);
		     
		     if(event.equals("Submit"))
		     {
		    	 if(Book_Name.equals("") || Author_Name.equals("") || Book_Price.equals("") ||  pages.equals("") || Book_Name.equals("") || Add_book.equals(""))
		    	 {
		    		 resp.setContentType("text/html");
		    		 out.println(" <script type=\"text/javascript\">  alert('Some Value is Empty'); location='book_issue.jsp';  </script> ");
		    	 }
		    	 else
		    	 {
		    		  try
		    		  {
		    			  String sql = "insert into admin_add_book (book_name, author_name, book_price, no_of_pages, add_book) values ('"+Book_Name+"' , '"+Author_Name+"' , '"+Book_Price+"' , '"+pages+"'  , '"+Add_book+"')";
		                  String insert = db.Insert (sql); 
		                  out.println(insert);
		                  resp.setContentType("text/html");
				    	  //out.println(" <script type=\"text/javascript\">  alert('Add Book sucessfully'); location='book_issue.jsp';  </script> ");
		    		  }
		    		  
		    		  catch(Exception e)
		    		  {
		    			  out.println(e.toString());
		    		  }
		    	 }
		     
		     }
	
	
	}
}
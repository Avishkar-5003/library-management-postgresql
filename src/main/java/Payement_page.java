

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
 * Servlet implementation class Payement_page
 */
@WebServlet("/Payment_page")
public class Payement_page extends HttpServlet {
	 Connection cn = null;
	  
	  Statement st = null;
	
	
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
       PrintWriter out = resp.getWriter();
		
		Database db = new Database();
		String result = db.Connectdb();
		out.println(result);

        String Cardholde_name = req.getParameter("Cardholde_name");
        String Card_number  = req.getParameter("Card_number");
        String Expiry_date = req.getParameter("Expiry_date");
        String Cvv  =  req.getParameter("Cvv");
        String event = req.getParameter("Submit");
	
	     out.println(Cardholde_name);
	     out.println(Card_number);
	     out.println(Expiry_date);
	     out.println(Cvv);
	     out.println(event);
	
         if(event.equals("Add card"))
         {
        	 if(Cardholde_name.equals("") || Card_number.equals("") || Expiry_date.equals("") || Cvv.equals("") )
        	 {
        		 resp.setContentType("text/html");
	    		 out.println(" <script type=\"text/javascript\">  alert('Some Value is Empty'); location='book_issue.jsp';  </script> ");        	 }
        	 else
        	 {
        		try
        		{
        			String sql = "insert into Payment_Page (cardholder_name , card_number , expiry_date , cvv) values ('"+Cardholde_name+"' , '"+Card_number+"' , '"+Expiry_date+"' , '"+Expiry_date+"')";
        			String insert = db.Insert(sql);
        			out.println(insert);
        			resp.setContentType("text/html");
		    		 out.println(" <script type=\"text/javascript\">  alert('Payment Sucessfully'); location='book_issue.jsp';  </script> ");
        		}
        		catch(Exception e)
        		{
        			out.println(e.toString());
        		}
        	 }
        	 
         } 	 

     
	}
}
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Return_Book")
public class Return_Book extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        Database db = new Database();
        db.Connectdb();

        String Receiver_name = req.getParameter("Receiver_name");
        String Book_name = req.getParameter("Book_name");
        String Date = req.getParameter("Date");
        String date = req.getParameter("date");
        String fine = req.getParameter("fine");
        String event = req.getParameter("Submit");

        if (event == null) {
            out.println("<script>alert('Invalid Request');history.back();</script>");
            return;
        }

        if (event.equals("Submit")) {

            if (Receiver_name == null || Receiver_name.trim().isEmpty()
                    || Book_name == null || Book_name.trim().isEmpty()
                    || Date == null || Date.trim().isEmpty()
                    || fine == null || fine.trim().isEmpty()) {

                out.println("<script>alert('Some Value is Empty');location='book_issue.jsp';</script>");
                return;
            }

            try {

                String sql =
                        "INSERT INTO return_book(receiver_name,book_name,book_taken_date,book_receive_date,fine) VALUES('"
                                + Receiver_name + "','"
                                + Book_name + "','"
                                + Date + "','"
                                + date + "','"
                                + fine + "')";

                String result = db.Insert(sql);

                if ("success".equals(result)) {

                    out.println("<script>alert('Book Returned Successfully');location='book_issue.jsp';</script>");

                } else {

                    out.println("<script>alert('" + result + "');location='book_issue.jsp';</script>");
                }

            } catch (Exception e) {

                out.println("<script>alert('" + e.getMessage() + "');location='book_issue.jsp';</script>");
            }
        }

        if (event.equals("Pay")) {

            try {

                String sql =
                        "INSERT INTO return_book(receiver_name,book_name,book_taken_date,book_receive_date,fine) VALUES('"
                                + Receiver_name + "','"
                                + Book_name + "','"
                                + Date + "','"
                                + date + "','"
                                + fine + "')";

                db.Insert(sql);

                out.println("<script>alert('Payment Successful');location='Payment_Page.jsp';</script>");

            } catch (Exception e) {

                out.println("<script>alert('" + e.getMessage() + "');location='book_issue.jsp';</script>");
            }
        }
    }
}
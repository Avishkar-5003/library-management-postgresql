import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/book_issue")
public class book_issue extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        Database db = new Database();
        db.Connectdb();

        String Receiver_Name = req.getParameter("Receiver_Name");
        String Book_name = req.getParameter("Book_name");
        String Date = req.getParameter("Date");
        String date = req.getParameter("date");
        String event = req.getParameter("Submit");

        if (event == null) {
            out.println("<script>alert('Invalid Request');location='book_issue.jsp';</script>");
            return;
        }

        if (event.equals("Submit")) {

            if (Receiver_Name == null || Receiver_Name.trim().isEmpty()
                    || Book_name == null || Book_name.trim().isEmpty()
                    || Date == null || Date.trim().isEmpty()
                    || date == null || date.trim().isEmpty()) {

                out.println("<script>alert('Some Value is Empty');location='book_issue.jsp';</script>");
                return;
            }

            try {

                String sql = "INSERT INTO issue_book(receiver_name,book_name,book_taken_date,book_receive_date) VALUES ('"
                        + Receiver_Name + "','"
                        + Book_name + "','"
                        + Date + "','"
                        + date + "')";

                String result = db.Insert(sql);

                if ("success".equals(result)) {

                    out.println("<script>alert('Book Has Been Issued');location='book_issue.jsp';</script>");

                } else {

                    out.println("<script>alert('" + result + "');location='book_issue.jsp';</script>");
                }

            } catch (Exception e) {

                out.println("<script>alert('" + e.getMessage() + "');location='book_issue.jsp';</script>");
            }
        }
    }
}
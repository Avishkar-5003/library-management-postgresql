import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Payment_page")
public class Payement_page extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        Database db = new Database();
        db.Connectdb();

        String Cardholde_name = req.getParameter("Cardholde_name");
        String Card_number = req.getParameter("Card_number");
        String Expiry_date = req.getParameter("Expiry_date");
        String Cvv = req.getParameter("Cvv");
        String event = req.getParameter("Submit");

        if (event != null && event.equals("Add card")) {

            if (Cardholde_name == null || Cardholde_name.trim().isEmpty()
                    || Card_number == null || Card_number.trim().isEmpty()
                    || Expiry_date == null || Expiry_date.trim().isEmpty()
                    || Cvv == null || Cvv.trim().isEmpty()) {

                out.println("<script>alert('Some Value is Empty');location='Payment_Page.jsp';</script>");
                return;
            }

            try {

                String sql =
                        "INSERT INTO payment_page(cardholder_name,card_number,expiry_date,cvv) VALUES('"
                        + Cardholde_name + "','"
                        + Card_number + "','"
                        + Expiry_date + "','"
                        + Cvv + "')";

                String result = db.Insert(sql);

                if ("success".equals(result)) {

                    out.println("<script>alert('Payment Successful');location='book_issue.jsp';</script>");

                } else {

                    out.println("<script>alert('" + result + "');location='Payment_Page.jsp';</script>");
                }

            } catch (Exception e) {

                out.println("<script>alert('" + e.getMessage() + "');location='Payment_Page.jsp';</script>");
            }
        }
    }
}
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/User_signup")
public class User_signup extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        Database db = new Database();
        db.Connectdb();

        String First_name = req.getParameter("First_name");
        String Last_name = req.getParameter("Last_name");
        String Email = req.getParameter("Email");
        String Create_Password = req.getParameter("Create_Password");
        String Confirm_Password = req.getParameter("Confirm_Password");
        String event = req.getParameter("submit");

        if (event != null && event.equals("Signup")) {

            if (First_name == null || First_name.trim().isEmpty()
                    || Last_name == null || Last_name.trim().isEmpty()
                    || Email == null || Email.trim().isEmpty()
                    || Create_Password == null || Create_Password.trim().isEmpty()
                    || Confirm_Password == null || Confirm_Password.trim().isEmpty()) {

                out.println("<script>alert('Some Value is Empty');location='User_signup.jsp';</script>");
                return;
            }

            if (!Create_Password.equals(Confirm_Password)) {

                out.println("<script>alert('Password and Confirm Password do not match');location='User_signup.jsp';</script>");
                return;
            }

            try {

                String sql = "INSERT INTO user_signup(first_name,last_name,email,create_pass,confirm_pass) VALUES ('"
                        + First_name + "','"
                        + Last_name + "','"
                        + Email + "','"
                        + Create_Password + "','"
                        + Confirm_Password + "')";

                String result = db.Insert(sql);

                if ("success".equals(result)) {

                    out.println("<script>alert('Signup Successful');location='User_login.jsp';</script>");

                } else {

                    out.println("<script>alert('" + result + "');location='User_signup.jsp';</script>");
                }

            } catch (Exception e) {

                out.println("<script>alert('" + e.getMessage() + "');location='User_signup.jsp';</script>");
            }
        }
    }
}
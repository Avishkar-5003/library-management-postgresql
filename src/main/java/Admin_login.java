import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Admin_login")
public class Admin_login extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String event = req.getParameter("submit");

        if (event != null && event.equals("submit")) {

            if (username == null || username.trim().isEmpty()
                    || password == null || password.trim().isEmpty()) {

                out.println("<script>alert('Please enter username and password');location='Admin_login.jsp';</script>");
                return;
            }

            if (username.equals("tambeavishkar1@gmail.com")
                    && password.equals("1234")) {

                out.println("<script>alert('Login Successful');location='Admin_Dashboard.jsp';</script>");

            } else {

                out.println("<script>alert('Invalid Username or Password');location='Admin_login.jsp';</script>");
            }
        }
    }
}
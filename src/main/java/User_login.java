import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

@WebServlet("/User_login")
public class User_login extends HttpServlet {

    private static final long serialVersionUID = 1L;

    Connection cn = null;
    Statement st = null;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String User_name = req.getParameter("User_name");
        String Password = req.getParameter("Password");
        String event = req.getParameter("Submit");

        if (event != null && event.equals("Submit")) {

            if (User_name == null || User_name.trim().isEmpty()
                    || Password == null || Password.trim().isEmpty()) {

                out.println("<script>alert('Some Value is Empty');location='User_login.jsp';</script>");
                return;
            }

            try {

                Database db = new Database();
                db.Connectdb();

                cn = db.getConnection();

                if (cn == null) {
                    out.println("<script>alert('Database Connection Failed');location='User_login.jsp';</script>");
                    return;
                }

                st = cn.createStatement();

                String sql = "SELECT * FROM user_signup WHERE email='"
                        + User_name + "' AND create_pass='" + Password + "'";

                ResultSet rs = st.executeQuery(sql);

                if (rs.next()) {

                    out.println("<script>alert('Login Successful');location='Home_Page.jsp';</script>");

                } else {

                    out.println("<script>alert('Invalid Email or Password');location='User_login.jsp';</script>");
                }

                rs.close();
                st.close();
                cn.close();

            } catch (Exception ex) {

                ex.printStackTrace();
                out.println("<script>alert('" + ex.getMessage() + "');location='User_login.jsp';</script>");
            }
        }
    }
}
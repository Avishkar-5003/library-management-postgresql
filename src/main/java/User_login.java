import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
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

        String User_name = req.getParameter("User_name");
        String Password = req.getParameter("Password");
        String event = req.getParameter("Submit");

        if (event != null && event.equals("Submit")) {

            // Validate Input
            if (User_name == null || User_name.trim().isEmpty()
                    || Password == null || Password.trim().isEmpty()) {

                resp.sendRedirect("User_login.jsp");
                return;
            }

            try {

                Database db = new Database();
                db.Connectdb();

                cn = db.getConnection();

                if (cn == null) {

                    resp.sendRedirect("User_login.jsp");
                    return;
                }

                st = cn.createStatement();

                String sql = "SELECT * FROM user_signup WHERE email='"
                        + User_name + "' AND create_pass='" + Password + "'";

                ResultSet rs = st.executeQuery(sql);

                boolean loginSuccess = rs.next();

                rs.close();
                st.close();
                cn.close();

                if (loginSuccess) {

                    resp.sendRedirect("User_dashboards.jsp");

                } else {

                    resp.sendRedirect("User_login.jsp");

                }

            } catch (Exception ex) {

                ex.printStackTrace();
                resp.sendRedirect("User_login.jsp");
            }
        }
    }
}
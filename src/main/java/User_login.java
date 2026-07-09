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

    Connection cn = null;
    Statement st = null;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        PrintWriter out = resp.getWriter();

        String User_name = req.getParameter("User_name");
        String Password = req.getParameter("Password");
        String event = req.getParameter("Submit");

        if (event != null && event.equals("Submit")) {

            if (User_name.equals("") || Password.equals("")) {

                out.println("<script>alert('Some Value is Empty');location='User_login.jsp';</script>");

            } else {

                try {

                    Database db = new Database();
                    db.Connectdb();

                    cn = db.getConnection();

                    st = cn.createStatement();

                    String sql = "SELECT * FROM User_signup WHERE email='" + User_name
                            + "' AND create_pass='" + Password + "'";

                    ResultSet rs = st.executeQuery(sql);

                    if (rs.next()) {

                        out.println("<script>alert('Login Success');location='Home_Page.jsp';</script>");

                    } else {

                        out.println("<script>alert('Invalid Email or Password');location='User_login.jsp';</script>");
                    }

                } catch (Exception ex) {

                    out.println(ex.toString());
                }
            }
        }
    }
}
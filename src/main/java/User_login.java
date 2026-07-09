import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@WebServlet("/User_login")   // <-- Add this line
public class User_login extends HttpServlet {

    private static final long serialVersionUID = 1L;

    Connection cn = null;
    Statement st = null;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        PrintWriter out = resp.getWriter();

        Database db = new Database();
        String result = db.Connectdb();
        out.println(result);

        String User_name = req.getParameter("User_name");
        String Password = req.getParameter("Password");
        String event = req.getParameter("Submit");

        out.println(User_name);
        out.println(Password);
        out.println(event);

        if (event != null && event.equals("Submit")) {

            if (User_name.equals("") || Password.equals("")) {

                resp.setContentType("text/html");
                out.println("<script>alert('Some value is empty');location='User_login.jsp';</script>");

            } else {

                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");

                    cn = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/library_management_system",
                            "root",
                            "root");

                    String sql = "SELECT * FROM User_signup WHERE email='" + User_name
                            + "' AND create_pass='" + Password + "'";

                    st = cn.createStatement();
                    ResultSet rs = st.executeQuery(sql);

                    if (rs.next()) {

                        out.println("<script>alert('Login Success');location='Home_Page.jsp';</script>");

                    } else {

                        out.println("<script>alert('Login Failed');location='User_login.jsp';</script>");
                    }

                } catch (Exception ex) {
                    out.println(ex.toString());
                }
            }
        }
    }
}
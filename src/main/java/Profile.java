import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Profile")
public class Profile extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        Database db = new Database();
        db.Connectdb();

        String full_Name = req.getParameter("full_Name");
        String email = req.getParameter("email");
        String mobile = req.getParameter("mobile");
        String photo = req.getParameter("photo");
        String event = req.getParameter("submit");

        if (event != null && event.equals("Submit")) {

            if (full_Name == null || full_Name.trim().isEmpty()
                    || email == null || email.trim().isEmpty()
                    || mobile == null || mobile.trim().isEmpty()
                    || photo == null || photo.trim().isEmpty()) {

                out.println("<script>alert('Some value is empty');location='Profile_page.jsp';</script>");
                return;
            }

            try {

                String sql =
                        "INSERT INTO profile(full_name,email,mob_no,photo) VALUES('"
                        + full_Name + "','"
                        + email + "','"
                        + mobile + "','"
                        + photo + "')";

                String result = db.Insert(sql);

                if(result.equals("success")){

                    out.println("<script>alert('Profile Saved Successfully');location='Profile_page.jsp';</script>");

                }else{

                    out.println("<script>alert('" + result + "');location='Profile_page.jsp';</script>");
                }

            } catch (Exception e) {

                out.println("<script>alert('" + e.getMessage() + "');location='Profile_page.jsp';</script>");
            }
        }
    }
}
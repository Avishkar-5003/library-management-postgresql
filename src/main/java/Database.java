import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {

    Connection cn = null;
    Statement st = null;

    public String Connectdb() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            cn = DriverManager.getConnection(
                "jdbc:mysql://gateway01.ap-southeast-1.prod.aws.tidbcloud.com:4000/sys?sslMode=VERIFY_IDENTITY&enabledTLSProtocols=TLSv1.2",
                "3tSenSzHvyYCXUR.root",
                "dfWNT0AIkM4M12pD"
            );

            return "Database Connected";

        } catch (Exception ex) {
            return ex.toString();
        }
    }

    public Connection getConnection() {
        return cn;
    }

    public String Insert(String sql) {

        try {

            if (cn == null)
                Connectdb();

            st = cn.createStatement();
            st.executeUpdate(sql);

            return "success";

        } catch (Exception ex) {
            return ex.toString();
        }
    }

    public String update(String sql) {

        try {

            if (cn == null)
                Connectdb();

            st = cn.createStatement();
            st.executeUpdate(sql);

            return "success";

        } catch (Exception ex) {
            return ex.toString();
        }
    }

    public String delete(String sql) {

        try {

            if (cn == null)
                Connectdb();

            st = cn.createStatement();
            st.executeUpdate(sql);

            return "success";

        } catch (Exception ex) {
            return ex.toString();
        }
    }

    public String search(String sql, String column) {

        int id = 1;

        try {

            if (cn == null)
                Connectdb();

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                id = Integer.parseInt(rs.getString(column)) + 1;
            }

            return String.valueOf(id);

        } catch (Exception ex) {
            return ex.toString();
        }
    }
}
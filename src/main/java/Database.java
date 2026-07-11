import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {

    Connection cn = null;
    Statement st = null;

    public String Connectdb() {

        try {

            Class.forName("org.postgresql.Driver");

            String url = System.getenv("DB_URL");
            String user = System.getenv("DB_USER");
            String password = System.getenv("DB_PASSWORD");

            cn = DriverManager.getConnection(url, user, password);

            return "Database Connected";

        } catch (Exception ex) {
            ex.printStackTrace();
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
            ex.printStackTrace();
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
            ex.printStackTrace();
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
            ex.printStackTrace();
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
                id = rs.getInt(column) + 1;
            }

            rs.close();
            st.close();

            return String.valueOf(id);

        } catch (Exception ex) {
            ex.printStackTrace();
            return ex.toString();
        }
    }
}
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Library Books</title>

<link rel="stylesheet" type="text/css" href="css/Books.css">
<style type="text/css">
<%@include file="css/Books.css"%>
</style>

</head>

<body>

<form name="Books" action="Books" method="post">

<header>
    <h1>Library Book</h1>
</header>

<div class="container">
    <div class="book-grid">

<%
Connection cn = null;
Statement st = null;
ResultSet rs = null;

try {

    Class.forName("org.postgresql.Driver");

    String url = System.getenv("DB_URL");
    String dbUser = System.getenv("DB_USER");
    String dbPassword = System.getenv("DB_PASSWORD");

    cn = DriverManager.getConnection(url, dbUser, dbPassword);

    st = cn.createStatement();

    String sql = "SELECT * FROM admin_add_book";

    rs = st.executeQuery(sql);

    while(rs.next()) {
%>

        <div class="book-item">

            <img src="images/<%= rs.getString("add_book") %>"
                 alt="Book Image"
                 style="height:200px;">

            <h3><%= rs.getString("book_name") %></h3>

            <p>
                Author :
                <%= rs.getString("author_name") %>
            </p>

            <p>
                Price :
                <%= rs.getString("book_price") %>
            </p>

        </div>

<%
    }

} catch(Exception e) {

    out.println("<h3>" + e.getMessage() + "</h3>");

} finally {

    try {
        if(rs != null)
            rs.close();
    } catch(Exception e) {}

    try {
        if(st != null)
            st.close();
    } catch(Exception e) {}

    try {
        if(cn != null)
            cn.close();
    } catch(Exception e) {}
}
%>

    </div>
</div>

<footer>
    <p>&copy; 2025 Library Book Store. All rights reserved.</p>
</footer>

</form>

</body>
</html>
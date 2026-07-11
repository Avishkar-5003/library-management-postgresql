<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Total User</title>

<link rel="stylesheet" type="text/css" href="css/Total_user.css">
<style type="text/css">
<%@include file="css/Total_user.css"%>
</style>

</head>

<body>

<form name="Total_user" action="Total_user" method="post">

<header>
    <h1>Library Management System</h1>
</header>

<div class="container">

<h2>Total User List</h2>

<table>

<thead>
<tr>
    <th>User ID</th>
    <th>First Name</th>
    <th>Last Name</th>
    <th>Email</th>
    <th>Membership Status</th>
</tr>
</thead>

<tbody>

<%

Connection cn = null;
Statement st = null;
ResultSet rs = null;

try{

    Class.forName("org.postgresql.Driver");

    String url = System.getenv("DB_URL");
    String user = System.getenv("DB_USER");
    String password = System.getenv("DB_PASSWORD");

    cn = DriverManager.getConnection(url,user,password);

    st = cn.createStatement();

    String sql = "SELECT * FROM user_signup";

    rs = st.executeQuery(sql);

    while(rs.next())
    {

%>

<tr>

<td><%= rs.getInt("user_id") %></td>

<td><%= rs.getString("first_name") %></td>

<td><%= rs.getString("last_name") %></td>

<td><%= rs.getString("email") %></td>

<td><span class="status active">Active</span></td>

</tr>

<%

    }

}catch(Exception e){

    out.println("<tr><td colspan='5'>" + e.getMessage() + "</td></tr>");

}finally{

    try{
        if(rs!=null) rs.close();
    }catch(Exception e){}

    try{
        if(st!=null) st.close();
    }catch(Exception e){}

    try{
        if(cn!=null) cn.close();
    }catch(Exception e){}
}

%>

</tbody>

</table>

</div>

<footer class="footer">
<p>&copy; 2025 Library Management System. All rights reserved.</p>
</footer>

</form>

</body>
</html>
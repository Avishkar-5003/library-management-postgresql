<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile Page</title>

<link rel="stylesheet" type="text/css" href="css/Profile_page.css">
<style type="text/css">
<%@include file="css/Profile_page.css"%>
</style>

</head>
<body>

<form name="Profile_page" action="Profile_page" method="post">

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

    String sql = "SELECT * FROM profile";

    rs = st.executeQuery(sql);

    while(rs.next())
    {

%>

<div class="profile-card">

    <img src="images/<%= rs.getString("photo") %>" alt="User Avatar">

    <h2><%= rs.getString("full_name") %></h2>

    <p><%= rs.getString("email") %></p>

    <p><%= rs.getString("mob_no") %></p>

</div>

<%

    }

}catch(Exception e){

    out.println("<h3>"+e.getMessage()+"</h3>");

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

</form>

</body>
</html>
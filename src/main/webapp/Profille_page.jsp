<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile Page</title>
<link type="text/css" rel="stylesheet" href="css/Profile_page.css" >
<link rel="stylesheet" type="text/css" href="css/Profile_page.css">
<style type="text/css"> <%@include file="css/Profile_page.css"%> </style>
</head>
<body>
       <form name="Profile_page" action="Profile_page" method="post">
       
        <% 
      
      	Connection cn = null;
        Statement st = null;
        
        Class.forName("com.mysql.jdbc.Driver");
        cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management_system","root","root");
        st=cn.createStatement();
        String sql ="select  * from Profile ";
        ResultSet rs=st.executeQuery(sql);
        
        while(rs.next())
        {
      %>
       <div class="profile-card">
        <img src="images/<%=rs.getString("photo") %>" alt="User Avatar">
        <h2><%= rs.getString("full_name") %></h2>
        <p><%= rs.getString("email") %></p>
        <p><%= rs.getString("mob_no") %></p>
        
        <%
        }
        %>
   </form>
</body>
</html>
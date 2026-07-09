<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@page import="java.sql.*" %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Total user</title>
<link type="text/css" rel="stylesheet" href="css/Total_user.css" >
<link rel="stylesheet" type="text/css" href="css/Total_user.css"">
<style type="text/css"> <%@include file="css/Total_user.css"%> </style>
</head>
<body>
    
</body>
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
        
        Class.forName("com.mysql.jdbc.Driver");
        cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management_system","root","root");
        st=cn.createStatement();
        String sql ="select  * from user_signup ";
        ResultSet rs=st.executeQuery(sql);
        
        while(rs.next())
        {
      %>
      
        <tr>
          <td> <%= rs.getString("user_id") %> </td>
          <td> <%= rs.getString("first_name") %></td>
          <td> <%= rs.getString("last_name") %>	</td>
          <td> <%= rs.getString("email") %></td>
          <td><span class="status active">Active</span></td>
        </tr>
        
        <%
        
        }
        
        %>
         
      </tbody>
      
    </table>
    
  </div>
  <footer class="footer">
    <p>&copy; 2025 Library Management System. All rights reserved.</p>
  </footer>
  <form/>
</html>
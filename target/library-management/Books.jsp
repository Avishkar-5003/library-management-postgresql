<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@page import="java.sql.*" %>   
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/Books.css">
<link rel="stylesheet" type="text/css" href="css/Books.css">
<style type="text/css"> <%@include file="css/Books.css"%> </style>
</head>
</head>


<body>
      <form name="Books" action="Books" method="post">

       <header>
        <h1>Library Book </h1>
    </header>
    <div class="container">
        <div class="book-grid"> 
        
        	 <% 
      
		      	Connection cn = null;
		        Statement st = null;
		        
		        Class.forName("com.mysql.jdbc.Driver");
		        cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management_system","root","root");
		        st=cn.createStatement();
		        String sql ="select  * from admin_add_book ";
		        ResultSet rs=st.executeQuery(sql);
		        
		        while(rs.next())
		        {
		      %>
        
        
            <div class="book-item">
                <img src="images/<%= rs.getString("add_book") %>" alt="Book 1" style="height: 200px;">
                <h3> <%= rs.getString("book_name") %> </h3>
                <p>Author: <%= rs.getString("author_name") %></p>
                <p>Price: <%= rs.getString("book_price") %></p>
            </div>
            
            <%
        
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
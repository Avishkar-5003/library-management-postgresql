<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link type="text/css" rel="stylesheet" href="css/Home_page.css" >
<link rel="stylesheet" type="text/css" href="css/Home_page.css">
<style type="text/css"> <%@include file="css/Home_page.css"%> </style>
</head>
<body>
     
    <form name="Home_page" action="Home_page" method="post">
      
    <header>
        <h1>Library Management System</h1>
    </header>
    <nav>
        <a href="User_dashboards.jsp">User dashboard</a>
        <a href="Books.jsp">Books</a>
        <a href="Return_Book.jsp">Return Book</a>
        <a href="book_issue.jsp">Book issue</a>
    </nav>
    <div class="hero">
        <h1>Welcome to Our Library</h1>
        <p>Discover, borrow, and manage your favorite books with ease and style.</p>
        <a href="#books" class="button">Explore Now</a>
    </div>
    <div class="features">
        <div class="feature">
            <h3>Extensive Collection</h3>
            <p>Dive into a vast array of books from different genres and authors worldwide.</p>
        </div>
        <div class="feature">
            <h3>User-Friendly Interface</h3>
            <p>Easily search, borrow, and track your books with an intuitive dashboard.</p>
        </div>
        <div class="feature">
            <h3>Exclusive Perks</h3>
            <p>Get recommendations, discounts, and access to members-only events.</p>
        </div>
    </div>
    <footer>
        <p>&copy; 2025 Library Management System. All rights reserved. Designed with care.</p>
    </footer>
    </form>
</body>
</html>
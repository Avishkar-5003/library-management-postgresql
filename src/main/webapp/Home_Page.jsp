<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>

<link rel="stylesheet" type="text/css" href="css/Home_page.css">
<style type="text/css">
<%@ include file="css/Home_page.css"%>
</style>

</head>

<body>

<form name="Home_page" action="Home_page" method="post">

<header>
    <h1>Library Management System</h1>
</header>

<nav>
    <a href="Home_Page.jsp">Home</a>
    <a href="Books.jsp">Books</a>
    <a href="User_login.jsp">Login</a>
    <a href="User_signup.jsp">Sign Up</a>
</nav>

<div class="hero">

    <h1>Welcome to Our Library</h1>

    <p>
        Discover, borrow, and manage your favorite books with ease and style.
    </p>

    <br><br>

    <a href="User_login.jsp" class="button">Login</a>

    &nbsp;&nbsp;&nbsp;

    <a href="User_signup.jsp" class="button">Sign Up</a>

    <br><br>

    <a href="Books.jsp" class="button">Browse Books</a>

</div>

<div class="features">

    <div class="feature">
        <h3>Extensive Collection</h3>
        <p>
            Dive into thousands of books from different genres and authors.
        </p>
    </div>

    <div class="feature">
        <h3>Easy Book Management</h3>
        <p>
            Issue books, return books and manage your library account easily.
        </p>
    </div>

    <div class="feature">
        <h3>Secure User Account</h3>
        <p>
            Register, login and access your personal dashboard securely.
        </p>
    </div>

</div>

<footer>
    <p>&copy; 2025 Library Management System. All Rights Reserved.</p>
</footer>

</form>

</body>
</html>
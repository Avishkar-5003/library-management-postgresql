<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="ISO-8859-1">

<title>User Dashboard</title>

<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/User_Dashboard.css">

</head>

<body>

<div class="dashboard-container">

    <aside class="sidebar">

        <h2>Library</h2>

        <nav>

            <ul>

                <li><a href="User_dashboard.jsp">Dashboard</a></li>

                <li><a href="Profile_page.jsp">Profile</a></li>

                <li><a href="Books.jsp">Books</a></li>

                <li><a href="book_issue.jsp">Issue Book</a></li>

                <li><a href="Return_Book.jsp">Return Book</a></li>

                <li><a href="User_login.jsp">Logout</a></li>

            </ul>

        </nav>

    </aside>

    <main class="main-content">

        <header>

            <h1>Welcome to Library Management System</h1>

        </header>

        <section class="content">

            <div class="card">
                <h3>Total Books</h3>
                <p>15</p>
            </div>

            <div class="card">
                <h3>Issued Books</h3>
                <p>2</p>
            </div>

            <div class="card">
                <h3>Returned Books</h3>
                <p>5</p>
            </div>

        </section>

    </main>

</div>

</body>

</html>
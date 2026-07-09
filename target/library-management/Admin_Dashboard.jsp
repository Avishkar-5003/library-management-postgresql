<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Dashboard</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="css/Admin_Dashboard.css">
</head>
<body>
 
    <form name="Admin_Dashboard" action="Admin_Dashboard" method="post">

<div class="dashboard-container">
    <!-- Sidebar -->
    <aside class="sidebar">
        <h2>Admin Panel</h2>
        <nav>
            <ul>
                <li><a href="User_Dashboards.jsp"> User Dashboard</a></li>
                <li><a href="Total_user.jsp">Total Users</a></li>
                <li><a href="Admin_total_book.jsp">Total Books</a></li>
                <li><a href="#">Issue/Return Logs</a></li>
                
                <li><a href="#">Logout</a></li>
            </ul>
        </nav>
    </aside>

    <!-- Main Content -->
    <main class="main-content">
        <header>
            <h1>Welcome, Admin</h1>
        </header>
        <section class="dashboard-stats">
            <div class="stat-card">
                <h3>Total Users</h3>
                <p>245</p>
            </div>
            <div class="stat-card">
                <h3>Total Books</h3>
                <p>1,023</p>
            </div>
            <div class="stat-card">
                <h3>Books Issued Today</h3>
                <p>35</p>
            </div>
            <div class="stat-card">
                <h3>Overdue Books</h3>
                <p>12</p>
            </div>
        </section>
        <section class="recent-activity">
            <h2>Recent Activity</h2>
            <table>
                <thead>
                    <tr>
                        <th>User</th>
                        <th>Action</th>
                        <th>Book</th>
                        <th>Date</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>John Doe</td>
                        <td>Issued</td>
                        <td>1984</td>
                        <td>2024-12-30</td>
                    </tr>
                    <!-- Add more rows as needed -->
                </tbody>
            </table>
        </section>
    </main>
</div>
</form>

</body>
</html>

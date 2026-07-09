<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> User Dashboard</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="css/User_Dashboard.css">
</head>
<body>
          <form name="User_dashboard"  action="User_dashboard_" method="post">
    <div class="dashboard-container">
        <!-- Sidebar -->
        <aside class="sidebar">
            <h2>Library</h2>
            <nav>
                <ul>
                    <li><a href="User_dashboards.jsp">Dashboard</a></li>
                    <li><a href="book_issue.jsp">book_issue</a></li>
                    <li><a href="Profile">Profile</a></li>
                    <li><a href="User_login.jsp">Logout</a></li>
                </ul>
            </nav>
        </aside>

        <!-- Main Content -->
        <main class="main-content">
            <header>
                <h1>Welcome, User Dashboard</h1>
            </header>
            <section class="content">
                <div class="card">
                    <h3>Total Books</h3>
                    <p>15</p>
                </div>
                <div class="card">
                    <h3>Books Not Return</h3>
                    <p>2</p>
                </div>
                <div class="card">
                    <h3>Book Issue</h3>
                    <p>2</p>
                </div>
            </section>
        </main>
    </div>
    </form>
</body>

</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>

<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="css/user_login.css">

<style type="text/css">
<%@ include file="css/user_login.css"%>
</style>

</head>

<body>

<form name="User_login" action="User_login" method="post">

<center>

<div class="main">

<h2>User Login</h2>

<div class="border">
<img class="avatar" src="images/R.png" alt="Google Logo">
&nbsp;
<label class="signintitle">Library Management System</label>
</div>

<br>

<input type="text"
       name="User_name"
       class="textbox"
       placeholder="Enter Email">

<br><br>

<input type="password"
       name="Password"
       class="textbox"
       placeholder="Enter Password">

<br><br>

<input type="submit"
       name="Submit"
       class="button"
       value="Login">

<br><br>

<a href="Forget_password.jsp">Forgot Password?</a>

<br><br>

<label>Don't have an account?</label>

<a href="User_signup.jsp">Sign Up</a>

<br><br>

<a href="Home_Page.jsp" class="btn btn-secondary">
    Back to Home
</a>

</div>

</center>

</form>

</body>
</html>
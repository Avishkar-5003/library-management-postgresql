<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forget Password</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<link rel="stylesheet"  type="text/css" href="css/Forget_password.css">
<style type=text/css> <%@include file="css/Forget_password.css"%> </style>
</head>
<body>
<div class="book-container">
        <div class="book-content">
            <h2>Forgot Password?</h2>
            <form name="Forget_Password" action="Forget_Password" method="post">
                <input type="email" name="Mail" class="form-control" placeholder="Enter your email" required>
                <input type="password" name="Set_password" class="form-control" placeholder="New password" minlength="6" required>
                <input type="password" name="Confirm_password" class="form-control" placeholder="Confirm password" minlength="6" required>
                
                <button type="submit" class="btn btn-submit">Reset Password</button>
            </form>
        </div>
    </div>
</body>

</html>
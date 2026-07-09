<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="css/user_login.css">
<style type="text/css"> <%@include file="css/user_login.css"%> </style>
</head>
<body>
          
          
 <form name="User_login" action="User_login" method="post">

  	<center>
		<div class="main">
			<h2> Login Here</h2>
        	
        	<div class="border"> 
     			<img class="avatar" src="images/R.png" alt="Google Logo"> &nbsp; <label class="signintitle">Sign in with Google </label> 
         	</div> 	
         	<br>
   
   
   			<input type="text" name="User_name" class="textbox" placeholder="Enter your email"> <br> <br> 
   			<input type="text"  name="Password" class="textbox" placeholder="Enter your password"> <br> <br> 
   			<input type="submit" name="Submit" class="button" value="Submit"> <br> <br>
   
   			<a href="Forget_password.jsp">Forgot Password..</a> <br> <br>
     		<label> Don't have an account? </label>
     		<a href="User_signup.jsp">Signup now</a>
		</div>
	</center>
 </form>
</body>
</html>
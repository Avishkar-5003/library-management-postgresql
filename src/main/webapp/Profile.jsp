<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="css/Profile.css">
	<style type=text/css> <%@include file="css/Profile.css"%> </style>

</head>
<body>
          <form name="Profile" action="Profile" method="post">
   <div class="main">
   
      <img src="your-image-url.jpg" alt="image" class="image">
      <h2>Profile</h2>
      
      <br> 
      <input 
         type="text" class="textbox" name="full_Name" placeholder="Enter your full name" > 
      <br> <br>
      
      <input type="email" class="textbox" name="email" placeholder="Email" >
         
      <br> <br>
      
      <input type="textbox" class="textbox"  name="mobile"  placeholder="Enter mobile no"  pattern="[0-9]{10}"  title="Enter a valid 10-digit mobile number"> 
          
      <br> <br>
      
      <label for="photo" class="textbox">Add photo:</label>
      <input type="file"  class="textbox"  name="photo"   id="photo"  accept="image/*" required> 
      <br> <br>
      
      <input type="submit" name="submit" class="submit"  value="Submit">
   </div>
</form>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>User_Signup</title>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="css/User_signup.css">
	<style type=text/css> <%@include file="css/User_signup.css"%> </style>
</head>      
<body>
      
      <form name="User_signup" action="User_signup" method="post">

 <center>
 
 <div class="main">
 	<div class="col-sm-6">
 		<div class="left_div"></div>
 	  </div>
 	
 	    <div class="col-sm-6">
 	 
         	 
 		<div class="right_div">
 		
 		     <label class="label_signup">SIgnup</label> <br> <br>
 		     
 		 	 <input type="text" name="First_name" class="textbox1" placeholder="First name">
	     	 <input type="text" name="Last_name" class="textbox1"  placeholder="Last name"> <br> <br>
	     	 
	     	 <input type="text" name="Email" class="textbox" placeholder="Email">   <br> <br> 
	     	 
	     	 <input type="password" name="Create_Password" class="textbox" placeholder="Create Password">  <br> <br>
	     	 
	     	 <input type="password" name="Confirm_Password" class="textbox" placeholder="Confirm Password">  <br> <br>
	     	 
	     	 <input type="submit" name="submit" class="button" value="Signup">  <br> <br>
	     	 
	     	 <label>Already have an Account?</label>
	     	
	     	  
	     	 <label class="label_login"> <a href="User_login.jsp" >Login Now</a></label>
 		 </div>
 	 </div>
 	
 </div>
 

  </center>
  </form>

</body>
</html>
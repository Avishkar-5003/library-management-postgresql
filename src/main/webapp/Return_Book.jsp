<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Return Book</title>
<link  rel="stylesheet"  type="text/css" href="css/Return_Book.css">
<style type="text/css"> <%@include file="css/Return_Book.css"%> </style> 
</head>
<body>
      <form name="Return_Book" action="Return_Book" method="post">
      
 	<div class="main"> 
 	<h2 class="heading">Issue Book</h2> <br> 
     	
 	<input  type="text" name="Receiver_name" class="textbox" placeholder="Receiver Name"> <br> <br>
 	
 	<input type="text" name="Book_name" class="textbox" placeholder="Book Name"> <br> <br>
 	
 	<label>Book taken date</label> <br>
 	<input type="date"  name="Date" class="datebox"> <br> <br>
 	
 	<label>Book receive date</label> <br>
   <input type="date" name="date" class="datebox" > <br> <br>
   
   <input type="text" name="fine"  class="finebox" placeholder="Fine">
   
   <input type="submit" name="Submit" class="paybox" value="Pay" > <br> <br>
   
   
   <input type="submit" name="Submit" class="button" value="Submit"> <br> <br>
       	
  	
 	
 	
 	</div>
       </form>
</body>
</html>
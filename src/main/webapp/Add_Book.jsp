<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add_Book</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="css/Add_Book.css">
	<style type=text/css> <%@include file="css/Add_Book.css"%> </style>
</head>
<body>

       <form name="Add_Book" action="Add_Book" method="post">


<div class="main">
      <label class="heading">Welcome to my library</label> <br> <br>
        
       <label class="heading1">Book Name</label> <br>
       <input type="text" name="Book_Name" class="heading1"> <br> <br>
       
       <label class="heading1">Author Name</label> <br> 
       <input type="text" name="Author_Name" class="heading1" > <br> <br>
       
       <label class="heading1">Book Price</label> <br>
       <input type="text" name="Book_Price" class="heading1"> <br> <br>
       
        <label class="heading1">No of pages</label> <br>
       <input type="text" name="pages" class="heading1"> <br> <br>
       
        <label class="heading1">Book type</label> <br>
       <input type="text" name="Book_type" class="heading1"> <br> <br>
       
       
       <label class="heading1">Add book</label> <br>
       <input type="file" name="Add_book" id="file" class="heading1" placeholder="add book"> <br>
       
       <input type="submit" name="submit" class="heading1"   value="Submit"> 
 </div>
        </form>
 
</body>
</html>
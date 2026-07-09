<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment page</title>
<link rel="stylesheeet" type="text/css" href="css/Payment_page.css">
<link rel="stylesheet"  type="text/css" href="css/bootstrap.css">
<style type="text/css"> <%@include file="css/Payment_page.css"%> </style>

</head>
<body>
    <form name="Payement_page" action="Payement_page" method="post">
      
    
  <center>
<div class="main">
		
		<h2>Credit card</h2> <br> <br>
		
		<input type="text" name="Cardholde_name" class="textbox" placeholder="Cardholder Name" > <br> <br>
		 
		 <input type="number" name="Card_number" class="textbox" placeholder="Card Number"> <br> <br>
		 
		 <input type="month" name="Expiry_date" class="cvvbox" placeholder="Expiry Date">
		 
		 <input type="text" name="Cvv" class="cvvbox" placeholder="CVV"> <br> <br>
		 
		 <input type="Submit" name="Submit" name="Submit" value="Add card">
                 		
     
     
      
</div>

</center>
  </form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
 <meta charset="utf-8">  
  <meta name="viewport" content="width=device-width, initial-scale=1">      
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/>
<p class="text-center"><button class="btn btn-primary">Registration Page</button></p>     
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>  
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>   
<title>Registration Page</title>
</head>
<body> 
    
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>  
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>  
<form action="adddetails" method="POST">
 <div class="form-group">
		      <label for="firstname">FirstName:</label>
		      <input type="text" class="form-control" id="firstname" placeholder="Enter firstname" name="firstname">
		    </div>
		    
<div class="form-group">
		      <label for="lastname">lastname:</label>
		      <input type="text" class="form-control" id="lastname" placeholder="Enter lastname" name="lastname">
		    </div>
		    
<div class="form-group">
		      <label for="address">address:</label>
		      <input type="text" class="form-control" id="address" placeholder="Enter address" name="address">
		    </div>
		    

  <div class="form-group">
		      <label for="age">age:</label>
		      <input type="text" class="form-control" id="age" pattern="[0-9]{2}" placeholder="Enter age btwn 18 and 99" name="age" >
		    </div>

<div class="form-group">
		      <label for="gender">gender:</label>
		      <input type="text" class="form-control" id="gender" placeholder="Enter gender" name="gender">
		    </div>
		    
<button class="btn btn-primary" type="submit">ADD DETAILS</button> 
</form>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>  
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script> 
</body>
</html>
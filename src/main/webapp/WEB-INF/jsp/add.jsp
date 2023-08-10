<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Registration Form</title>
<link rel="stylesheet" href="styles.css">



<style type="text/css">
body {
	font-family: Arial, sans-serif;
	margin: 0;
	padding: 0;
}

.container {
	max-width: 500px;
	margin: 50px auto;
	padding: 20px;
	border: 1px solid #ccc;
	border-radius: 5px;
}

h2 {
	text-align: center;
}

form {
	display: grid;
	grid-gap: 10px;
}

label {
	display: block;
	font-weight: bold;
}

input, select {
	width: 100%;
	padding: 8px;
	border: 1px solid #ccc;
	border-radius: 5px;
}

button {
	width: 100%;
	padding: 10px;
	background-color: #4CAF50;
	color: #fff;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}

button:hover {
	background-color: #45a049;
}
</style>

</head>
<body>
<h2 style="color: green;">${successMsg }</h2>
<h2 style="color: red;">${errMsg}</h2>
	<div class="container">
		<h2>Registration Form</h2>
		<form action= "register" method="post">
			<label for="fristname">First Name:</label> 
			<input type="text" name="fristname" required> 
			
			<label for="lastname">LastName:</label>
			 <input type="text" name="lastname"  >
			 
			  <label for="email">Email:</label> 
			  <input type="email" name="email" >


			<label for="mobile">Mobile No:</label>
			 <input type="text" name="mobile" >
			 
			  <label for="birthdate">Date of Birth:</label> <input
				type="date" name="birthdate" > 
				<label for="gender">Gender:</label>
				
			<select name="gender" >
				<option value="">Select</option>
				<option value="male" name="gender">Male</option>
				<option value="female" name="gender">Female</option>
				<option value="other" name="gender">Other</option>
				
			</select> <label for="country">Country:</label>
			 <input type="text" name="country" > 
			 
			 <label for="password">Password:</label>
			<input type="password" name="password" >



			<button type="submit">Register</button>
		</form>
	</div>
	
</body>
</html>

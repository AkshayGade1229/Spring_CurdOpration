<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Navigation Bar</title>
    <link rel="stylesheet" href="styles.css">
    
    <style type="text/css">
    body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
}

.navbar {
    background-color: #333;
    padding: 10px;
}

.navbar ul {
    list-style: none;
    margin: 0;
    padding: 0;
    display: flex;
    justify-content: space-around;
}

.navbar li {
    padding: 5px;
}

.navbar a {
    text-decoration: none;
    color: #fff;
}

.navbar a:hover {
    color: #ffcc00;
}
    
    
    </style>

</head>
<body>
	<nav class="navbar">
        <ul>
            <li><a href="">Home</a></li>
            <li><a href="registerForm">Add Employee</a></li>
            <li><a href="updateForm">Update Employee</a></li>
            <li><a href="deleteForm">Delete Employee</a></li>
            <li><a href="selectById">Select Employee</a></li>
            <li><a href="selectall">Select All</a></li>
        </ul>
    </nav>
</body>
</html>

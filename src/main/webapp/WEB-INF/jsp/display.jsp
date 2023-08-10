<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Display Data</h1>



<table border="1">
<tr>
<th>Name</th>
<th>LastName</th>
<th>Email Id</th>
<th>Mobile</th>
<th>Dath Of Birth</th>
<th>Gender</th>
<th>Country</th>
<th>Password</th>


</tr>
<tr>
<td>${empData.fristname }</td>
 
<td>
  ${empData.lastname }</td>
<td>
 ${empData.email }</td>
 <td>
 ${empData.mobile }</td> 
 <td>
 ${empData.birthdate }</td>
<td>
 ${empData.gender }</td> 
 <td>
${empData.country }</td>
<td>
${empData.password }</td> 
</tr>
</table>
</body>
</html>
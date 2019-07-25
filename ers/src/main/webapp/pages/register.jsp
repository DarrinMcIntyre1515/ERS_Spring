<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Registration</title>
	<link rel="stylesheet" href="/css/formStyle.css">
</head>
<body>
	<div>
		<form action="/registration" method="post">
			<label for="uname">Username</label>
			<input type="text" id="uname" name="username" placeholder="Username..."> 
			
			<label for="fname">Email</label> 
			<input type="text" id="email" name="email" placeholder="Email...">
			
			<label for="pw">Password</label>
			<input type="password" id="pw" name="password" placeholder="Password...">
			
			<label for="fname">First Name</label>
			<input type="text" id="fname" name="firstname" placeholder="First name...">
			
			<label for="lname">Last Name</label>
			<input type="text" id="lname" name="lastname" placeholder="Last name...">
			
			<label for="rank">Job Title</label>
			<select id="rank" name="rank">
				<option value="0">Employee</option>
				<option value="1">Manager</option>
			</select> <input type="submit" value="Submit">
		</form>
	</div>
</body>
</html>


<script>

</script>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Welcome</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	<link rel="stylesheet" href="/css/style.css">
</head>
<body>
	<div>
		<p class="quote">Quote:</p>
		<p class="username">Welcome </p>
		
		<form action="logout">
			<button>Log Out</button>
		</form>
	</div>
	
	<table>
		<tr>
			<th>Request ID</th>
			<th>Approver</th>
			<th>Approver Note</th>
		</tr>
		<tr>
			<td>715</td>
			<td>Maria Jenkins</td>
			<td>ok</td>
		</tr>
		<tr>
			<td>717</td>
			<td>Charles Smith</td>
			<td>All set!</td>
		</tr>
	</table>

	<script src="/js/home.js"></script>
</body>
</html>
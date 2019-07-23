<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	${SPRING_SECURITY_LAST_EXCEPTION.message}
	<form action="login" method="post">
		<table align="center">
			<tr>
				<td>User:</td>
				<td><input type='text' name='username' value='' /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input name='password' type='password' /></td>
			</tr>
			<tr>
				<td><input name='submit' type='submit' value='Login' /></td>
			</tr>
			<tr></tr>
			<tr>
				<td></td>
				<td><a href="registration">Register</a></td>
			</tr>
		</table>
	</form>
	<table align="center">
		<tr>
			<td style="font-style: italic; color: red;">${message}</td>
		</tr>
	</table>
</body>
</html>


<script type="text/javascript">

</script>
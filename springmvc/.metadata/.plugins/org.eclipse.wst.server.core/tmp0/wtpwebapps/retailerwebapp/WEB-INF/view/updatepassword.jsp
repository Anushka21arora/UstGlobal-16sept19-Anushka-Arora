<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	<a href="./home">Home</a>
	<a href="./logout" style="float: right;">Logout</a>
	<fieldset>
	<legend>Change password</legend>
	<form action="./updatepassword" method="post">
		<table>
			<tr>
				<th>New Password</th>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<th>Confirm Password</th>
				<td><input type="password" name="confirmpassword" /></td>
			</tr>
			<tr>
				<th><input type="submit" value="Update Password" /></th>
				<td><input type="reset" value="Reset" /></td>
			</tr>


		</table>
	</form>
	
	</fieldset>
	
</body>

</body>
</html>
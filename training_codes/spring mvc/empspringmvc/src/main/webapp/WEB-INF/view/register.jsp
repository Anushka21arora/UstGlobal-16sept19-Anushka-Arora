<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>Register</legend>
		<form action="./register" method="post">

			<table>

				<tr>
					<th>Name</th>
					<td><input type="text" name="name" /></td>
				</tr>

				<tr>
					<th>Email</th>
					<td><input type="email" name="email" /></td>
				</tr>

				<tr>
					<th>Password</th>
					<td><input type="password" name="password" /></td>
				</tr>

				<tr>
					<th>Date Of Joining</th>
					<td><input type="date" name="doj" /></td>
				</tr>

				<tr>
					<th>Gender</th>
					<td><select name="gender">
<option>----Select------</option>
							<option value="M">Male</option>
							<option value="F">Female</option>
					</select></td>
				</tr>

				<tr>
					<td><input type="reset" value="Reset" /></td>
					<td><input type="submit" value="Register" /></td>
				</tr>

			</table>

		</form>

	</fieldset>
	<a href ="./login">Login</a>
</body>
</html>
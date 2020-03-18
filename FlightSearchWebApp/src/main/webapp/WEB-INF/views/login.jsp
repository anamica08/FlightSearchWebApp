<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css">
<title>User Login</title>
</head>
<body >
	<div style="color:red" align="center">${message}</div>
	<div class="login" align="center" >
	<h1 style="text-decoration:underline;">Login</h1>
	<br>
	<hr>
	<br><br>
    <form action="login" method="post" >
    <table style=" border:1px solid black">
    <tr style="background-color:grey">
    <td colspan="5" style="margin:20px; padding:30px;"><input type="text" name="username" placeholder="Username" required="required" /></td>
    </tr>
    <tr style="background-color:grey">
    <td colspan="5" style="margin:20px; padding:30px;"><input type="password" name="password" placeholder="Password" required="required" /></td>
    </tr>
    <tr>
    <td colspan="5" style="padding:20px;"><button type="submit" class="btn btn-primary btn-block btn-large" style="font-size:20px; color:black;"><b>Log in</b></button></td>
    </tr>
    </table>        
    </form>
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
<style>
body {
  background-image:url('https://media.istockphoto.com/photos/blue-abstract-background-or-texture-picture-id1138395421?k=6&m=1138395421&s=612x612&w=0&h=bJ1SRWujCgg3QWzkGPgaRiArNYohPl7-Wc4p_Fa_cyA=');
}
h1{
color: white;
align:center;
}
</style>

</head>
<body>
<h1>Invalid login... Try Again or your account is not enable</h1>
<form action="Login" method="post">
 <table width="50%" bgcolor="#92a8d1" align="center">
 
 	<tr>
        <td colspan=5><center><font size=4><h2><b>Login page</b></h2></font></center></td>
        </tr>
 <tr>
	<td><b> Enter username </b>:<input type="text" name="uname"><br> </td>
</tr>
<tr>
<td> <b>Enter password</b>:<input type="password" name="pass"><br> </td>
</tr>
<br>
<tr>
<td>	<input type="submit" value="login"> </td>
</tr>
</table>
</form>
<form action="Register.jsp" method="post">
 <table width="50%" bgcolor="0099CC" align="center">
 	<tr>
	<td> <input type="submit" value="Register"> </td>
	</tr>
</table>
</form>

</body>
</html>
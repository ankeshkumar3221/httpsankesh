<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="request" method="get">
<h1>For which account you want to send cheque book request</h1>
<br>
<input type="radio" id="savings" name="savings" value="savings">
 <label for="savings">Savings</label><br>
 <input type="radio" id="primary" name="savings" value="primary">
 <label for="primary">primary</label><br><br>
Enter Description:<textarea id="w3review" name="ank" rows="4" cols="50"></textarea>

<br>
<input type="submit" value="Request">
</form>
</body>
</html>
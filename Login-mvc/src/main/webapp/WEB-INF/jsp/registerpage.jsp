<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<h3>Please Fill the Registration Details</h3>
<pre>
<form action="/set-user" method="post">
UserName
<input type="text" name="username"><br>
PassWord
<input type="text" name="password1"><br>
Retype Password
<input type="text" name="password2"><br>
Email
<input type="email" name="email"><br>
<input type="submit" value="save" style="background-color: orange;">

</form>
</pre>
</div>
</body>
</html>
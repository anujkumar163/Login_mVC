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
	<h3>Login page</h3>
	<form action="/login" method="post">
	<pre>
	UserName
	<input type="text" name="username">
	PassWord
	<input type="text" name="password"><br>
	<input type="submit" value="Login">  <input type="submit" onclick="goToRegister()" value="Register">
	<br>
	
	</pre>
	</form>
	<br>
	<c:if test="${not empty error}">
	<h3>${error}</h3>
	</c:if>
	<br>
	<c:if test="${not empty sucess }">
	<h3 style="color: blue;">${sucess }</h3>
	</c:if>
	<br>
	<c:if test="${not empty register }">
	<h3 style="color: red;">${register }</h3>
	</c:if>
	<script>
		function goToRegister(){
			alert("going to register");
			window.location.href="/register";	
		}
	</script>
	
</body>
</html>
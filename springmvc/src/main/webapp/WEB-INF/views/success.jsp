<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <h1>welcome ${name }</h1>
<h1>Your Email id is ${email }</h1>
<h1>Your password is ${password} try to secure the password</h1> --%>

<h1>${Header}</h1>
<p>${Desc }</p>
<h1 style="color:green">${msg}</h1>
<hr>
<h1>welcome ${user.userName }</h1>
<h1>Your Email id is ${user.email }</h1>
<h1>Your password is ${user.password} try to secure the password</h1>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" import="java.time.*"%>
<%@ page isELIgnored="false" %>   

<!-- search jstl uri in google -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>this is help url</h1>
<%
/* String name= (String) request.getAttribute("name");
Integer rn= (Integer) request.getAttribute("rollNo");
LocalDateTime time = (LocalDateTime) request.getAttribute("time"); */
%>

<h1>name  is <%-- <%=name %> --%> ${name }</h1>
<h1>Roll Number is <%-- <%=rn %> --%> ${rollNo }</h1>

<h1>Date And Time is <%-- <%=time%> --%> ${time } </h1>
<h1>Date And Time is <%-- <%=time.toString()%> --%></h1>

<hr>
 ${marks }
 

<c:forEach var="item" items="${marks }" >
<%-- <h1>${item }</h1> --%>
<h1><c:out value="${item }"></c:out></h1>
</c:forEach>


</body>
</html>
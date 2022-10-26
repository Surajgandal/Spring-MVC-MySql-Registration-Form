<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <!--  If util package not add then error through "Unchecked cast from Object to 
	 List<String>"-->
	 
 <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h1>This is home page</h1>
<h1>Called by home controller</h1>
<h1>url /home</h1>

<%
String sname = (String)request.getAttribute("cname");
int idn =(Integer)request.getAttribute("id");

List<String> fd = (List<String>)request.getAttribute("f");
%>

<h1>Name is <%=sname %></h1>
<h1>Id is <%=idn %></h1>

<%for (String s : fd) { %>
<h1><%=s %></h1>
<%} %>

</body>

</html>
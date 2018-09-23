<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>hello</title>
</head>
<body>
<% 

	Integer id = (Integer) request.getAttribute("id");
	String name = (String) request.getAttribute("name");
	double salary = (double) request.getAttribute("salary");

	out.print("ID : "+ id);
	out.print("Name : "+ name);
	out.print("Salary : "+ salary);
	
%>
<h1>Welcome To Spring MVC</h1>
<h2>After a long struggle i have made this right.</h2>
<h3>Id : <%=id %></h3>
<h3>Name : <%=name %></h3>
<h3>Salary : <%=salary %></h3>

<h2> JSTL Expression Language</h2>
<h3>Id : ${id}</h3>
<h3>Name : ${name}</h3>
<h3>Salary : ${salary}</h3>
</body>
</html>
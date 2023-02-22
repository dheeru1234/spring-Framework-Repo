<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Name is ${student.name }</h1>
<h1>Student Id is ${student.id }</h1>
<h1>Student DOB is ${student.date }</h1>
<h1>Courses is ${student.courses }</h1>
<h1>Student gender is ${student.gender }</h1>
<h1>Student type is ${student.type }</h1>
<hr>
<h1>Address street is ${student.address.street }</h1>

<h1>Address street is ${student.address.city }</h1>

</body>
</html>
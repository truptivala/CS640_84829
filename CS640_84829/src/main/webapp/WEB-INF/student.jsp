<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Page</title>
</head>
<body>
  <h1>All Students</h1>
  <c:forEach var="s" items="${students}">
    Id: ${s.id} Name: ${s.name}<br/>
  </c:forEach>
  
  <h1>Add New Student</h1>
  <form method="post" action="Student/addStudent">
  Name: <input type="text" name="name"/>
  <button>Add</button>
  </form>
</body>
</html>
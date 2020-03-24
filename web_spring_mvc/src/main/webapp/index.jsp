<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<html>
<body>
<h2>Student Database</h2>
<a href="insert">Insert</a>
<br/>
<a href="update">Update</a>
<br/>
<a href="delete">Delete</a>
<br/>
<a href="getall">GetAll</a>
<br/>
<c:out value="${status}" />
</body>
</html>
Ï
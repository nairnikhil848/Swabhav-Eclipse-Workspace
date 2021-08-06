<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Add Student To List</h1>
	<s:form action="doaddStudent">
		<s:hidden name="id" />
		<s:textfield name="name" label="name" />
		<s:textfield name="rollno" label="rollno" />
		<s:textfield name="cgpa" label="cgpa" />
		<s:textfield name="location" label="Location" />
		<s:submit value="Add Student" label="Add Student" />
	</s:form>

</body>
</html>
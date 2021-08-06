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
<body>

	<h1>Edit Student Details</h1>
	<s:form action="doUpdateStudent">
		<s:hidden name="student.id" />
		<s:textfield name="student.name" label="name" />
		<s:textfield name="student.rollno" label="rollno" />
		<s:textfield name="student.cgpa" label="cgpa" />
		<s:textfield name="student.location" label="location" />
		<s:submit value="Update Student" label="Add Student" />
	</s:form>

</body>
</body>

</html>
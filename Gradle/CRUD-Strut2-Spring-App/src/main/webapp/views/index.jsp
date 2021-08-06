<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table, td, th {
	border: 1px solid black;
}

table {
	border-collapse: collapse;
	width: 60%;
}

th {
	height: 30px;
}

.button-update {
	background-color: #008CBA;
	color: white;
}

.button-delete {
	background-color: red;
	color: white;
}
</style>
</head>
<body>
	<h1>Student's List:</h1>
	<a href="addStudent">
		<button class="button-update">Add Student</button>
	</a>
	<table border="1">
		<tr>
			<th>Name</th>
			<th>RollNo</th>
			<th>CGPA</th>
			<th>Location</th>
		</tr>
		<s:iterator value="studentList">
			<tr>

				<td><s:property value="name" /></td>
				<td><s:property value="rollno" /></td>
				<td><s:property value="cgpa" /></td>
				<td><s:property value="location" /></td>
				<td><a href="updateStudent?&id=<s:property value="id"/>">
						<button class="button-update">Update</button>
				</a> <a type='button'
					onclick="return confirm('Are yousure, you want to delete it?'); "
					href="deleteStudent?id=<s:property value="id"/>">
						<button class="button-delete">Delete</button>
				</a></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>
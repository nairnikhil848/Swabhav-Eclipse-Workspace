<%@ page import="com.techlab.models.Student" import="java.util.*"
	language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Home Page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
	integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
	integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
	crossorigin="anonymous"></script>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light navbar-laravel">
		<div class="container">
			<a class="navbar-brand">Welcome ${uname==null ? 'Guest' : uname}</a>

			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div id="navbarSupportedContent">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a class="btn btn-primary" style="display:${uname == null ? 'block' : 'none'}" href="./login">Login</a></li>
					<li class="nav-item"><a class="btn btn-danger" style="display:${uname == null ? 'none' : 'block'}"  href="./logout">Logout</a></li>
				</ul>

			</div>
		</div>
	</nav>

	<h1 align="center">Student's List</h1>
	<br>
	<div class="container col-12">
		<div class="row">
			<h3 class="col-9">
				Student Count :<%
			List<Student> studentList = (List<Student>) request.getAttribute("studentList");
			out.print(studentList.size());
			%>
			</h3>
			<a type="button" class="btn btn-primary float-right col-2"
				href="./add">Add Student</a><br>
		</div>
	</div>
	<br>
	<table class="table table-bordered table-dark">
		<thead>
			<tr>
				<th scope="col">ID</th>
				<th scope="col">Name</th>
				<th scope="col">RollNo</th>
				<th scope="col">CGPA</th>
				<th scope="col">Location</th>
			</tr>
		</thead>
		<tbody>
			<%
			for (int i = 0; i < studentList.size(); i++) {
				out.print("<tr>" + "<th scope='row'>" + studentList.get(i).getId() + "</th>" + "<td>" + studentList.get(i).getName()
				+ "</td>" + "<td>" + studentList.get(i).getRollno() + "</td>" + "<td>" + studentList.get(i).getCGPA()
				+ "</td>" + "<td>" + studentList.get(i).getLocation() + "</td>"
				+ "<td class='text-center'> <a type='button' class='btn btn-warning' href='./edit?id="
				+ studentList.get(i).getId() + "'>Edit</a><br> </td>"
				+ "<td class='text-center'> <a type='button' class='btn btn-danger' onclick=\"return confirm('Are you sure, you want to delete it?')\" href='./delete?id="
				+ studentList.get(i).getId() + "'>Delete</a><br> </td>" + "</tr>");
			}
			%>
		</tbody>
	</table>



</body>
</html>
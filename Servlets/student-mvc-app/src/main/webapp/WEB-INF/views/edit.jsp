<%@ page import="com.techlab.models.Student" import="java.util.*"
	language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
Student student = (Student) request.getAttribute("student");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
<style>
.required:after {
	content: " *";
	color: red;
}
</style>
</head>
<body>

	<div class="container h-100">
		<div class="row h-100 justify-content-center align-items-center">
			<div class="col-10 col-md-8 col-lg-6">
				<form class="form-horizontal" action="edit" method="POST" novalidate
					onsubmit="return validate()">
					
					<input type="hidden" name="id" value="<%=student.getId() %>" />
					<h1>Student Form</h1>
					<div class="form-group row">
						<label class="control-label col-sm-2">Name:</label> <input
							type="text" class="form-control col-sm-8"
							value="<%=student.getName()%>" id="name" placeholder="name..."
							name="name">
					</div>
					<div class="form-group row">
						<label class="control-label col-sm-2">RollNo:</label> <input
							type="text" class="form-control col-sm-8"
							value="<%=student.getRollno()%>" id="rollno"
							placeholder="Rollno..." name="rollno">
					</div>
					<div class="form-group row">
						<label class="control-label col-sm-2">CGPA:</label> <input
							type="text" class="form-control col-sm-8"
							value="<%=student.getCGPA()%>" id="cgpa" placeholder="CGPA..."
							name="cgpa">
					</div>
					<div class="form-group row">
						<label class="control-label col-sm-2">Location: </label> <input
							type="text" class="form-control col-sm-8"
							value="<%=student.getLocation()%>" id="location"
							placeholder="Location..." name="location">
					</div>
					<button type="submit" class="btn btn-primary btn-customized col-2">Submit</button>
				</form>
			</div>
		</div>
	</div>
	<script></script>
	<script>
		function validate() {

			var name = $("#name").val();
			if (name == "") {
				$("#name").parent().addClass("required");
				console.log("null value");
				return false;
			}
			$("#name").parent().removeClass("required");

			var rollno = $("#rollno").val();
			if (rollno == "" || !$.isNumeric(rollno)) {
				$("#rollno").parent().addClass("required");
				console.log("null value or not a number");
				return false;
			}
			$("#rollno").parent().removeClass("required");

			var cgpa = $("#cgpa").val();
			if (cgpa == "" || !$.isNumeric(cgpa)) {
				$("#cgpa").parent().addClass("required");
				console.log("null value or not a number ");
				return false;
			}
			$("#cgpa").parent().removeClass("required");

			var location = $("#location").val();
			if (location == "") {
				$("#location").parent().addClass("required");
				console.log("null value");
				return false;
			}
			$("#location").parent().removeClass("required");

			return true;
		}
	</script>
</body>
</html>
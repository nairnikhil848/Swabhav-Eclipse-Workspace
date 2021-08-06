<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<style>
.required:after {
	content: " *";
	color: red;
}
</style>
</head>
<body>
	<div class="container-fluid">
		<h2>Sign Up</h2>
		<form action="register" method="POST" onsubmit="return validate()">
			<div class="form-group row">
				<label class="col-sm-2 col-form-label">Name</label>
				<div class="col-sm-5">
					<input type="text" class="form-control" id="name" name="name"
						placeholder="Name">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 col-form-label">Balance</label>
				<div class="col-sm-5">
					<input type="text" class="form-control" id="balance" name="balance"
						placeholder="Balance">
				</div>
			</div>
			<div class="form-group row">
				<label for="inputPassword" class="col-sm-2 col-form-label">Password</label>
				<div class="col-sm-5">
					<input type="password" class="form-control" id="password"
						name="password" placeholder="Password">
				</div>
			</div>
			<div class="form-group row">
				<label for="inputPassword" class="col-sm-2 col-form-label">Password</label>
				<div class="col-sm-5">
					<input type="password" class="form-control" id="confirmpassword"
						name="password" placeholder="Password">
				</div>
			</div>
			<div class="form-group row col">
				<a href="./login">Already have an Account?</a>
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script>
		function validate() {

			var name = $("#name").val();
			if (name == "") {
				$("#name").parent().parent().addClass("required");
				console.log("null value");
				return false;
			}
			$("#name").parent().parent().removeClass("required");

			var balance = $("#balance").val();
			if (balance == "" || !$.isNumeric(balance)) {
				$("#balance").parent().parent().addClass("required");
				console.log("null value or not a number");
				return false;
			}
			$("#balance").parent().parent().removeClass("required");

			var password = $("#password").val();
			if (password == "") {
				$("#password").parent().parent().addClass("required");
				console.log("null value or not a number ");
				return false;
			}
			$("#password").parent().parent().removeClass("required");

			var confirmpassword = $("#confirmpassword").val();
			if (password == "" || password != confirmpassword) {
				$("#confirmpassword").parent().parent().addClass("required");
				return false;
			}
			$("#confirmpassword").parent().parent().removeClass("required");

			return true;
		}
	</script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
		integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
		crossorigin="anonymous"></script>
</body>
</html>
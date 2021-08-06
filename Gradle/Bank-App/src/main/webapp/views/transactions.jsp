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

	<a class="btn btn-primary float-left col-2" href="./home">Home</a>
	<div class="container-fluid">
		<h2>Depost/Withdraw Money</h2>
		<form action="transaction" method="POST" onsubmit="return validate()">
			<div class="form-group row">
				<label class="col-sm-2 col-form-label">Balance</label>
				<div class="col-sm-5">
					<input type="text" class="form-control" id="amount" name="amount"
						placeholder="amount">
				</div>
			</div>
			<div>
				<div class="form-check form-check-inline">
					<input class="form-check-input" type="radio"
						name="type" id="inlineRadio1" value="D" checked>
					<label class="form-check-label" for="inlineRadio1">Deposit</label>
				</div>
				<div class="form-check form-check-inline">
					<input class="form-check-input" type="radio"
						name="type" id="inlineRadio2" value="W">
					<label class="form-check-label" for="inlineRadio2">Withdraw</label>
				</div>
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
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
	<script>
		function validate() {

			$("#amount").parent().parent().removeClass("required");

			var amount = $("#amount").val();
			if (amount == "" || !$.isNumeric(amount)) {
				$("#amount").parent().parent().addClass("required");
				console.log("null value or not a number");
				return false;
			}
			
			return true;
		}
	 </script>


</body>
</html>
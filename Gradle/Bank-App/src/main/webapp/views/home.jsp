<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<div class="card ">
		<div class="card-header">
			<div class="row">
				<p class="col-10">Welcome ${name == null ? 'Guest' : name}</p>
				<a class="btn btn-primary float-right col-2"
					style="display:${name == null ? 'block' : 'none'}" href="./login">Login</a>
				<a class="btn btn-primary float-right col-2"
					style="display:${name == null ? 'none' : 'block'}" href="./logout">Logout</a>
			</div>
		</div>
		<div class="card-body">
			<h1 class="card-text">Your Balance is ${balance}</h1>
			<h5 class="card-title">
				<a href="./passbook" class="btn btn-primary">Passbook</a>
			</h5>
			<h5 class="card-title">
				<a href="./transaction" class="btn btn-primary">Deposit or Withdraw Balance</a>
			</h5>

		</div>
	</div>



	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>
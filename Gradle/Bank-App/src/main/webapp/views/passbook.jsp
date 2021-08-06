<%@ page import="com.techlab.models.BankTransaction"
	import="java.time.format.DateTimeFormatter" import="java.util.*"
	language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
	java.text.DateFormat df = new java.text.SimpleDateFormat("dd/MM/yyyy");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
	<%
		List<BankTransaction> transactionList = (List<BankTransaction>) request.getAttribute("transactionList");
		request.setAttribute("transactionList", transactionList);
	%>
	<a class="btn btn-primary float-left col-2" href="./home">Home</a>
	<h1 align="center">Your Passbook</h1>
	<a class="btn btn-primary float-right col-2" href="./exportCSV">Export</a>
	<br>

	<br>
	<table class="table table-bordered table-dark">
		<thead>
			<tr>
				<th scope="col">Amount</th>
				<th scope="col">Type</th>
				<th scope="col">Date</th>
			</tr>
		</thead>
		<tbody>
			<%
				for (int i = 0; i < transactionList.size(); i++) {
				out.print("<tr>" + "<th scope='row'>" + transactionList.get(i).getAmount() + "</th>" + "<td>"
				+ transactionList.get(i).getType() + "</td>" + "<td>"
				+ transactionList.get(i).getDate().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")).toString()
				+ "</td>" + "</tr>");
			}
			%>
		</tbody>
	</table>
</body>
</html>
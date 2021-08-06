<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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

	<h1>Depost/Withdraw Money</h1>
	<s:form action="dotransaction" method="post">
		<s:textfield name="transaction.amount" label="Amount" />
		<s:radio id="radiobutton" name="transaction.type"
			list="#{'W' : 'Withdraw', 'D' : 'Deposit'}" label="Type" />
		<s:submit value="Submit" />
	</s:form>


</body>
</html>
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
</style>
</head>
<body>
	<h1>Register a New Account</h1>
	<s:form action="doregister" method="post">
		<s:hidden name="id" />
		<s:textfield name="name" label="name" />
		<s:textfield name="balance" label="Balance" />
		<s:password name="password" label="Password" />
		<s:password name="confirmpassword" label="Confirm Password" />
		<s:submit value="Create Account" />
	</s:form>
</body>
</html>
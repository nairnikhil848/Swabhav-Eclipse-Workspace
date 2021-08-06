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
	<h2>Session</h2>
	<h3>
		Old Count :
		<s:property value="oldCount" />
	</h3>
	<h3>
		New Count :
		<s:property value="newCount" />
	</h3>


</body>
</html>
<%@ page import="java.util.*" 
	language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Beer Recommendation JSP</h1>
	<p>
	<%
		List<String> styles = (List<String>)request.getAttribute("styles");
		Iterator<String> it = styles.iterator();
		while(it.hasNext()){
			out.print("<br>try: "+ it.next());
		}
	%>
</body>
</html>
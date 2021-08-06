<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Struts 2 login validation example using Captcha</title>
<script type="text/javascript">
	function generateNewCaptcha() {
		document.getElementById("capImg").setAttribute("src", "");
		document.getElementById("capImg").setAttribute("src",
				"loadCaptcha?date=" + new Date());
	}
</script>
</head>
<body>
	<h1>Struts 2 login validation example using Captcha</h1>



	<form action="login" method="post">
		UserName : <input type="text" name="userId" label="Name" /><br>
		Password : <input type="password" name="pass" label="Password" /><br>
		<img id="capImg" src="loadCaptcha"  />
		<button type="button" onclick="generateNewCaptcha();">Refresh</button>
		<br> 
		Enter Captcha<input type="text" name="captcha" /><br>
		<s:property value="msg" />
		<br> <input type="submit" value="Login" />
	</form>

</body>
</html>
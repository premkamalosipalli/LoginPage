<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="username" class="com.bluesky.training.LoginServlet">
		<jsp:setProperty name="username" property="*" />
		Your User Name and Password:
		<jsp:getProperty property="username" name="username"/>
		<jsp:getProperty property="password" name="username"/>
	</jsp:useBean>
</body>
</html>
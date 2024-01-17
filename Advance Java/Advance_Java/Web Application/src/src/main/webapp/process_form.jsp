<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:setProperty property="*" name="player"/>
<h5>Status Mesg : ${sessionScope.player.validateAndAddPlayer()}</h5>>
</body>
</html>
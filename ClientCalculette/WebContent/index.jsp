<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="CalculServlet">
		X: <input type="text" name="x"></br> Y: <input type="text" name="y"></br>
		<input type="submit" value="valider">

	</form>

	<c:if test="${!empty(resultat)}">
		RESULTAT ADDITION: ${resultat} </br>

		RESULTAT SOUSTRACTION: ${resultatsous} </br>

		RESULTAT DIVISION: ${resultatdiv} </br>
	</c:if>
	
</body>
</html>
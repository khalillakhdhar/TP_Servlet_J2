<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calcule</title>
</head>
<body>
<form action="Calculeservlet" method="post">
valeur1 <input type="number" name="a" min="1"><br>
valeur2<input type="number" name="b" min="1"> <br>
<input type="submit" value="calculer">


</form>
<br>


<%
if(request.getAttribute("resultat")!=null)
{
String message=(String) request.getAttribute("resultat");
out.println(message);
}
%>

</body>
</html>
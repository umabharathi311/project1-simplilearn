<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flights List</title>
</head>
<body>
<h3 align="right"><a href="1.html">back</a></h3>
<h1 align="center">Available Flights</h1>
<table border="1" cellpadding="30%" align="center" bgcolor="skyblue">
<tr>
<th>FlightNumber</th>
<th>Source</th>
<th>Destination</th>
<th>Time</th>
<th>Duration</th>
<th>Price</th>
</tr>
	<c:forEach var="items" items="${flightlist }">
	<tr>
	<td>${items.flightNumber}</td>
	<td>${items.source}</td>
	<td>${items.destination}</td>
	<td>${items.time}</td>
	<td>${items.duration}</td>
	<td>${items.price}</td>
	</tr>
	</c:forEach>
	
</table>
<br><br>
<h2 align="center">Please enter the flight you want to delete</h2>
<h2><form action="delete" method="post" align="center">
Flight number:<input type="number" name="flightnos"><br><br>
<input type="submit" value="Delete" name="delete">
</form></h2>
</body>
	</html>
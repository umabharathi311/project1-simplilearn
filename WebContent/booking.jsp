<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flights List</title>
</head>
<body>
<h3 align="right"><a href="index.html">back</a></h3>
<hl align="center">Available Flights</hl>
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
<td>${items.flightNumber }</td>
<td>${items.source }</td>
<td>${items.destination }</td>
<td>${items.time }</td>
<td>${items.duration }</td>
<td>${items.price }</td>
</tr>
</c:forEach>
</table>
<from action="Payment" method="post" align="center">
Name:<input type="text name="name"><br><br>
Phone:<input type ="number" name="phone"><br><br>
Flight Number:<input type="number" name="flight"><br><br>
<h3>Please pProvide Correct Flight Number to avoid further Discrepancies</h3>
<input type="submit" value="Proceede to Payment">
</from>
</body>
	</html>
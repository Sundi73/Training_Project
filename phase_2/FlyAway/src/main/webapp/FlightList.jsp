<%@  page  language="java"  contentType="text/html;  charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE  html>
<%@  page  import="java.util.*"  %>
<html>
<head>
<meta  charset="ISO-8859-1">
<title>Flight  List</title>
</head>
<body >
<br>
<a  href=HomePage.jsp  style="color:black;text-decoration:none;font-size:35px;font- weight:bold;">Flight  Booking</a>
<br><br>
<%
@SuppressWarnings("unchecked")
List<String[]>  flights=(List<String[]>)session.getAttribute("flights");
if(flights!=null){
%>

<h1>Available  Flights</h1>

<table border="1">
<tr>




</tr>



<%
for(String[]  flight:flights){
%>

<th>Name</th>
<th>Time</th>
<th>Price</th>








<tr>
<td><%=flight[0]%></td>
<td><%=flight[1]%></td>
<td><%=flight[2]%></td>
</tr>

</table>
<a  href=BookFlight.jsp>Book  Now</a>
<%
}
%>

<%
}

else

{

%>

<h2>There is no flight available</h2>

<%
}
%>

</body>
</html>
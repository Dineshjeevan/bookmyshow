<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table  border="1px" >

<tr >
<th>booking id</th>
<th>customer name</th>
<th>movie name</th>
<th>no of tickets</th>
<th>seat number</th>
<th>ticket price</th>
</tr>


<%List<Bookmyshow> list=(List<Bookmyshow>)request.getAttribute("data"); %>
<%for(Bookmyshow b1:list){ %>
<tr>
<td><%=b1.getBookingid() %></td>
<td><%=b1.getCustomer_name() %></td>
<td><%=b1.getMovie_name() %></td>
<td><%=b1.getNo_of_ticket() %></td>
<td><%=b1.getSeat_number() %></td>
<td><%=b1.getTicket_price()  %></td>
</tr>
<%} %>

</table>
</body>
</html>
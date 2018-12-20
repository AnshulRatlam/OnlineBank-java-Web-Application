<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.util.ArrayList,Bean.My_Bean" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="head_link.jsp" %>
</head>
<body>
<%@include file="header.jsp" %>

<table class="table table-hover">
 <tr><th>UID</th><th>Name</th><th>Email</th><th>Address</th><th>Mob</th><th>Balance</th></tr>
 <% 
 ArrayList<My_Bean> list=(ArrayList<My_Bean>)request.getAttribute("LIST");
 
 %>
 
 <%
   for(My_Bean ee:list)
   {
	  %>
   	 <tr>
   	<td> <% out.println(ee.getUid()); %> </td>
	<td> <%=ee.getName()%> </td>
	 <td><%=ee.getEmail()%> </td>
	 <td><%=ee.getAddress()%> </td>
	 <td><%=ee.getMob()%> </td>
	 <td><%=ee.getBalance()%> </td>
	 <tr/>
	 <%
	 }
  %>
  </table></div>
  
</body>
</html>
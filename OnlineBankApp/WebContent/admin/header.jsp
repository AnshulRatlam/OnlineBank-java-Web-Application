<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<%
response.addHeader("pragma", "no-cache");
response.addHeader("cache-control", "no-store");
response.addHeader("expire", "0");

%>

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">City Bank</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="Admin_panel.jsp">Home</a></li>
      <li><a href="create_account.jsp">Create Customer Account</a></li>
      <li><a href="../Cust_view">View Detail Account</a></li>
      
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="create_account.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="logout.jsp"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
    </ul>
  </div>
  
</nav>
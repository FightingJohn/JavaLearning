<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>

<%@ page isErrorPage="true"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

  </head>
  
  <body>
  
  <% Exception e = pageContext.getException(); %>
  <%= e.getMessage() %>
  <% e.printStackTrace(); %>
     <br>
  </body>
</html>

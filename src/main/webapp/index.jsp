<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Insert title here</title>
</head>
<body>
<h1>Display Data</h1>
<br>





<%
 String val=request.getParameter("Fname");
 String val1=request.getParameter("Lname");
 out.println("<div class=\"w3-container w3-red w3-cell\">");
 out.println("<h2>Your Name:</h2>"  );
 out.println("</div>");
 out.println("");
 out.println("<div class=\"w3-container w3-green w3-cell\">");
 out.println("<center>"+val + val1+"+</center>");
 out.println("</div>");
%>
  
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Thankyou!Your Feedback is Submitted Sucessfully.</h1>
<a href="./show">Profile</a>
<% Bean f=new Bean(); %>
<table align="center">
<tr><th>FeedBack1</th><th>Feedback2</th></tr>
<tr><td><%=f.getF1() %></td><td><%= f.getF2() %>
</table>

</body>
</html>
<%@ page import="webapp.User" %>
<html>
<head>
    <title>Registered User</title>
</head>
<body>
<h1>Registered User</h1>

<% //change
    User user = new User();%>

Profile:
<%= user.getUname() %>

<p>Your first name is
    <jsp:getProperty name="user" property="fname" />
    .</p>
<p>Your last name is
    <jsp:getProperty name="user" property="lname" />.</p>
<p>Your user id is
    <jsp:getProperty name="user" property="uname" />.</p>
<p>Your age is
    <jsp:getProperty name="user" property="age" />.</p>
<p>
    <jsp:getProperty name="user" property="ename" />
    @<jsp:getProperty name="user" property="edoman" />
    .<jsp:getProperty name="user" property="ecom" /> </p>

You selected
<%
    if(user.isReciveEmail()){
%>
You wish to get e-mails.
<%
}else{
%>
You don't wish to get e-mails.
<%
    }
%>
<a href="Registration.jsp">Back to Welcome Page</a>
<%@ include file="/WEB-INF/footer.jspf" %>
</body>
</html>
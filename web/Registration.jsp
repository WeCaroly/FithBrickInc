<%@ page import="webapp.User" %>

<jsp:forward page="form.html"/>

<jsp:forward page="Results.jsp">
    <jsp:param name="submitTime"
               value="<%=(new java.util.Date()).toString()%>" />
</jsp:forward>
<html>
<head>
    <meta name="Cache-control" content="no-cache">
    <title>Welcome</title>
</head>

<body>
<h1>Welcome</h1>


</body>
</html>

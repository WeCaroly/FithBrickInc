<%@ page import="webapp.User" %>

<%
    User user = (User) request.getAttribute("");
    String reqType = request.getParameter("reqType");
    if (user == null && reqType == null) {
%>
<jsp:forward page="form.html"/>
<%
} else if (user == null && reqType != null) {
%>
<jsp:forward page="Results.jsp">
    <jsp:param name="submitTime"
               value="<%=(new java.util.Date()).toString()%>" />
</jsp:forward>
<%
    }
%>
<html>
<head>
    <meta name="Cache-control" content="no-cache">
    <title>Welcome</title>
</head>

<body>
<h1>Welcome</h1>
<a href="form.html">Click to Register</a>
<%@ include file="/WEB-INF/footer.jspf" %>
</body>
</html>

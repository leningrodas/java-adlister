
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Admin Dash" />
    </jsp:include>
    <title>admin</title>
</head>
<body>
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />

    <div class="container">
        <h1>Viewing your Admin-DashBoard.</h1>
        <p>Is Admin: ${sessionScope.isAdmin}</p>
    </div>


</body>
</html>

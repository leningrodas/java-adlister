<%--
  Created by IntelliJ IDEA.
  User: macowner
  Date: 1/21/21
  Time: 3:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>pick a colors</title>
</head>
<body>
<h1>any color!</h1>
<form action = "/viewcolor" method="post">
    <label for="color">you picked:</label>
    <input type="text" name="color" id="color">
    <button type="submit">submit</button>
</form>

</body>
</html>

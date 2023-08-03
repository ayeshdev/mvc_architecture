<%--
  Created by IntelliJ IDEA.
  User: TUF
  Date: 7/27/2023
  Time: 9:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/main.css">
</head>
<body>
<h1>Login...</h1>
<form method="post" action="login">
<table>
    <tr>
        <th>Username:</th>
        <td><input type="text" name="email"></td>
    </tr>
    <tr>
        <th>Password:</th>
        <td><input type="password" name="passwords"></td>
    </tr>
    <tr>
        <td></td>
        <td><button type="submit">Login</button></td>
    </tr>
</table>
</form>
</body>
</html>

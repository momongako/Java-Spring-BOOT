<%--
  Created by IntelliJ IDEA.
  User: MULTICAMPUS PC
  Date: 7/27/2022
  Time: 9:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP From</title>
</head>
<body>
    <form method="post" action="User.jsp">
        <a>Username:</a><input type="text" name="username" placeholder="Username"><br/>
        <a>Password:</a><input type="password" name="password" placeholder="Password"><br/>
        <select name="country">
            <option>Brazil</option>
            <option>france</option>
            <option>Germany</option>
            <option>india</option>
        </select><br/>
        <h3>Program language</h3>
        <input type="checkbox" name="country" value="java">java
        <input type="checkbox" name="country" value="C#">C#
        <input type="checkbox" name="country" value="PHP">PHP
        <input type="checkbox" name="country" value="Ruby">Ruby
        <input type="submit" value="go">
    </form>
</body>
</html>

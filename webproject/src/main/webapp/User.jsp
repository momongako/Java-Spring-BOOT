        <%--
  Created by IntelliJ IDEA.
  User: MULTICAMPUS PC
  Date: 7/27/2022
  Time: 9:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>JSP REQUEST</title>
</head>
<body>
<%
    String name = request.getParameter("username");
    String password = request.getParameter("password");
    out.println("username=" + name + " password=" + password);

    String[] langs = request.getParameterValues("country");

    out.println(langs.toString());
//    for (int i = 0; i < langs.length; i++) {
//        out.println(subject[i] + "\n");
//    }

    String[] langC = request.getParameterValues("country");
    for (int i = 0; i < langC.length; i++) {
        out.println(langC[i] + "\n");
    }
%>
</body>
</html>

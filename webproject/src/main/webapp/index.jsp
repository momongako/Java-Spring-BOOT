<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
    <%="welcome to dataFlair"%><br/>
    <%="Have a nice day."%><br/>
    5+5 = <%=5+5 %>
</h1>
    <%
        int a=1;
        int b=2;
        int c=3;
        out.println( "the number "+a    *b*c);
    %>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>
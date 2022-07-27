<%--
  Created by IntelliJ IDEA.
  User: MULTICAMPUS PC
  Date: 7/27/2022
  Time: 2:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ page import ="net.javaguides.usemanagement.model.UserDao"%>--%>
<%@ page import="usemanagement.dao.UserDao" %>
<%@ page import="usemanagement.model.User" %>
<html>
<head>
  <title>Title</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
        crossorigin="anonymous">

</head>
<body>
<header>
  <nav class="navbar navbar-expand-md navbar-dark" style="background-color:tomato;">
    <div>
      <a href="http://www.javaguides.net" class="navbar-brand"> User Management App</a>
    </div>
    <ul class="nav navbar-nav">
      <li>
        <a href="<%=request.getContextPath()%>/list" class="navbar-link" data-toggle="collapse" data-target=".navbar-col">User</a>
      </li>
    </ul>

  </nav>
  <br/>
  <form action="Result_UserListbtID.jsp">
    <div class="input-group mb-3">
      <input type="text" class="form-control" name="search">
      <button class="btn btn-outline-secondary" type="submit" >Tìm kiếm</button>
    </div>
  </form>

</header>

<%--<table className="table">--%>
<%--  <thead className="thead-inverse">--%>
<%--  <tr>--%>
<%--    <th scope="col">ID</th>--%>
<%--    <th>Name</th>--%>
<%--    <th>Email</th>--%>
<%--    <th>Country</th>--%>

<%--  </tr>--%>
<%--  </thead>--%>

<%--  <tbody>--%>
<%--  <%--%>
<%--    UserDao ud = new UserDao();--%>
<%--   int id =Integer.parseInt(request.getParameter("sreach"));--%>

<%--    User u = ud.selectUser(id);--%>
<%--    --%>
<%--  %>--%>
<%--  <tr>--%>
<%--    <td><%=u.getId()%>--%>
<%--    </td>--%>
<%--    <td><%=u.getName()%>--%>
<%--    </td>--%>
<%--    <td><%=u.getEmail()%>--%>
<%--    </td>--%>
<%--    <td><%=u.getCountry()%>--%>
<%--    </td>--%>
<%--  </tr>--%>
<%--  </tbody>--%>
<%--</table>--%>

</body>
</html>

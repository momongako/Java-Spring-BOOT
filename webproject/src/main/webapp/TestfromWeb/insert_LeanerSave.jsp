<%--
  Created by IntelliJ IDEA.
  User: MULTICAMPUS PC
  Date: 7/27/2022
  Time: 11:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <td><a>Mã Học Viên:</a></td>
        <td> <%
            String MSV = request.getParameter("MSV");

            out.println(MSV);
        %></td>
    </tr>
    <tr>
        <td><a>Họ Tên:</a></td>
        <td><%
        String name = request.getParameter("name");
        out.println(name);
        %></td>
    </tr>
    <tr>
        <td><a>Lớp:</a></td>
        <td>
            <%
                String[] langC = request.getParameterValues("class1");
                for (int i = 0; i < langC.length; i++) {
                    out.println(langC[i]);
                }
            %>
        </td>
    </tr>
    <tr>
        <td><a>Giới tính:</a></td>
        <td>
            <%=request.getParameter("sex")%>

        </td>
    </tr>
    <tr>
        <td><a>Môn Học:</a></td>
        <td>


            <%
                String s[] = request.getParameterValues("country");
                for (int i = 0; i < s.length; i++) {
                    out.println(s[i]);
                }
            %>
        </td>

    </tr>
    <tr>
        <td colspan="2"><input type="submit" value="Kiểm tra thông tin"></td>
    </tr>
</table>
</body>
</html>

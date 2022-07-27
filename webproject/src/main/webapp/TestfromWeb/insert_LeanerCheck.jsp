<%--
  Created by IntelliJ IDEA.
  User: MULTICAMPUS PC
  Date: 7/27/2022
  Time: 10:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="insert_LeanerSave.jsp">
  <table border="1">
    <tr>
      <td><a>Mã Học Viên:</a></td>
      <td><input type="text" name="MSV" placeholder="HV01"></td>
    </tr>
    <tr>
      <td><a>Họ Tên:</a></td>
      <td><input type="text" name="name" placeholder="Nguyễn thanh tâm"></td>
    </tr>
    <tr>
      <td><a>Lớp:</a></td>
      <td>
          <select name="class1">
          <option>14TH1</option>
          <option>14TH4</option>
          <option>14TH3</option>
          <option>14TH2</option>
      </select>
      </td>
    </tr>
    <tr>
      <td><a>Giới tính:</a></td>
      <td>
        Nam : <input type="radio" name="sex" value="nam">
        Nữ : <input type="radio" name="sex" value="nu">
      </td>
    </tr>
    <tr>
      <td><a>Môn Học:</a></td>
      <td>
        <input type="checkbox" name="country" value="java">java
        <input type="checkbox" name="country" value="C#">C#
        <input type="checkbox" name="country" value="PHP">PHP
        <input type="checkbox" name="country" value="Ruby">Ruby
      </td>

    </tr>
    <tr>
      <td colspan="2"><input type="submit" value="Kiểm tra thông tin"></td>
    </tr>
  </table>
</form>

</body>
</html>

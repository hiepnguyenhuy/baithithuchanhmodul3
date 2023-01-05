<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 01/05/2023
  Time: 9:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<h1>Edit Nhân Viên</h1>
<form method="post" >
  <input name="id" placeholder="input id" value="${nv.id}" readonly><br>
  <input name="name" placeholder="input name" value="${nv.name}"><br>
  <input name="email" placeholder="input email" value="${nv.email}"><br>
  <input name="address" placeholder="input address" value="${nv.address}"><br>
  <input name="phonenumber" placeholder="input phone number" value="${nv.phonenumber}"><br>
  <input name="salary" placeholder="input salary" value="${nv.salary}"><br>
  <input name="iddepartment" placeholder="input salary" value="${nv.iddepartment}"><br>
  <button type="submit">Edit</button>
</form>
</body>
</html>

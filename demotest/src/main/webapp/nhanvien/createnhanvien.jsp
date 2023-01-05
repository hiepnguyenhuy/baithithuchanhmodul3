<%--
  Created by IntelliJ IDEA.
  User: johntoan98gmail.com
  Date: 31/12/2021
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" >
    <table>
        <tr>
            <td><input name="name" placeholder="Enter Name"></td>
        </tr>
        <tr>
            <td><input name="email" placeholder="Enter Email"></td>
        </tr>
        <tr>
            <td><input name="address" placeholder="Enter Address"></td>
        </tr>

        <tr>
            <td><input name="phonenumber" placeholder="Enter Phone Number"></td>
        </tr>
        <tr>
            <td><input name="salary" placeholder="Enter Salary"></td>
        </tr>

        <tr>
<%--            <td>--%>
<%--                <select name="idClassRoom">--%>
<%--                    <c:forEach items="${listClass}" var="c">--%>
<%--                        <option value="${c.id}">${c.name}</option>--%>
<%--                    </c:forEach>--%>
<%--                </select>--%>
<%--            </td>--%>
    <td><input name="iddepartment" placeholder="Enter iddepartment"></td>
        </tr>
    </table>
    <button type="submit">Create</button>
</form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 01/04/2023
  Time: 4:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h2>Danh sách học viên</h2>
    <button ><a href="/createnhanvien">Create</a></button>
    <form action="/findnhanvien" method="get">
        <h2 >
            <input  name="search">
            <button type="submit" >Search</button> </h2>
    </form>
    <table class="table table-striped">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Address</th>
            <th>Phone Number</th>
            <th>Salary</th>
            <th>Department</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${listnhanvien}" var="nv">
            <tr>
                <td>${nv.id}</td>
                <td>${nv.name}</td>
                <td>${nv.email}</td>
                <td>${nv.address}</td>
                <td>${nv.phonenumber}</td>
                <td>${nv.salary}</td>
                <td>${nv.iddepartment}</td>
                <td><a href="/editnhanvien?idnhanvien=${nv.id}" class="btn btn-warning" >Edit</a></td>
                <td><a href="/deletenhanvien?idnhanvien=${nv.id}" class="btn btn-danger">Delete</a></td>
            </tr>

        </c:forEach>
        </tbody>

    </table>
</div>

</body>
</html>
